public class Padrao {
    private double[] num;

    public Padrao(double[] num){
        this.num = num;
    }

    public double maiorNum(){
        double maior = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i] > maior){
                maior = num[i];
            }
        }
        return maior;
    }

    public double menorNum(){
        double menor = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i] < menor){
                menor = num[i];
            }
        }
    return menor;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < num.length; i++) {
            double numeros = num[i];
            soma += numeros;
        }
    return soma / num.length;
    }

    public double desvioPadrao() {
        double media = calcularMedia();
        double somaDiferencasQuadradas = 0;
        for (int i = 0; i < num.length; i++) {
            double numeros = num[i];
            somaDiferencasQuadradas += Math.pow(numeros - media, 2);
        }
    double variancia = somaDiferencasQuadradas / num.length;
    return Math.sqrt(variancia);
    }

    public static void main(String[] args) {
        double[] num = {10.5, 20.3, 15.7, 25.1, 30.8};
        Padrao estatisticas = new Padrao(num);
    
        System.out.println("\nMaior números: " + estatisticas.maiorNum());
        System.out.println("Menor número: " + estatisticas.menorNum());
        System.out.println("Média: " + estatisticas.calcularMedia());
        System.out.println("Desvio padrão: " +  estatisticas.desvioPadrao());
    }
}