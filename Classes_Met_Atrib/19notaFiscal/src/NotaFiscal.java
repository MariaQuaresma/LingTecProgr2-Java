public class NotaFiscal {
    private int notaFiscal;
    private int diaCompra;
    private int mesCompra;
    private int anoCompra;
    private double valorCompra;
    private String nomeComp;
    private String ender;
    private String telefone;
    private boolean pago;
    private String cpf;

    public NotaFiscal() {

    }

    public NotaFiscal(int notaFiscal, int diaCompra, int mesCompra, int anoCompra, double valorCompra, String nomeComp,
            String ender, String telefone, boolean pago, String cpf) {
        this.notaFiscal = notaFiscal;
        this.diaCompra = diaCompra;
        this.mesCompra = mesCompra;
        this.anoCompra = anoCompra;
        this.valorCompra = valorCompra;
        this.nomeComp = nomeComp;
        this.ender = ender;
        this.telefone = telefone;
        this.pago = false;
        this.cpf = cpf;
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public int getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(int diaCompra) {
        this.diaCompra = diaCompra;
    }

    public int getMesCompra() {
        return mesCompra;
    }

    public void setMesCompra(int mesCompra) {
        this.mesCompra = mesCompra;
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirNotaFiscal(){
        System.out.println("\nNota Fiscal: "+getNotaFiscal()+"\nDia da compra:"+getDiaCompra()+"\nMes:"+getMesCompra()
        +"\nAno:"+getAnoCompra()+"\nValor Compra:"+getValorCompra()+"\nNome Comprador(a): "+getNomeComp()+
        "\nEndereço: "+getEnder()+ "\nTelefone: "+getTelefone()+ "\nCpf: "+getCpf());
    }

    public int calcularDiasAtraso(int diaAtual, int mesAtual, int anoAtual) {
        int diasCompra = anoCompra*365 + mesCompra*30 + diaCompra;
        int diasAtual = anoAtual*365 + mesAtual*30 + diaAtual;
        int diasAtraso = diasAtual - diasCompra;
        return diasAtraso;
    }

    public double calcularValorPagar(int diaAtual, int mesAtual, int anoAtual) {
        if (!pago) {
            int diasAtraso = calcularDiasAtraso(diaAtual, mesAtual, anoAtual);

            double juros = valorCompra * 0.0095 * diasAtraso;

            return valorCompra + juros;
        } 
        else {
            return valorCompra;
        }
    }
    public static void main(String[] args) {
    
        NotaFiscal nota = new NotaFiscal(1234, 27, 04, 2024, 500,
         "lais", "rua ali", "1343667", false, "5627674827");
         nota.imprimirNotaFiscal();

        System.out.println("\nValor original da compra: " + nota.getValorCompra());

        int diaAtual = 30;
        int mesAtual = 04;
        int anoAtual = 2024;

        int diasatrasado = nota.calcularDiasAtraso(diaAtual, mesAtual, anoAtual);
        System.out.println("\nDias de atraso: "+ diasatrasado);

        double novoValor = nota.calcularValorPagar(diaAtual, mesAtual, anoAtual);
        System.out.println("\nNovo valor a pagar após dias de atraso: " + novoValor);
       
    }
}
