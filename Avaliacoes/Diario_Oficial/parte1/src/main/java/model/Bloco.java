package main.java.model;
import main.java.model.enums.TipoBloco;

public class Bloco {
    private String texto;
    private TipoBloco tipo;
    private int ordem;

    public Bloco(){

    }

    public Bloco(String texto, TipoBloco tipo, int ordem) {
        this.texto = texto;
        this.tipo = tipo;
        this.ordem = ordem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoBloco getTipo() {
        return tipo;
    }

    public void setTipo(TipoBloco tipo) {
        this.tipo = tipo;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void imprimirBloco(){
        System.out.println("Bloco [texto:"+getTexto()+", tipo:"+getTipo()+", ordem:"+getOrdem()+"]");
    }
}
