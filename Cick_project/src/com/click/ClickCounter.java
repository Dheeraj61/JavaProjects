package com.click;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounter {

    private int count = 0;
    private JLabel countLabel;
    private JButton clickButton;

    public ClickCounter() {
        // Create the main frame (window)
        JFrame frame = new JFrame("Click Counter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Create the label to display the count
        countLabel = new JLabel("Clicks: 0");
        countLabel.setFont(countLabel.getFont().deriveFont(24.0f)); // Make the font bigger

        // Create the button
        clickButton = new JButton("Click Me!");

        // Add an ActionListener to the button
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code runs every time the button is clicked
                count++;
                countLabel.setText("Clicks: " + count);
            }
        });

        // Add components to the panel
        panel.add(countLabel);
        panel.add(clickButton);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClickCounter();
            }
        });
    }
}