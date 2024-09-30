package main.java.repository;

import java.util.ArrayList;

import main.java.model.Publicacao2;

public class PublicacaoRepository implements Repository<Publicacao2>{
    @Override
    public void salvar(Publicacao2 obj) {
        System.out.println("O Diário Oficial foi Registrado com Sucesso.");
    }

    @Override
    public void novo(Publicacao2 obj) {
        System.out.println("O Diário Oficial foi Criado com Sucesso.");
    }

    @Override
    public void apagar(Publicacao2 obj) {
        System.out.println("O Diário Oficial foi Apagado com Sucesso.");
    }

    @Override
    public ArrayList<Publicacao2> buscar(Publicacao2 obj) {
       return new ArrayList<Publicacao2>();
    }
}
