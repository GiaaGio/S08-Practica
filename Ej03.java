package clases;

import java.util.Scanner;

public class Ej03 {

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

    private static String mostrarCadena(String nombre) {
        String cadena = " ";
        for (int i = nombre.length(); i >= 1; i--) {
            System.out.println(nombre.substring(0, i));
        }
        return cadena;
    }
}
