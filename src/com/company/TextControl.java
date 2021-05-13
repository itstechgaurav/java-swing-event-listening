package com.company;

import javax.swing.*;
import java.awt.*;

public class TextControl extends JPanel {
    private JTextArea textPane;
    TextControl() {
        init();
        buildUI();
    }

    void init() {

    }

    void buildUI() {
        textPane = new JTextArea(2, 10);
        add(textPane, BorderLayout.CENTER);
    }
}
