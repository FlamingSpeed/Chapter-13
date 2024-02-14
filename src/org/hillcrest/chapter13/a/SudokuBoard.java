package org.hillcrest.chapter13.a;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SudokuBoard extends JFrame {
    private JTextField[][] cells;

    public SudokuBoard() {
        setTitle("Sudoku Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 450);
        setLayout(new GridLayout(9, 9));

        cells = new JTextField[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cell.setPreferredSize(new Dimension(50, 50));
                cell.addKeyListener(new SudokuKeyListener());
                cells[i][j] = cell;
                add(cell);
            }
        }

        setVisible(true);
    }

    private class SudokuKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            JTextField source = (JTextField) e.getSource();
            if (!(c >= '1' && c <= '9')) {
                e.consume(); // Ignore the input
            } else if (source.getText().length() > 0) {
                source.setText(""); // Replace existing number
            }
        }
    }

    public static void main(String[] args) {
        new SudokuBoard();
    }
}