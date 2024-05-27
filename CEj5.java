package Ejercicio4;

public class CEj5 {

    float num1, num2;

    public float aleatorio() {
        float aleatorio;
        aleatorio = num1 + (int) (Math.random() * ((num2 - num1) + 1));
        return aleatorio;
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
