/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import operaciones.Numero_complejo;
import ventana.Blanco;
import ventana.Grafica;

/**
 *
 * @author Usuario
 */
public class Test extends javax.swing.JFrame {
    private final Blanco reset = new Blanco();
    private Grafica graficado;
    private Numero_complejo res;
    /**
     * Creates new form temp
     */
    public Test() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        num_imag2 = new javax.swing.JTextField();
        norma2 = new javax.swing.JTextField();
        angulo2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Operacion = new javax.swing.JComboBox<>();
        BtnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num_real1 = new javax.swing.JTextField();
        num_imag1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        norma1 = new javax.swing.JTextField();
        angulo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        grafica = new javax.swing.JPanel();
        BtnCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        num_real = new javax.swing.JTextField();
        num_imag = new javax.swing.JTextField();
        norma = new javax.swing.JTextField();
        angulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        num_real2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de numeros complejos");
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(51, 51, 51));
        Fondo.setPreferredSize(new java.awt.Dimension(658, 420));

        num_imag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_imag2ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Forma Polar:");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Resultado");

        Operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        Operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionActionPerformed(evt);
            }
        });

        BtnReset.setBackground(java.awt.Color.orange);
        BtnReset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnReset.setForeground(new java.awt.Color(0, 0, 0));
        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("j");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("°");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("j");

        num_imag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_imag1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("°");

        norma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norma1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("j");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("°");

        grafica.setBackground(new java.awt.Color(255, 255, 255));
        grafica.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout graficaLayout = new javax.swing.GroupLayout(grafica);
        grafica.setLayout(graficaLayout);
        graficaLayout.setHorizontalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        graficaLayout.setVerticalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        BtnCalcular.setBackground(new java.awt.Color(51, 102, 0));
        BtnCalcular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Forma Rectangular:");

        angulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Forma Polar:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Forma Rectangular:");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(num_real, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(num_imag, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(norma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num_real1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(norma1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(angulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num_imag1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(norma2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(angulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                    .addComponent(num_real2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num_imag2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(BtnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCalcular))
                    .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_imag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_real1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_imag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(norma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(norma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_real2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(num_imag2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(norma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCalcular)
                    .addComponent(BtnReset))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        num_real.setText("");
        num_imag.setText("");
        norma.setText("");
        angulo.setText("");
        num_real1.setText("");
        num_imag1.setText("");
        norma1.setText("");
        angulo1.setText("");
        num_real2.setText("");
        num_imag2.setText("");
        norma2.setText("");
        angulo2.setText("");
        grafica.removeAll();
        grafica.setSize(300, 300);
        grafica.setBackground(Color.WHITE);
        cambiarPanel(reset, grafica);
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        try {
            
            
            if((!num_real.getText().isEmpty() && !num_imag.getText().isEmpty()) || (!num_real1.getText().isEmpty() && !num_imag1.getText().isEmpty())){           
                comprobarCasillas();
                Numero_complejo num=new Numero_complejo(Double.parseDouble(num_real.getText()), Double.parseDouble(num_imag.getText()), 0, 0);
                Numero_complejo num1=new Numero_complejo(Double.parseDouble(num_real1.getText()), Double.parseDouble(num_imag1.getText()), 0, 0);
                norma.setText(String.format("%." + 2 + "f",num.getReal()));
                angulo.setText(String.format("%." + 2 + "f",num.getAngulo()));
                norma1.setText(String.format("%." + 2 + "f",num1.getReal()));
                angulo1.setText(String.format("%." + 2 + "f",num1.getAngulo()));
                operaciones(num, num1);           
            }
            else if((!angulo.getText().isEmpty() && !norma.getText().isEmpty()) || (!angulo1.getText().isEmpty() && !norma1.getText().isEmpty())){           
                comprobarCasillas();
                Numero_complejo num=new Numero_complejo(0, 0, Double.parseDouble(norma.getText()), Double.parseDouble(angulo.getText()));
                Numero_complejo num1=new Numero_complejo(0, 0, Double.parseDouble(norma1.getText()), Double.parseDouble(angulo1.getText()));
                num_real.setText(String.format("%." + 2 + "f",num.getR()));
                num_imag.setText(String.format("%." + 2 + "f",num.getI()));
                num_real1.setText(String.format("%." + 2 + "f",num1.getR()));
                num_imag1.setText(String.format("%." + 2 + "f",num1.getI()));
                operaciones(num, num1);
            }   
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: solo se permiten números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void norma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_norma1ActionPerformed

    private void num_imag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_imag2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_imag2ActionPerformed

    private void anguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloActionPerformed

    private void num_imag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_imag1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_imag1ActionPerformed

    private void OperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OperacionActionPerformed

    public void operaciones(Numero_complejo num1, Numero_complejo num2){
        String operacion = (String) Operacion.getSelectedItem();
        try {
            switch(operacion){
                case "+":
                    res=num1.suma(num1, num2);
                    num_real2.setText(String.format("%." + 2 + "f",res.getR()));
                    num_imag2.setText(String.format("%." + 2 + "f",res.getI()));
                    norma2.setText(String.format("%." + 2 +"f",res.getReal()));
                    angulo2.setText(String.format("%." + 2 +"f",res.getAngulo()));
                    graficado = new Grafica(Double.parseDouble(num_real2.getText()), Double.parseDouble(num_imag2.getText()), Double.parseDouble(angulo2.getText()));
                    cambiarPanel(graficado, grafica);
                    break;
                case "-":
                    res=num1.resta(num1, num2);
                    num_real2.setText(String.format("%." + 2 + "f",res.getR()));
                    num_imag2.setText(String.format("%." + 2 + "f",res.getI()));
                    norma2.setText(String.format("%." + 2 + "f",res.getReal()));
                    angulo2.setText(String.format("%." + 2 + "f",res.getAngulo()));
                    graficado = new Grafica(Double.parseDouble(num_real2.getText()), Double.parseDouble(num_imag2.getText()), Double.parseDouble(angulo2.getText()));
                    cambiarPanel(graficado, grafica);
                    break;
                case "*":
                    res=num1.multiplicacion(num1, num2);
                    num_real2.setText(String.format("%." + 2 + "f",res.getR()));
                    num_imag2.setText(String.format("%." + 2 + "f",res.getI()));
                    norma2.setText(String.format("%." + 2 + "f",res.getReal()));
                    angulo2.setText(String.format("%." + 2 + "f",res.getAngulo()));
                    graficado = new Grafica(Double.parseDouble(num_real2.getText()), Double.parseDouble(num_imag2.getText()), Double.parseDouble(angulo2.getText()));
                    cambiarPanel(graficado, grafica);
                    if (Double.isNaN(res.getAngulo())) {
                        throw new ArithmeticException("¡Se ha producido NaN!");
                    }
                    break;
                case "/":
                    res=num1.division(num1, num2);
                    num_real2.setText(String.format("%." + 2 + "f",res.getR()));
                    num_imag2.setText(String.format("%." + 2 + "f",res.getI()));
                    norma2.setText(String.format("%." + 2 + "f",res.getReal()));
                    angulo2.setText(String.format("%." + 2 + "f",res.getAngulo()));
                    graficado = new Grafica(Double.parseDouble(num_real2.getText()), Double.parseDouble(num_imag2.getText()) , Double.parseDouble(angulo2.getText()));
                    cambiarPanel(graficado, grafica);
                    if (Double.isNaN(res.getAngulo())) {
                        throw new ArithmeticException("¡Se ha producido NaN!");
                    }
                    else if (Double.isNaN(res.getReal())) {
                        throw new ArithmeticException("¡Se ha producido NaN!");
                    }
                    else if (Double.isNaN(res.getI())) {
                        throw new ArithmeticException("¡Se ha producido NaN!");
                    }
                    else if (Double.isNaN(res.getR())) {
                        throw new ArithmeticException("¡Se ha producido NaN!");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Operación no válida.");
                    break;   
            }
        } catch (ArithmeticException e) {          
            if ("NaN".equals(norma2.getText())) {
                norma2.setText("0");
            }

            if ("NaN".equals(angulo2.getText())) {
                angulo2.setText("0");
            }

            if ("NaN".equals(num_real2.getText())) {
                num_real2.setText("0");
            }

            if ("NaN".equals(num_imag2.getText())) {
                num_imag2.setText("0");
            }
            JOptionPane.showMessageDialog(this, "Imposible division entre cero");
        }
    }
    
    public void comprobarCasillas(){
        if (num_real.getText().isEmpty()) {
            num_real.setText("0");
        }
        if (num_imag.getText().isEmpty()) {
            num_imag.setText("0");
        }
  
        if (num_real1.getText().isEmpty()) {
            num_real1.setText("0");
        }
        if (num_imag1.getText().isEmpty()) {
            num_imag1.setText("0");
        }
        
        if (num_imag2.getText().isEmpty()) {
            num_imag2.setText("0");
        }
        if (num_real2.getText().isEmpty()) {
            num_real2.setText("0");
        }
        
        if (norma.getText().isEmpty()) {
            norma.setText("0");
        }
        if (angulo.getText().isEmpty()) {
            angulo.setText("0");
        }
        
        if (norma1.getText().isEmpty()) {
            norma1.setText("0");
        }
        if (angulo1.getText().isEmpty()) {
            angulo1.setText("0");
        }
        
        if (norma2.getText().isEmpty()) {
            norma2.setText("0");
        }
        
        if (angulo2.getText().isEmpty()) {
            angulo2.setText("0");
        }
    }
    
    public void cambiarPanel(JPanel panel1, JPanel panel2){
        panel1.setSize(300, 300);
        panel1.setLocation(0, 0);
        panel1.setBackground(Color.WHITE);
        
        panel2.removeAll();
        panel2.add(panel1, BorderLayout.CENTER);
        panel2.revalidate();
        panel2.repaint();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnReset;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> Operacion;
    private javax.swing.JTextField angulo;
    private javax.swing.JTextField angulo1;
    private javax.swing.JTextField angulo2;
    private javax.swing.JPanel grafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField norma;
    private javax.swing.JTextField norma1;
    private javax.swing.JTextField norma2;
    private javax.swing.JTextField num_imag;
    private javax.swing.JTextField num_imag1;
    private javax.swing.JTextField num_imag2;
    private javax.swing.JTextField num_real;
    private javax.swing.JTextField num_real1;
    private javax.swing.JTextField num_real2;
    // End of variables declaration//GEN-END:variables
}
