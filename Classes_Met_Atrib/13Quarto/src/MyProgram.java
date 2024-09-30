public class MyProgram {
    public static void main(String[] args) {
        Quarto quarto = new Quarto();
        quarto.ligarLampada();
        quarto.ligarAbajour();
        quarto.ligarArcondicionado();
        quarto.ligarTv();
        quarto.mudarCanalTv();
        quarto.mudarSourceTv();

        quarto.getVentiladores()[0] = new Ventilador(true, 50);
        quarto.getVentiladores()[1] = new Ventilador(false, 00);
        quarto.getVentiladores()[2] = new Ventilador(true, 30);

        for (int i=0; i<3; i++) {
            Ventilador ventilador = quarto.getVentiladores()[i];
            System.out.println("\nVentilador " + (i+1));
            if (ventilador.isLigado()) {
                System.out.println("Status: ligado");
            } 
            else {
                System.out.println("Status: desligado");
            }
            System.out.println("Velocidade: " + ventilador.getVelocidade1());
        }
        
    }
}
