package Ejercicio4;

public class CEj3 {

    float num1, num2;

    public float menor() {
        float menor;
        menor = (float) (Math.min(num1, num2));
        return menor;
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
