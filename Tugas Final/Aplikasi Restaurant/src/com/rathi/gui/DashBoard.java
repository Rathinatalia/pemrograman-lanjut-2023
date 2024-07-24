package com.rathi.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame {
    private JPanel panelMain;
    private JButton btnManageMenu;
    private JButton btnDaftarTransaksi;

    public DashBoard(String role) {
        this.setContentPane(panelMain);
        this.setMinimumSize(new Dimension(150,200));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Back");
        JMenuItem menuItemLogout = new JMenuItem("Ya");
        menu.add(menuItemLogout);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        menuItemLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().setVisible(true);
                dispose();
            }
        });

        btnManageMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Manage_Menu().setVisible(true);
                dispose();
            }

        });

        btnDaftarTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panelMain, "View Transactions button clicked");
                new Daftar_Transaksi().setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        DashBoard dashboard = new DashBoard("Waiter");
        dashboard.setVisible(true);
    }


}