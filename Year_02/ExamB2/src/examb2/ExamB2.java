package examb2;

import java.sql.*;
import java.util.HashMap;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ExamB2 {

    private static Connection conn;

    public static void main(String[] args) {
        try {
            // Open a connection to MySQL, Create database and fill with some sample data.
            initConnection();
            seedDatabase();

            // Get the students' names and average from database
            PreparedStatement stmt = conn.prepareStatement("SELECT students.name AS `Name`, AVG(marks) AS `Average` FROM marks LEFT JOIN students ON marks.student_id=students.id GROUP BY marks.student_id");
            ResultSet rs = stmt.executeQuery();

            // Sort the results into passers and failures
            HashMap passers = new HashMap<String, Double>();
            HashMap failures = new HashMap<String, Double>();
            while (rs.next()) {
                String studentName = rs.getString("Name");
                Double studentAverage = rs.getDouble("Average");
                if (studentAverage < 80.0) {
                    failures.put(studentName, studentAverage);
                } else {
                    passers.put(studentName, studentAverage);
                }
            }

            // Show output with passers and failures separately
            System.out.println("*** PASSERS (OVER 80% AVG) ***");
            passers.forEach((k, v) -> {
                System.out.println(k + " : " + v);
            });
            System.out.println("\n*** FAILURES (BELOW 80% AVG) ***");
            failures.forEach((k, v) -> {
                System.out.println(k + " : " + v);
            });
        } catch (SQLException ex) {
            System.out.println("An error has occured. Check your database.");
        }
    }

    private static void initConnection() {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Cannot load MySQL driver");
            }
            String connectionUrl = "jdbc:mysql://localhost/?user=root&password=";
            conn = DriverManager.getConnection(connectionUrl);
        } catch (SQLException ex) {
            System.out.println("Database connection error. Are you sure MySQL is running?");

        }
    }

    private static void seedDatabase() throws SQLException {
        // Create a database called students, with 2 tables named students and marks.
        // and fills the tables with some sample data
        String[] sql = {
            "CREATE DATABASE `students`;",
            " CREATE TABLE `students`.`students` (`id` serial,`name` varchar(255) NOT NULL,`dob` date,`contactno` varchar(255), PRIMARY KEY (id)); ",
            " CREATE TABLE `students`.`marks` (`id` serial,`student_id` bigint,`subject` varchar(255),`marks` double, PRIMARY KEY (id)); ",
            " INSERT INTO `students`.`students` (`name`, `dob`, `contactno`) VALUES ('Mariyam Amaanee', '1993-02-21', '7001001');",
            " INSERT INTO `students`.`students` (`name`, `dob`, `contactno`) VALUES ('Ahmed Riza', '1994-05-20', '7525250');",
            " INSERT INTO `students`.`students` (`name`, `dob`, `contactno`) VALUES ('Ibrahim Gasim', '1991-03-14', '7744752');",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (1, 'OOSD2', 75.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (1, 'Hybrid Intelligent System', 95.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (1, 'Data Structures', 77.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (1, 'Operating Systems', 99.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (2, 'OOSD2', 55.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (2, 'Hybrid Intelligent System', 45.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (2, 'Data Structures', 57.0);",
            " INSERT INTO `students`.`marks` (`student_id`, `subject`, `marks`) VALUES (2, 'Operating Systems', 49.0);"
        };

        try {
            for (String stmtStr : sql) {
                PreparedStatement createdb = conn.prepareStatement(stmtStr);
                createdb.executeUpdate();
            }
        } catch (Exception e) {
            // System.out.println("Databse creation failed");
        } finally {
            Statement stmt = conn.createStatement();
            stmt.execute("USE `students`");
        }

    }

}
