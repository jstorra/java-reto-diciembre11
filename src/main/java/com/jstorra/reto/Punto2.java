package com.jstorra.reto;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class Punto2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la contraseña: ");
        String contraseña = scanner.nextLine();
        
        int mayusculas = 0, minusculas = 0, numeros = 0, caracteres = 0;

        for (char letra : contraseña.toCharArray()) {
            if (Character.isUpperCase(letra)) {
                mayusculas++;
            } else if (Character.isLowerCase(letra)) {
                minusculas++;
            } else if (Character.isDigit(letra)) {
                numeros++;
            } else if (!Character.isLetterOrDigit(letra)) {
                caracteres++;
            }
        }
        if (contraseña.length() >= 8 && mayusculas > 0 && minusculas > 0 && numeros > 0 && caracteres > 0) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida.");
        }
    }
}
