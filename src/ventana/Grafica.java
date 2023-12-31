/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Usuario
 */
public final class Grafica extends javax.swing.JPanel {
    private double x;
    private double y;
    private double angulo;
    private final int radio = 10;

    public Grafica(double x, double y, double angulo) {
        this.x = x*15;
        this.y = y*15;
        this.angulo=angulo;
    }

    
    
    /**
     * Creates new form Grafica
     */
    public Grafica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public double obtenerY(double magnitud, double angulo){
        return magnitud*Math.sin(Math.toRadians(angulo));
    }
    
    public double obtenerX(double magnitud, double angulo){
        return magnitud*Math.cos(Math.toRadians(angulo));
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(150, 150);
        
        g2d.setColor(Color.GRAY);
        g2d.drawLine(-150, 0, 150, 0);
        g2d.drawString("X", 140, 0);
        
        g2d.drawLine(0, -150, 0, 150);
        g2d.drawString("Y", 0, -140);
        
        g2d.setColor(Color.BLUE);
        g2d.fillArc(-radio, -radio, radio * 2, radio * 2, 0, (int) Math.round(angulo));
        
        g2d.setStroke(new BasicStroke(2));
        g.setColor(Color.black);
        g2d.drawLine(0, 0,((int) Math.round(x)), -((int) Math.round(y)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
