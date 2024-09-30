package main.java.repository;

import java.util.ArrayList;

public interface Repository<Objeto> {
    public void salvar(Objeto obj);

    public void novo(Objeto obj);

    public void apagar(Objeto obj);

    public ArrayList<Objeto> buscar(Objeto obj);
}
