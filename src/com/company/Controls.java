package com.company;

import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {
    private JButton hello, world;

    Controls() {
        init();
        buildUI();
    }

    void init() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        hello = new JButton("Hello");
        world = new JButton("World");

        add(hello);
        add(world);
    }
}
