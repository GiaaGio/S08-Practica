package Ejercicio4;

public class CEj2 {

    float num1, num2;

    public float potencia() {
        float potencia;
        potencia = (float) (Math.pow(num1, num2));
        return potencia;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

}
