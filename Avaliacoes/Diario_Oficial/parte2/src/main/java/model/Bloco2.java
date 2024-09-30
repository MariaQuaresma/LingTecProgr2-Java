package main.java.model;

import main.java.model.enums.TipoBloco2;

public class Bloco2 {
    private String texto;
    private TipoBloco2 tipo;
    private int ordem;

    public Bloco2(String texto, TipoBloco2 tipo, int ordem) {
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

    public TipoBloco2 getTipo() {
        return tipo;
    }

    public void setTipo(TipoBloco2 tipo) {
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
