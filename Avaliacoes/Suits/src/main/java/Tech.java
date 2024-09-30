package main.java;

public class Tech extends Firm{
    private String nonDisclouse;
    private String ipAddress;
    
    public Tech(){

    }

    public Tech(String nonDisclouse, String ipAddress) {
        this.nonDisclouse = nonDisclouse;
        this.ipAddress = ipAddress;
    }

    public Tech(String name, String foundation, String nonDisclouse, String ipAddress) {
        super(name, foundation);
        this.nonDisclouse = nonDisclouse;
        this.ipAddress = ipAddress;
    }

    public String getNonDisclouse() {
        return nonDisclouse;
    }

    public void setNonDisclouse(String nonDisclouse) {
        this.nonDisclouse = nonDisclouse;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void info(){
        System.out.println("\nTech [name:"+getName()+", foundation:"+getFoundation()+", nonDisclouse:"+getNonDisclouse()+", ipAddress:"+getIpAddress()+"]");
    }   
}
