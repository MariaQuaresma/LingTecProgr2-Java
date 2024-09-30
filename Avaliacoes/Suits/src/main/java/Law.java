package main.java;

public class Law extends Firm {
    private String insuranceQuote;
    private String govApprovement;

    public Law(){

    }

    public Law(String insuranceQuote, String govApprovement) {
        this.insuranceQuote = insuranceQuote;
        this.govApprovement = govApprovement;
    }

    public Law(String name, String foundation, String insuranceQuote, String govApprovement) {
        super(name, foundation);
        this.insuranceQuote = insuranceQuote;
        this.govApprovement = govApprovement;
    }

    public String getInsuranceQuote() {
        return insuranceQuote;
    }

    public void setInsuranceQuote(String insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }

    public String getGovApprovement() {
        return govApprovement;
    }

    public void setGovApprovement(String govApprovement) {
        this.govApprovement = govApprovement;
    }

    @Override
    public void info(){
        System.out.println("Law [name:"+getName()+", foundation:"+getFoundation()+", insuranceQuote:"+getInsuranceQuote()+", govApprovement:"+getGovApprovement()+"]");
    }
}
