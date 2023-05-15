package org.lorenzo.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    private List<Point> points;

    public DrawingPanel() {
        setBackground(Color.WHITE);
        points = new ArrayList<>();

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                points.add(e.getPoint());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

    public void clear() {
        points.clear();
        repaint();
    }

    public void saveDrawingAsImage(String fileName) {
        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        paint(g2d);
        g2d.dispose();

        try {
            File file = new File(fileName);
            ImageIO.write(image, "png", file);
            JOptionPane.showMessageDialog(this, "Logo saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving logo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void init() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Logo Creator");
                frame.setSize(220, 220);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                DrawingPanel drawingPanel = new DrawingPanel();

                JButton clearButton = new JButton("Clear");
                clearButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        drawingPanel.clear();
                    }
                });

                JButton saveButton = new JButton("Save");
                saveButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        int result = fileChooser.showSaveDialog(frame);
                        if (result == JFileChooser.APPROVE_OPTION) {
                            String fileName = fileChooser.getSelectedFile().getPath();
                            drawingPanel.saveDrawingAsImage(fileName);
                        }
                    }
                });

                JPanel buttonPanel = new JPanel();
                buttonPanel.add(clearButton);
                buttonPanel.add(saveButton);

                frame.getContentPane().setLayout(new BorderLayout());
                frame.getContentPane().add(drawingPanel, BorderLayout.CENTER);
                frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

                frame.setVisible(true);
            }
        });
    }
}