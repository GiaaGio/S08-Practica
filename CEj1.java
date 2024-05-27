package Ejercicio4;

public class CEj1 {

    float num;

    public float AreaCirculo() {
        float area;
        area = (float) (Math.PI*num*num);
        return area;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    
}
