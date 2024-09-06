public class DoisGrau {

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public DoisGrau(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public DoisGrau() {

    }


    public boolean calcular(){
        double delta = b*b - (4 * c *a);

        if (delta < 0 ){
            System.out.println("Delta negativo");
            return false;
        }
        double raizDelta = Math.sqrt(delta);
        double denominador = 2 * a;

        x1 = (-b + raizDelta) / denominador;
        x2 = (-b - raizDelta) / denominador;

        System.out.println("x1 = " + x1);
        System.out.println("x1 = " + x2);

        return true;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getY1() {
        return x1;
    }

    public double getY2() {
        return x2;
    }
}