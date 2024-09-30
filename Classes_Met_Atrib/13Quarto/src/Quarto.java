public class Quarto {
   private boolean lampada;
   private boolean abajour;
   private boolean arcondicionado;
   private boolean tv;
   private String canalTV;
   private String sourceTV;
   private Ventilador[] ventiladores;


    public Quarto(){
        this.ventiladores = new Ventilador[3];
    }

    public Quarto(boolean lampada, boolean abajour, boolean arcondicionado, boolean tv, String canalTV, String sourceTV) {
        this.lampada = lampada;
        this.abajour = abajour;
        this.arcondicionado = arcondicionado;
        this.tv = tv;
        this.canalTV = canalTV;
        this.sourceTV = sourceTV;
    }

    public void ligarLampada() {
        System.out.println("Ligar lampada");
        lampada = true;
    }

    public void desligarLampada(){
        System.out.println("desligar Lampada");
        lampada = false;
    }

    public void ligarAbajour(){
        System.out.println("ligar Abajour");
        abajour = true;
    }

    public void desligarAbajour(){
        System.out.println("desligar Abajour");
        abajour = false;
    }

    public void ligarArcondicionado(){
        System.out.println("ligar Arcondicionado");
        arcondicionado = true;
    }

    public void desligarArcondicionado(){
        System.out.println("desligar Arcondicionado");
        arcondicionado = false;
    }

    public void ligarTv(){
        System.out.println("ligar Tv");
        tv = true;
    }

    public void desligarTv(){
        System.out.println("desligar Tv");
        tv = false;
    }

    public void mudarCanalTv(){
        if(tv == true){
            System.out.println("Mudar Canal da Tv");
        }
        else{
            System.out.println("Tv está desligada!");
        }
    }

    public void mudarSourceTv(){
        if(tv == true){
            System.out.println("Mudar Source da Tv");
        }
        else{
            System.out.println("Tv está desligada!");
        }
    }

    public void ligarVentilador(int indice) {
        if (indice >= 0 && indice < ventiladores.length) {
            System.out.println("Ligando o ventilador");
            ventiladores[indice].ligar();
        }
    }

    public void desligarVentiladores(int indice) {
        if (indice >= 0 && indice < ventiladores.length) {
            System.out.println("Desligando os ventiladores");
            ventiladores[indice].desligar();
        }
    }

    public void  mudarVelocVentilador(int indice, int velocidade){
        if(indice >= 0 && indice < ventiladores.length){
            System.out.println("mudar Velocidade Ventilador");
            ventiladores[indice].mudarVelocidade(velocidade);
        }
    }

    public boolean isLampada() {
        return lampada;
    }

    public void setLampada(boolean lampada) {  
        this.lampada = lampada;
    }

    public boolean isAbajour() {
        return abajour;
    }

    public void setAbajour(boolean abajour) {
        this.abajour = abajour;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public String getCanalTV() {
        return canalTV;
    }

    public void setCanalTV(String canalTV) {
        this.canalTV = canalTV;
    }

    public String getSourceTV() {
        return sourceTV;
    }

    public void setSourceTV(String sourceTV) {
        this.sourceTV = sourceTV;
    }

    public Ventilador[] getVentiladores() {
        return ventiladores;
    }

    public void setVentiladores(Ventilador[] ventiladores) {
        this.ventiladores = ventiladores;
    }
}