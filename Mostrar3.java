package Ejercicio4;

import java.util.Scanner;

public class Mostrar3 {

    static CEj3 obj = new CEj3();

    public static void main(String[] args) {
        float num1, num2;
        num1 = LeerNumero();
        num2 = LeerNumero();
        obj.setNum1(num1);
        obj.setNum2(num2);
        obj.menor();
        mostrar();
    }

    public static float LeerNumero() {
        float num;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese número: ");
            num = teclado.nextFloat();
        } while (num < 0);
        return num;
    }

    public static void mostrar() {
        System.out.println("Número 1: " + obj.getNum1());
        System.out.println("Número 2: " + obj.getNum2());
        System.out.println("El menor es: " + obj.menor());
    }
}
