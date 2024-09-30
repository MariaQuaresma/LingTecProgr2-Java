public class Pessoa {
    private String nome;
    private String apelido;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    public Pessoa(){

    }

    public Pessoa(String nome, String apelido, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.apelido = apelido;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public int getIdade(){
        int anoAtual = 2024;
        int mesAtual = 9;
        int diaAtual = 19;

        int idade = anoAtual - anoNasc;

        if(mesNasc > mesAtual || (mesNasc == mesAtual && diaNasc > diaAtual)){
            idade = idade-1;  
        }
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Sheila", "she", 01, 01,2003);

        int idade = pessoa.getIdade();

        System.out.println("\nNome: " + pessoa.getNome() + "\nApelido: "+ pessoa.getApelido());
        System.out.println("Data nascimento: "+ pessoa.getDiaNasc()+"/" + pessoa.getMesNasc() +"/"+ pessoa.getAnoNasc());
        System.out.println("Idade de " + pessoa.getNome() + ": " + idade + " anos.");
    }
}