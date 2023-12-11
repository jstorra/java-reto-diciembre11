/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jstorra.reto;

/**
 *
 * @author user
 */
public class Punto3 {

    public static void main(String[] args) {
        char letraMinuscula = 'a';
        char letraMayuscula = 'A';
        char[] alfabetoMinusculas = new char[26];
        char[] alfabetoMayusculas = new char[26];
        char[] simbolos = {'!', '@', '#', '$', '%', '^', '&', '*'};
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        
        for (int i = 0; i < 26; i++) {
            alfabetoMinusculas[i] = (char) ((int) letraMinuscula + i);
        }
        for (int i = 0; i < 26; i++) {
            alfabetoMayusculas[i] = (char) ((int) letraMayuscula + i);
        }
        
        String contraseña = "";
        
        // cambia los parametros segun su necesidad
        boolean mayusculaParametro = true;
        boolean numeroParametro = true;
        boolean simboloParametro = true;

        while (true) {
            contraseña += alfabetoMinusculas[(int) (Math.random() * 10)];
            if (mayusculaParametro) {
                contraseña += alfabetoMayusculas[(int) (Math.random() * 10)];
            }
            if (numeroParametro) {
                contraseña += numeros[(int) ((Math.random() * 10) % numeros.length)];
            }
            if (simboloParametro) {
                contraseña += simbolos[(int) ((Math.random() * 10) % simbolos.length)];
            }
            if (contraseña.length() > 8 && contraseña.length() < 16) { break; }
        }
        System.out.println("Contraseña aleatoria: " + contraseña);
    }
}
