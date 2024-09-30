public class Cifra {
    public void encrypt(String palavra, int chave){
        int tamanhoTexto = palavra.length();
        StringBuilder textoCifra = new StringBuilder();

        for(int i=0; i<tamanhoTexto; i++){
            int letraASCII =((int) palavra.charAt(i) + chave);

            if (letraASCII > 126){
                letraASCII = 32 + (letraASCII - 127);
            }
            char letraCifra = (char) letraASCII;
            textoCifra.append(letraCifra);
        }
        System.out.println(textoCifra);
    }

    public void decrypt(String enigma, int chave){
        int tamanhoTexto = enigma.length();
        StringBuilder textoDescriptografia = new StringBuilder();

        for(int i=0; i<tamanhoTexto; i++){
            int letraASCII = ((int) enigma.charAt(i) - chave);

            while(letraASCII < 32){
                letraASCII += 94;
            }
            char letraDescriptografia = (char) letraASCII;
            textoDescriptografia.append(letraDescriptografia);
        }
        System.out.println(textoDescriptografia);
    }

        public static void main(String[] args) {
            Cifra teste = new Cifra();
            teste.encrypt("mell", 2);
            teste.decrypt("ognn", 2);
    
        }
}