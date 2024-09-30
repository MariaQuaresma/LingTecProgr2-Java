package main.java;
import main.java.enums.AreasPesquisa;

public class Main {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador("Serjo","serjo@gmail.com", "Cefet",
        "5543676", "orientar na pesquisa");
        coordenador.imprimirCoordenador();

        Pesquisa pesquisa = new Pesquisa("Equipamentos médicos com IoT", "Equipamentos para ajudar"
        , "2023", "2025", AreasPesquisa.IOT, coordenador);
        pesquisa.imprimirPesquisa();

        String[] autores = {"Bob" , "Sandi"};
        AreasPesquisa[] areasRelacionadas = {AreasPesquisa.IOT, AreasPesquisa.ENGENHARIA_DE_SOFTWARE};

        Tese tese = new Tese("tese1", 2024, autores, areasRelacionadas, " D.Se", "Cefet");
        tese.imprimirInformacoes();

        Livro livro = new Livro("livro1", 2024, autores, areasRelacionadas, "editora1", "Rio de janeiro");
        livro.imprimirInformacoes();

        Artigo artigo = new Artigo("artigo1", 2024, autores, areasRelacionadas, "nome periodico1", 1, 1);
        artigo.imprimirInformacoes();
    }
}
