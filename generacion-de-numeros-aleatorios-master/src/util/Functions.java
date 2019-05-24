/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase que sirve las funciones necesarias para las verificaciones y
 * obtneciones de valores en los metodos de generacion de números aleatorios.
 *
 * @author alex
 */
public class Functions {

    /**
     * Método que verifica si un número es impar.
     *
     * @param numero {int} valor a verificar.
     * @return {boolean} true si es impar, false si es par.
     */
    public static boolean isImpar(int numero) {
        if (numero % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que permite obtener el número primo impar mas cercano al limite.
     *
     * @param limite {int} valor limite al cual acercarce.
     * @return {int} Devuelve el valor del primo impar mas cercano al limite.
     */
    public static int getLastPrimoImpar(int limite) {
        int primo = 0;
        /**
         * Verificar todos los números de 0 a limite, si son primos, hasta
         * obtener el ultimo.
         */
        for (int i = 1; i <= limite; i++) {
            if (isPrimo(i)) {
                primo = i;
            }
        }
        /**
         * Verificar si el primo obtenido es impar, de lo contrario, el metodo
         * se llama a si mismo el mismo en el valor de primo-1 como limite.
         */
        if (!isImpar(primo)) {
            return getLastPrimoImpar(primo - 1);
        } else {
            return primo;
        }
    }

    /**
     * Método para validar si un número es primo.
     *
     * @param numero {int} valor a comprobar.
     * @return {boolean} true si es primo, false si no.
     */
    public static boolean isPrimo(int numero) {
        int aux;
        for (int cont = 2; cont < numero; cont++) {
            aux = numero % cont;
            if (aux == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que sirve para verificar si dos números son primos relativos. los
     * primos relativos no tienen factores primos entre si.
     *
     * @param num1 {int} primer valor a comprobar.
     * @param num2 {int} segundo valor a comprobar.
     * @return {boolean} true si los numeros no poseen actores primos iguales.
     */
    public static boolean verifyPrimosRelativos(int num1, int num2) {
        int a = num1; //Primeiro número
        int b = num2; //Segundo número
        int resto = 1; //Modulo de la divicio entre a y b.
        for (int i = 0; resto == 0; i++) {
            if (a > b) {
                resto = a % b;
                a = b;
                b = resto;
            }
            if (a < b) {
                resto = b % a;
                b = a;
                a = resto;
            }
        }
        return b == 1;

    }

    /**
     * Método para verificar si los datos que ingresa el usuario son numericos.
     *
     * @param cadena {String} texto a comparar si es numerico o no.
     * @return {boolean} true si es un Integer.
     */
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            JOptionPane.showMessageDialog(new JFrame(), "El valor Ingresado no es numerico.");
            resultado = false;
        }
        return resultado;
    }
}
