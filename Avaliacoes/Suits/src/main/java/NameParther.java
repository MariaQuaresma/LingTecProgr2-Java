package main.java;

import main.java.interfaces.Parther;

public class NameParther extends Attorney implements Parther{
    @Override
    public void decisionMaking() {
        System.out.println("\ndecision Making");
    }

    @Override
    public void profitRevenue() {
        System.out.println("profit Revenue");
    }
}
