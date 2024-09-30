package main.java.model;


public class Licitacao extends Publicacao2 {
    private int fase;
    private int dataAberturaFase;
    private int modalidade;
    private int dataEncerramento;
    private int tipoEscolhaVencedor;

    public Licitacao(){

    }

    public Licitacao(int fase, int dataAberturaFase, int modalidade, int dataEncerramento, int tipoEscolhaVencedor) {
        this.fase = fase;
        this.dataAberturaFase = dataAberturaFase;
        this.modalidade = modalidade;
        this.dataEncerramento = dataEncerramento;
        this.tipoEscolhaVencedor = tipoEscolhaVencedor;
    }

    public Licitacao(int id, String tituloPrincipal, String tituloAxiliar, String conteudo, Orgao2 orgao, int fase,
            int dataAberturaFase, int modalidade, int dataEncerramento, int tipoEscolhaVencedor) {
        super(id, tituloPrincipal, tituloAxiliar, conteudo, orgao);
        this.fase = fase;
        this.dataAberturaFase = dataAberturaFase;
        this.modalidade = modalidade;
        this.dataEncerramento = dataEncerramento;
        this.tipoEscolhaVencedor = tipoEscolhaVencedor;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getDataAberturaFase() {
        return dataAberturaFase;
    }

    public void setDataAberturaFase(int dataAberturaFase) {
        this.dataAberturaFase = dataAberturaFase;
    }

    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }

    public int getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(int dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public int getTipoEscolhaVencedor() {
        return tipoEscolhaVencedor;
    }

    public void setTipoEscolhaVencedor(int tipoEscolhaVencedor) {
        this.tipoEscolhaVencedor = tipoEscolhaVencedor;
    }

    public void imprimirPublicacao2(){
        System.out.println("\nLicitacao [tituloPrincipal: "+getTituloPrincipal()+", tituloAxiliar: "+getTituloAxiliar()+
        ", conteudo: "+getConteudo()+"]"+ ", fase: "+getFase()+ ", dataAberturaFase: "
        +", modalidade: "+getModalidade()+ ", dataEncerramento: "+getDataEncerramento()
        + ", tipoEscolhaVencedor: "+getTipoEscolhaVencedor()+"]");
    }
}
