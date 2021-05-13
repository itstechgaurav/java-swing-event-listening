package com.company;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public static int WIDTH = 400;
    public static int HEIGHT = 600;

    private Controls controls;
    private TextControl textControl;

    App() {
        super("Testing events");
        init();
        buildUI();
        setVisible(true);
    }

    void init() {
        setSize(new Dimension(App.WIDTH, App.HEIGHT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    void buildUI() {
        controls = new Controls();
        textControl = new TextControl();

        add(controls, BorderLayout.NORTH);
        add(textControl, BorderLayout.CENTER);
    }
}
