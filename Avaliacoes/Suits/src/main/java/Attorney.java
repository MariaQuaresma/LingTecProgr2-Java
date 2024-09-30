package main.java;

import main.java.interfaces.Lawyer;

public class Attorney extends Posicao implements Lawyer {
    private String legalNumber;
    public Attorney(){
        
    }
    public Attorney(String legalNumber) {
        this.legalNumber = legalNumber;
    }
    
    public String getLegalNumber() {
        return legalNumber;
    }

    public void setLegalNumber(String legalNumber) {
        this.legalNumber = legalNumber;
    }

    @Override
    public void representClients(){
        System.out.println("represent x");
    }

    @Override
    public void research(){
        System.out.println("research x");
    }

    @Override
    public void analysis(String doc){
        System.out.println("analysing " + doc);
    }

    @Override
    public void fileDocument(String type){
        System.out.println("file Document is" + type);
    }
}
