package com.chap6;

import javax.swing.*;

/**
 * @author gjx
 * @create 2021-12-23 11:39
 */
public class FramMain extends JFrame {

    public FramMain(String title) {
        super(title);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        FramMain framMain = new FramMain("房屋管理系统");

    }

}
