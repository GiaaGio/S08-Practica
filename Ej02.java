package clases;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        String nombre = Cadena();
        mostrarCadena(nombre);
    }

    private static String Cadena() {
        String entrada;
        Scanner teclado = new Scanner(System.in);
        boolean esValido = false;

        do {
            System.out.print("Ingrese nombre: ");
            entrada = teclado.nextLine();
            if (entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+")) {
                esValido = true;
            } else {
                System.out.println("Error: La entrada debe contener solo letras y espacios.");
            }
        } while (!esValido);

        return entrada;
    }

    private static void mostrarCadena(String nombre) {
        String cadena = " ";
        for (int i = nombre.length()-1; i >=0; i--) {
            cadena = nombre.charAt(i) + cadena;
            System.out.println(cadena);
        }
        
    }
}
