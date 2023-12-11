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
        char letra = 'a';
        char[] alfabeto = new char[26];
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ((int) letra + i);
        }
        String contraseña = "";
        while (true) {
            contraseña += alfabeto[(int) (Math.random() * 10)];
            if (contraseña.length() > 8 && contraseña.length() < 16){ break; }
        }
        System.out.println("Contraseña aleatoria: " + contraseña);
    }
}
