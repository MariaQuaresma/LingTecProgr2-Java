public class Celula {

    private static int totalInstancias = 0; 

    public Celula(){
        totalInstancias++; 
    }

    public static void exibirInstancias(){  
            System.out.println("\nNúmero total de instâncias de Celula criadas: " + totalInstancias);
    }

    public static void main(String[] args) {
        Celula celula1 = new Celula();
        Celula celula2 = new Celula();
        Celula celula3 = new Celula();
        Celula celula4 = new Celula();
        Celula celula5 = new Celula();
        Celula.exibirInstancias();
    }
}
