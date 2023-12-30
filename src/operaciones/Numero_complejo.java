/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Einar
 */
public final class Numero_complejo {
    
    //atributos
    private double num_real;
    private double num_imaginario;
    private double norma;
    private double angulo;

    //constructor
    public Numero_complejo(double num_real, double num_imaginario, double norma, double angulo) {
        if((num_real==0 || num_imaginario==0) && (norma!=0 && angulo!=0)){
            this.num_real = forma_rectangular_realalt(norma, angulo);
            this.num_imaginario = forma_rectangular_imaginariaalt(norma, angulo);
            this.norma = norma;
            this.angulo = angulo;
        }
        else if((norma==0 && angulo==0) && (num_real!=0 || num_imaginario!=0)){
            this.norma = realalt(num_imaginario, num_real);
            this.angulo = anguloalt(num_imaginario, num_real);
            this.num_real = num_real;
            this.num_imaginario = num_imaginario;
        }
        else{
            this.norma = norma;
            this.angulo = angulo;
            this.num_real = num_real;
            this.num_imaginario = num_imaginario;
        }
    }
    
    //metodos
    public double forma_rectangular_imaginariaalt(double real, double angulo){
        return real * Math.sin(Math.toRadians(angulo));
    }
    
    public double forma_rectangular_realalt(double real, double angulo){
        return real * Math.cos(Math.toRadians(angulo));
    }
    
    public double anguloalt(double num_imaginario, double num_real){
        if (num_real==0 && num_imaginario!=0) {
            return 90.0;
        } else if (num_real==0 && num_imaginario==0) {
            return 0;
        } else {
            if (num_real<0 && num_imaginario>0)
                return (180+Math.toDegrees(Math.atan(num_imaginario/num_real)));
            else if(num_imaginario<0 && num_real<0)
                return (Math.toDegrees(Math.atan(num_imaginario/num_real))-180);   
            else     
                return Math.toDegrees(Math.atan(num_imaginario/num_real));
        }
    }
    
    public double realalt(double num_imaginario, double num_real){
        return Math.sqrt((Math.pow(num_real, 2)+Math.pow(num_imaginario, 2)));
    }
    
    public double forma_rectangular_imaginaria(){
        return Math.toRadians(norma*Math.sin(Math.toDegrees(angulo)));
    }
    
    public double forma_rectangular_real(){
        return Math.toRadians(norma*Math.cos(Math.toDegrees(angulo)));
    }
    
    
    public double real(){
        return Math.sqrt((Math.pow(this.num_real, 2)+Math.pow(this.num_imaginario, 2)));
    }
    
    public Numero_complejo suma(Numero_complejo num1, Numero_complejo num2){
        Numero_complejo resultado = new Numero_complejo(num1.getR()+num2.getR(), num1.getI()+num2.getI(), 0, 0);
        return resultado;
    }
    
    public Numero_complejo resta(Numero_complejo num1, Numero_complejo num2){
        Numero_complejo resultado = new Numero_complejo(num1.getR()-num2.getR(), num1.getI()-num2.getI(), 0, 0);
        return resultado;
    }
    
    public Numero_complejo multiplicacion(Numero_complejo num1, Numero_complejo num2){
        double magni = num1.getReal() * num2.getReal();
        double angu = num1.getAngulo() + num2.getAngulo();
        if(magni==0){
            return new Numero_complejo(0, 0, 0, 0);
        }
        else{   
            return new Numero_complejo(0, 0, magni, angu);
        }
    }
    
    public Numero_complejo division(Numero_complejo num1, Numero_complejo num2){
         try {
            if (num2.getReal() == 0) {
                throw new ArithmeticException("División por cero: El divisor es 0.");
            }

            double magni = num1.getReal() / num2.getReal();
            double angu = num1.getAngulo() - num2.getAngulo();
            return new Numero_complejo(0, 0, magni, angu);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error de división", JOptionPane.ERROR_MESSAGE);
            return new Numero_complejo(0, 0, 0, 0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error: Los números complejos no están inicializados.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    //getters y setters
    public double getR() {
        return num_real;
    }

    public void setR(double r) {
        this.num_real = r;
    }

    public double getI() {
        return num_imaginario;
    }

    public void setI(double i) {
        this.num_imaginario = i;
    }

    public double getReal() {
        return norma;
    }

    public void setReal(double real) {
        this.norma = real;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    //toString
    @Override
    public String toString() {
        return "Numero_complejo{" + "num_real=" + num_real + ", num_imaginario=" + num_imaginario + ", R=" + norma + ", angulo=" + angulo + '}';
    }
    
}
