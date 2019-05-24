/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.sinRestriccion;

import Models.Data;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Functions;

/**
 * Clase generadora de números aleatorios a partir del método congruencial
 * multiplicativo.
 *
 * @author alex
 */
public class Congruencial_Multiplicativo {

    ArrayList table = new ArrayList();
    int[] values = new int[6];

    /**
     * Método que permite iniciar la ejecucion del algoritmo desde la ventana.
     *
     * @param xn {int} Entero que sirve para iniciar el algoritmo, Semilla.
     * @param k {int} Entero que sirve para obtener el valor de a, para el
     * calculo de un numero aleatorio (8*k(+-)3).
     * @param d {int} Entero que sirve para obtener el valor de m, para el
     * calculo de un numero aleatorio p^m.
     * @param n {int} Valor entero que se usa para la ejecucion recursiva del
     * algoritmo, valor inicial 0.
     * @param type {boolean} Bandera con la que se define que operacion se
     * realizara para el calculo de a (8*k(+-)3).
     * @return {ArrayList} Arreglo de Objetos, con la lista de resultados
     * cargados en el modelo Data, con el formato para mostrar en el JTable.
     */
    public ArrayList getArray(int xn, int a, long m, int n, boolean type) {
        aleatorio(xn, a, m, n, type);
        return table;
    }

    /**
     * Método que devuelve los valores con los cuales el algoritmo logro hacer
     * ejecición.
     *
     * @return {int[]} Arreglo de enteros, devuelve los datos en un arreglo
     * values[0] = a; values[1] = periodo; values[2] = m; values[3] = k;
     * values[4] = d; values[5] = xn;
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Método recursivo, que genera una lista de numeros aleatorios segun el
     * método congruencial multiplicativo.
     *
     * @param xn {int} Entero que sirve para iniciar el algoritmo, Semilla.
     * @param a {int} Entero que sirve para obtener el valor de a, para el
     * calculo de un numero aleatorio (8*k(+-)3).
     * @param d {int} Entero que sirve para obtener el valor de m, para el
     * calculo de un numero aleatorio p^m.
     * @param n {int} Valor entero que se usa para la ejecucion recursiva del
     * algoritmo, valor inicial 0.
     * @param type {boolean} Bandera con la que se define que operacion se
     * realizara para el calculo de a (8*k(+-)3).
     * @return {int} Devuelve un entero; el ultimo digito generado.
     */
    public int aleatorio(int xn, int a, long m, int n, boolean type) {
        /**
         * Obtención del periodo, el número máximo de n, a partir del cual los
         * número se repiten m/4 ó 2^(d-2).
         */
        int periodo = (int) (m / 4);
        /**
         * Verificar si el valor de m es mayor a las demas variables.
         */
        if (m < a || m < xn) {
            String aux = "";
            do {
                aux = JOptionPane.showInputDialog("El valor de m: " + m + " es menor a:\na:" + a + "\nXn" + xn + ",\nIngrese otro valor de m").trim();
            } while (!Functions.isNumeric(aux));
            m = Integer.parseInt(aux);
            return aleatorio(xn, a, m, n, type);
        }
        if (n == 0) {
            values[5] = xn;
            /**
             * Verificar si el valor de la semilla es impar.
             */
            if (!Functions.isImpar(xn)) {
                String aux = "";
                do {
                    aux = JOptionPane.showInputDialog("El valor de Xinicial: " + xn + " debe ser Impar,\nIngrese otro valor de Xn").trim();
                } while (!Functions.isNumeric(aux));
                xn = Integer.parseInt(aux);
                return aleatorio(xn, a, m, n, type);
            }
            /**
             * Verifiar si el valor de la semilla es primo relativo al valor de
             * m.
             */
            if (Functions.verifyPrimosRelativos(xn, (int) m)) {
                String aux = "";
                do {
                    aux = JOptionPane.showInputDialog("El valor de Xinicial: " + xn + " no es primo relativo a m: " + m + ",\nIngrese otro valor de a").trim();
                } while (!Functions.isNumeric(aux));
                a = Integer.parseInt(aux);
                return aleatorio(xn, a, m, n, type);
            }
        }
        /**
         * Ejecición del algoritmo.
         */
        int xn1 = metodo(a, xn, m);
        /**
         * Obtención del valor de la divicion del algoritmo.
         */
        int div = (int) ((a * xn) / m);
        /**
         * Obtención de los números uniformes, parte decimal de la divición.
         */
        double div2 = (double) xn1 / m;
        System.out.println(n + "\t" + xn + "\t" + "\t" + div + " + " + xn1 + "/" + m + "\t" + xn1 + "\t" + div2);
        table.add(new Data(a, xn, div, xn1, m, n, div2));
        /**
         * La ejecición recursiva termina cuando n llegue a ser igual a (m-1),
         * de lo contrario el metodo se llama a si mismo, con el valor de n
         * aumentado en 1.
         */
        if (n == m - 1) {
            System.out.println("valores...\na: " + a + "\nm: " + m);
            values[0] = a;
            values[1] = periodo;
            values[2] = (int) m;
            values[3] = a;
            values[4] = (int) m;
            return xn1;
        } else {
            n++;
            return aleatorio(xn1, a, m, n, type);
        }
    }

    /**
     * Método que permite ejecutar la ecuación generadora de numeros aleatorios.
     *
     * @param a {int} valor multiplicador.
     * @param xn {int} valor de la semilla.
     * @param m {int} valor de modulo.
     * @return {int} Número aleatorio, generado por la ecuación: (a * xn) % m.
     */
    private static int metodo(int a, int xn, long m) {
        return (int) ((a * xn) % m);
    }

}
