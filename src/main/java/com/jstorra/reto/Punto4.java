/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jstorra.reto;

/**
 *
 * @author user
 */
public class Punto4 {

    public static void main(String[] args) {
        // El código de Python proporcionado lo que hace es que el siguiente numero en la secuencia
        // es el doble del anterior y traducido al lenguaje Java quedaria asi:
        
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            a = b;
            b = a + b;
        }
    }
}
