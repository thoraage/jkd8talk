package no.arktekk.talkjdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaLambda {

    {
        JFrame frame = new JFrame();
        final JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setText("Go away");
            }
        });
        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JavaLambda();
    }

}
