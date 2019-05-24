/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Data;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Functions;

/**
 * Clase generadora de números aleatorios a partir del método congruencial
 * mixto.
 *
 * @author alex
 */
public class Congruencial_Mixto {

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
     * @return {ArrayList} Arreglo de Objetos, con la lista de resultados
     * cargados en el modelo Data, con el formato para mostrar en el JTable.
     */
    public ArrayList getArray(int xn, int k, int d, int n) {
        aleatorio(xn, k, d, n);
        return table;
    }

    /**
     * Método que devuelve los valores con los cuales el algoritmo logro hacer
     * ejecición.
     *
     * @return {int[]} Arreglo de enteros, devuelve los datos en un arreglo
     * values[0] = a; values[1] = c; values[2] = m; values[3] = k; values[4] =
     * d; values[5] = xn;
     */
    public int[] getValues() {
        return values;
    }

    /**
     * Método recursivo, que genera una lista de numeros aleatorios segun el
     * método congruencial mixto.
     *
     * @param xn {int} Entero que sirve para iniciar el algoritmo, Semilla.
     * @param k {int} Entero que sirve para obtener el valor de a, para el
     * calculo de un numero aleatorio (8*k(+-)3).
     * @param d {int} Entero que sirve para obtener el valor de m, para el
     * calculo de un numero aleatorio p^m.
     * @param n {int} Valor entero que se usa para la ejecucion recursiva del
     * algoritmo, valor inicial 0.
     * @return {int} Devuelve un entero; el ultimo digito generado.
     */
    public int aleatorio(int xn, int k, int d, int n) {
        /**
         * Obtención del valor de a, a partir de (2^k)+1.
         */
        int a = (int) (Math.pow(2, k) + 1);
        /**
         * Obtención del valor de m, a partir de 2^d.
         */
        int m = (int) Math.pow(2, d);
        /**
         * Obtención del valor de c, que es el primo impar mas proximo a m.
         */
        int c = Functions.getLastPrimoImpar(m);
        /**
         * Verificar si el valor de m es mayor a las demas variables.
         */
        if (m < a || m < c || m < xn) {
            String aux = "";
            do {
                aux = JOptionPane.showInputDialog("El valor de m: " + m + " es menor a:\na:" + a + "\nc:" + c + "\nXn: " + xn + ",\nIngrese otro valor de d");
            } while (!Functions.isNumeric(aux));
            d = Integer.parseInt(aux);
            return aleatorio(xn, k, d, n);
        }
        /**
         * Varificar si el valor de a es impar.
         */
        if (!Functions.isImpar(a)) {
            String aux = "";
            do {
                aux = JOptionPane.showInputDialog("El valor de a: " + a + " es Par,\nIngrese otro valor de k").trim();
            } while (!Functions.isNumeric(aux));
            k = Integer.parseInt(aux);
            return aleatorio(xn, k, d, n);
        }
        /**
         * Varificar si el valor de a no es divicible para 3.
         */
        if (a % 3 == 0) {
            String aux = "";
            do {
                aux = JOptionPane.showInputDialog("El valor de a: " + a + " es divisible para 3,\nIngrese otro valor de k").trim();
            } while (!Functions.isNumeric(aux));
            k = Integer.parseInt(aux);
            System.out.println(k);
            return aleatorio(xn, k, d, n);
        }
        /**
         * Varificar si el valor de a no es divicible para 5.
         */
        if (a % 5 == 0) {
            String aux = "";
            do {
                aux = JOptionPane.showInputDialog("El valor de a: " + a + " es divisible para 5,\nIngrese otro valor de k").trim();
            } while (!Functions.isNumeric(aux));
            k = Integer.parseInt(aux);
            return aleatorio(xn, k, d, n);
        }
        /**
         * Verificar si los valores de a y c son primos relativos.
         */
        if (Functions.verifyPrimosRelativos(a, c)) {
            String aux = "";
            do {
                aux = JOptionPane.showInputDialog("El valor de a: " + a + " no es primo relativo a c: " + c + ",\nIngrese otro valor de k").trim();
            } while (Functions.isNumeric(aux));
            k = Integer.parseInt(aux);
            return aleatorio(xn, k, d, n);
        }
        /**
         * Ejecición del algoritmo.
         */
        int xn1 = metodo1(a, xn, c, m);
        /**
         * Obtención del valor de la divicion del algoritmo.
         */
        int div = ((a * xn) + c) / m;
        /**
         * Obtención de los números uniformes, parte decimal de la divición.
         */
        double div2 = (double) xn1 / m;
        System.out.println(n + "\t" + xn + "\t" + "\t" + div + " + " + xn1 + "/" + m + "\t" + xn1 + "\t" + div2);
        table.add(new Data(a, xn, div, xn1, m, n, div2));
        if (n == 0) {
            values[5] = xn;
        }
        /**
         * La ejecición recursiva termina cuando n llegue a ser igual a (m-1),
         * de lo contrario el metodo se llama a si mismo, con el valor de n
         * aumentado en 1.
         */
        if (n == m - 1) {
            System.out.println("valores...\na: " + a + "\nc: " + c + "\nm: " + m);
            values[0] = a;
            values[1] = c;
            values[2] = m;
            values[3] = k;
            values[4] = d;
            return xn1;
        } else {
            n++;
            return aleatorio(xn1, k, d, n);
        }
    }

    /**
     * Método que permite ejecutar la ecuación generadora de numeros aleatorios.
     *
     * @param a {int} valor multiplicador.
     * @param xn {int} valor de la semilla.
     * @param c {int} valor de adición.
     * @param m {int} valor de modulo.
     * @return {int} Número aleatorio, generado por la ecuación: ((a * xn)+c) %
     * m.
     */
    private static int metodo1(int a, int xn, int c, int m) {
        return ((a * xn) + c) % m;
    }

    /**
     * Método de verificación de numeros aleatorios.
     *
     * @param a {int} Entero verificador.
     * @param xn {int} Entero semilla.
     * @param c {int} Entero que se adiciona.
     * @param m {int} valor del modulo.
     * @param n {int} posicion del valor a verificar.
     * @return {int} Entero, devuelve el valor generado.
     */
    private static int metodo2(int a, int xn, int c, int m, int n) {
        return ((a * xn) + c * (((int) Math.pow(a, n) - 1) / (a - 1))) % m;
    }
}
