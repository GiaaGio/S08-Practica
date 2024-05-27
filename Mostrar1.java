package Ejercicio4;

import java.util.Scanner;

public class Mostrar1 {

    static CEj1 obj = new CEj1();

    public static void main(String[] args) {
        float num;
        num = LeerNumero();
        obj.setNum(num);
        obj.AreaCirculo();
        mostrar();
    }

    public static float LeerNumero() {
        float num;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese radio: ");
            num = teclado.nextFloat();
        } while (num < 0);
        return num;
    }

    public static void mostrar() {
        System.out.println("Radio: " + obj.getNum());
        System.out.println("Área del circulo " + obj.AreaCirculo());
    }
}
