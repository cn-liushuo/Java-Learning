package com.example.j_gui;

import javax.swing.*;
import java.awt.*;

public class F_LoginSwingUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Set background color and padding for the panel
        panel.setBackground(Color.decode("#f0f0f0"));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        // Add components to the panel with custom styles
        JLabel usernameLabel = new JLabel("Username：");
        usernameLabel.setFont(usernameLabel.getFont().deriveFont(18f));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(usernameLabel, gbc);

        JTextField usernameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 5, 0, 0);
        panel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password：");
        passwordLabel.setFont(passwordLabel.getFont().deriveFont(18f));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.insets = new Insets(20, 0, 0, 0);
        panel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(20, 5, 0, 0);
        panel.add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(loginButton.getFont().deriveFont(20f));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(20, 5, 0, 0);
        panel.add(loginButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
