package main.java.model;
import main.java.model.enums.TipoAditivo;

public class Aditivos {
    private int id;
    private TipoAditivo tipoAditivo;

    public Aditivos(){

    }

    public Aditivos(int id, TipoAditivo tipoAditivo) {
        this.id = id;
        this.tipoAditivo = tipoAditivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAditivo getTipoAditivo() {
        return tipoAditivo;
    }

    public void setTipoAditivo(TipoAditivo tipoAditivo) {
        this.tipoAditivo = tipoAditivo;
    }
}
