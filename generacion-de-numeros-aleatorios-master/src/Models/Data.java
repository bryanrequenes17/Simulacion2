/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Clase Modelo, para mantener los datos que se generan en los algoritmos y
 * presentarlos en una tabla.
 *
 * @author alex
 */
public class Data {

    private int a;
    private int xn;
    private int divicion;
    private int xn1;
    private long m;
    private int n;
    private double decimales;

    public Data() {
    }

    /**
     * Constructor que permite llenar los campos del Modelo.
     *
     * @param a {int} valor multiplicador.
     * @param xn {int} valor generador o semilla.
     * @param divicion {int} valor de la divicion, no modulo, de la ecuación.
     * @param xn1 {int} resultado de la ejecución del algoritmo.
     * @param m {int} valor del módulo
     * @param n {int} contador.
     * @param decimales {double} decimales de la divición.
     */
    public Data(int a, int xn, int divicion, int xn1, long m, int n, double decimales) {
        this.a = a;
        this.xn = xn;
        this.divicion = divicion;
        this.xn1 = xn1;
        this.m = m;
        this.n = n;
        this.decimales = decimales;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getXn() {
        return xn;
    }

    public void setXn(int xn) {
        this.xn = xn;
    }

    public int getDivicion() {
        return divicion;
    }

    public void setDivicion(int divicion) {
        this.divicion = divicion;
    }

    public int getXn1() {
        return xn1;
    }

    public void setXn1(int xn1) {
        this.xn1 = xn1;
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getDecimales() {
        return decimales;
    }

    public void setDecimales(double decimales) {
        this.decimales = decimales;
    }

}
