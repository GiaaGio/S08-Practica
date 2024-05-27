package Ejercicio4;

import java.util.Scanner;

public class CPrincipal {

    static COperaciones obj = new COperaciones();

    public static void main(String[] args) {
        float num1, num2;
        num1 = LeerNumero();
        num2 = LeerNumero();
        obj.setNum1(num1);
        obj.setNum2(num2);
        obj.suma();
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
        System.out.println("Numero 1: " + obj.getNum1());
        System.out.println("Numero 2: " + obj.getNum2());
        System.out.println("Suma: " + obj.suma());
    }

}
