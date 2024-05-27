package Ejercicio4;

import java.util.Scanner;

public class Mostrar5 {

    static CEj5 obj = new CEj5();

    public static void main(String[] args) {
        float num1, num2;
        num1 = LeerNumero();
        num2 = LeerNumero();
        obj.setNum1(num1);
        obj.setNum2(num2);
        obj.aleatorio();
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
        System.out.println("Número aleatorio decimal entre " + obj.getNum1() + " y " + obj.getNum2() + ": " + obj.aleatorio());
    }
}
