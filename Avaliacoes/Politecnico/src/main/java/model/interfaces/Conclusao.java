package main.java.model.interfaces;

import main.java.model.Disciplina;
import java.util.ArrayList;

public interface Conclusao {
    public boolean estaIntegralizado();
    public ArrayList<Disciplina> getDisciplinaFaltantes();
    
} 
