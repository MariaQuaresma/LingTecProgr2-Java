
public class MainRetangulo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n---Retangulo 1---");
        Retangulo retangulo1 = new Retangulo(3, 15);
        System.out.println("Base: " + retangulo1.getBase());
        System.out.println("Altura: " + retangulo1.getAltura());
        retangulo1.getArea();
        retangulo1.getPerimetro();

        System.out.println("\n---Retangulo 2---");
        Retangulo retangulo2 = new Retangulo(7, 5);
        System.out.println("Base: " + retangulo2.getBase());
        System.out.println("Altura: " + retangulo2.getAltura());
        retangulo2.getArea();
        retangulo2.getPerimetro();

        System.out.println("\n---Retangulo 3---");
        Retangulo retangulo3 = new Retangulo(8, 6);
        System.out.println("Base: " + retangulo3.getBase());
        System.out.println("Altura: " + retangulo3.getAltura());
        retangulo3.getArea();
        retangulo3.getPerimetro();

    }
}