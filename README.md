# Descripción del repositorio: Reto 11 de Diciembre 2023

## Punto 1
Suma de los numeros que son multiplos de 3 o 5 y que sean menores a un numero (N) dado, excluyendo aquellos que son multiplo de ambos.

```java
public static void main(String[] args) {
    int n = 10;
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            continue;
        } else if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    System.out.println(sum);
}
```

## Punto 2
Validar una contraseña ingresada la cual debe cumplir con lo siguiente parametros:

- Longitud entre 8 y 16.
- Con o sin letras mayúsculas.
- Con o sin números.
- Con o sin símbolos.

```java
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
```

## Punto 3
Generar contraseñas aleatorias pudiendo configurar los siguientes parametros:
- Longitud entre 8 y 16.
- Con o sin letras mayúsculas.
- Con o sin números.
- Con o sin símbolos.

```java
public static void main(String[] args) {
    char letraMinuscula = 'a';
    char letraMayuscula = 'A';
    char[] alfabetoMinusculas = new char[26];
    char[] alfabetoMayusculas = new char[26];
    char[] simbolos = {'!', '@', '#', '$', '%', '^', '&', '*'};
    int[] numeros = {0,1,2,3,4,5,6,7,8,9};
    
    for (int i = 0; i < 26; i++) {
        alfabetoMinusculas[i] = (char) ((int) letraMinuscula + i);
    }
    for (int i = 0; i < 26; i++) {
        alfabetoMayusculas[i] = (char) ((int) letraMayuscula + i);
    }
    
    String contraseña = "";
    int longitudContraseña = 16;
    
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
        if (contraseña.length() == longitudContraseña) { break; }
    }
    System.out.println("Contraseña aleatoria: " + contraseña);
}
```

## Punto 4
Código para generar una secuencia de numeros que sean el doble del numero anterior comenzando con valores iniciales de 0 y 1:

```java
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
```

## Uso del Proyecto

Clona este repositorio en tu maquina local:

```BASH
git clone https://github.com/jstorra/java-reto-diciembre11.git
```

---

<p align="center">Developed by <a href="https://github.com/jstorra">@jstorra</a></p>
