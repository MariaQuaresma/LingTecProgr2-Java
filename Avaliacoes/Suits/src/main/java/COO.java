package main.java;

import main.java.interfaces.OperatingOfficer;
import main.java.interfaces.Parther;

public class COO extends Secretary implements Parther, OperatingOfficer{
    @Override
    public void organizing(){
        System.out.println("organizing");
    }

    @Override
    public void prepare(String doc){
        System.out.println("prepare" + doc);
    }

    @Override
    public void supportExecutives() {
        System.out.println("supportExecutives");
    }

    @Override
    public void developPolicies() {
        System.out.println("\ndevelop Policies");
    }

    @Override
    public void coordinate() {
        System.out.println("\ncoordinate");
    }

    @Override
    public void decisionMaking() {
        System.out.println("\ndecision Making");
    }

    @Override
    public void profitRevenue() {
        System.out.println("\nprofit Revenue");
    }
}
