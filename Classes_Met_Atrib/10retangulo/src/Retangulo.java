
public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {

    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void getArea(){
        double area = base*altura;
        System.out.println("Area do retangulo: " + area);
    }

    public void getPerimetro(){
        double perimetro = (base*2) + (altura*2);
        System.out.println("Perimetro do retangulo: " + perimetro);
    }
}
