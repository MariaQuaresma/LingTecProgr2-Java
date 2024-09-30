package main.java;

import main.java.model.DiarioOficial;
import main.java.model.Publicacao;
import main.java.model.Bloco;
import main.java.model.Orgao;
import main.java.model.enums.TipoBloco;
import main.java.model.enums.Poder;
import main.java.model.enums.Esfera;
import java.util.ArrayList;

public class MyProgram1 {
    public static void main(String[] args) {
        ArrayList<Publicacao> publicacao = new ArrayList<Publicacao>();

        DiarioOficial diarioOficialNiteroi = new DiarioOficial("01/11/2023", 1, "Prefeitura municipal de niteroi", Esfera.Municipal, publicacao);
        diarioOficialNiteroi.imprimirDiario();

        Orgao orgaoNiteroi = new Orgao(1, "Orgao niteroi", Poder.Legislativo);
        orgaoNiteroi.imprimirOrgao();

        Publicacao lei3824 = new Publicacao(2, "Lei n 3824 31 de outubro de 2023", "atos do prefeito", "noticia", orgaoNiteroi);
        lei3824.imprimirPublicacao();
        Bloco bloco1 = new Bloco("Declara o gremio o recreativo de Samba Souza Soares como Patrimonio Cultura Imaterial", TipoBloco.Texto, 1);
        bloco1.imprimirBloco();
        Bloco bloco2 = new Bloco("A CAMARA MUNICIPAL DE NITEROI DECRETA E EU SANCIONO A SEGUINTE LEI:", TipoBloco.Texto, 2);
        bloco2.imprimirBloco();
        Bloco bloco3 = new Bloco("Art.1 fica reconhecido", TipoBloco.Texto, 3);
        bloco3.imprimirBloco();
        Bloco bloco4 = new Bloco("Art.2 Esta lei entra", TipoBloco.Texto, 4);
        bloco4.imprimirBloco();
        Bloco bloco5 = new Bloco("PREFEITURA MUNICIPAL DE NITEROI", TipoBloco.Texto, 5);
        bloco5.imprimirBloco();
        Bloco bloco6 = new Bloco("AXEL GRAEL - PREFETITO", TipoBloco.Texto, 6);
        bloco6.imprimirBloco();
        Bloco bloco7 = new Bloco("PROJETO LEI N 099/2022", TipoBloco.Texto,7);
        bloco7.imprimirBloco();
        Bloco bloco8 = new Bloco("COAUTORES ANDERSON PIPICO", TipoBloco.Texto,8);
        bloco8.imprimirBloco();

        Publicacao lei3825 = new Publicacao(3, "Lei n 3825 31 de outubro de 2023", "atos do prefeito", "noticia", orgaoNiteroi);
        lei3825.imprimirPublicacao();
        Bloco bloco9 = new Bloco("Dispoe sobre o polo", TipoBloco.Texto,9);
        bloco9.imprimirBloco();
        Bloco bloco10 = new Bloco("A CAMARA MUNICIPAL DE NITEROI", TipoBloco.Texto,10);
        bloco10.imprimirBloco();
        Bloco bloco11 = new Bloco("ArT 1. altera o inciso VII", TipoBloco.Texto,11);
        bloco11.imprimirBloco();
        Bloco bloco12 = new Bloco("Art. 110 paragrafo unico.Fica definidos ", TipoBloco.Texto,12);
        bloco12.imprimirBloco();
        Bloco bloco13 = new Bloco("novos locais de interesse turisticos", TipoBloco.Texto,12);
        bloco13.imprimirBloco();
        Bloco bloco14 = new Bloco("VII- a rua Dr.Luiz Parther", TipoBloco.Texto,13);
        bloco14.imprimirBloco();
        Bloco bloco15 = new Bloco("n 15 e o entorno da praça", TipoBloco.Texto,14);
        bloco15.imprimirBloco();
        Bloco bloco16 = new Bloco("Art. 2 Esta lei", TipoBloco.Texto,14);
        bloco16.imprimirBloco();
        Bloco bloco17 = new Bloco("Art. 3 Esta Lei entra em vigor", TipoBloco.Texto,16);
        bloco17.imprimirBloco();
        Bloco bloco18 = new Bloco("PREFEITURA MUNICIPAL DE NITEROI", TipoBloco.Texto,17);
        bloco18.imprimirBloco();
        Bloco bloco19 = new Bloco("AXEL GRAEL-PREFEITO", TipoBloco.Texto,18);
        bloco19.imprimirBloco();

        publicacao.add(lei3824);
        publicacao.add(lei3825);
    }
}
