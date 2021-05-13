package com.company;

import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {
    private JButton hello, world;
    static EventBus bus;

    Controls() {
        init();
        buildUI();
    }

    public static void addEventBus(EventBus newBus) {
        bus = newBus;
    }

    void init() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        hello = new JButton("Hello");
        world = new JButton("World");

        add(hello);
        add(world);

        hello.addActionListener(e -> {
            bus.emmit("hello clicked");
        });

        world.addActionListener(e -> {
            bus.emmit("world clicked");
        });
    }
}
