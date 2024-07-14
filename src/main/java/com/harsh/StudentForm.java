package com.harsh;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame{
    private JLabel mainHeadingLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel phoneLabel;
    private JTextField nameTf;
    private JTextField emailTf;
    private JTextField passwordTf;
    private JTextField phoneTf;
    private JButton submitButton;
    private JPanel mainPanel;


    public StudentForm() {
        setContentPane(mainPanel);
        setTitle("Student Form");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTf.getText();
                String email = emailTf.getText();
                String password = passwordTf.getText();
                int phone = Integer.parseInt(phoneTf.getText());

                Student tempStd = new Student(name, email, password, phone);

                System.out.println(tempStd.toString());
            }
        });
    }
}
