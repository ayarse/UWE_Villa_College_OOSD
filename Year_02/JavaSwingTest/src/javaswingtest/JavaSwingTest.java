/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingtest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  


/**
 *
 * @author ayasnasih
 */
public class JavaSwingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f=new JFrame(); 
         
        JTextField username = new JTextField(""); 
        JPasswordField password = new JPasswordField();
        
        JLabel lblUsername=new JLabel("Username");  
        JLabel lblPassword=new JLabel("Password");   
        JLabel lblError=new JLabel("");  
        
        lblUsername.setBounds(30, 10, 100, 40);
        username.setBounds(30, 40, 250, 40);
        lblPassword.setBounds(30,80,250,40);
        password.setBounds(30, 120, 250, 40);
        JButton b=new JButton("Login"); 
        b.setBounds(30,180,250, 40);
        lblError.setBounds(60,220, 250, 40);
        
        f.add(lblUsername);
        f.add(username);
        f.add(lblPassword);
        f.add(password);
        f.add(b); 
        f.add(lblError);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(username.getText().equals("username") && new String(password.getPassword()).equals("password")) {
                    lblError.setText("Successful");
                } else {
                    lblError.setText("Error. Wrong password."); 
                }
                 
            }  
        });
        
        f.setSize(330,330); 
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
