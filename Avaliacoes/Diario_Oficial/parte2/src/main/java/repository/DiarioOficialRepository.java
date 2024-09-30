package main.java.repository;

import java.util.ArrayList;

import main.java.model.DiarioOficial2;


public class DiarioOficialRepository implements Repository<DiarioOficial2> {
    @Override
    public void salvar(DiarioOficial2 obj){
        System.out.println("O Diário Oficial foi salvo com sucesso!");
    }

    @Override
    public void novo(DiarioOficial2 obj){
        System.out.println("O Diário Oficial foi criado com sucesso!");
    }

    @Override
    public void apagar(DiarioOficial2 obj){
        System.out.println("O Diário Oficial foi apagado com sucesso!");
    }

    @Override
    public ArrayList<DiarioOficial2> buscar(DiarioOficial2 obj){
        return new ArrayList<DiarioOficial2>();
    }
    
}
