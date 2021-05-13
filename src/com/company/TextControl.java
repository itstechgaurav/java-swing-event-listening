package com.company;

import javax.swing.*;
import java.awt.*;

public class TextControl extends JPanel implements EventBus {
    private JTextArea textPane;
    TextControl() {
        init();
        buildUI();
    }

    void init() {
        Controls.addEventBus(this);
    }

    void buildUI() {
        textPane = new JTextArea(2, 10);
        add(textPane, BorderLayout.CENTER);
    }

    @Override
    public void emmit(String msg) {
        textPane.append(msg + "\n");
    }
}
