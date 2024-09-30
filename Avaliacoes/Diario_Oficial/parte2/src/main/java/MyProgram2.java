package main.java;

import main.java.model.Bloco2;
import main.java.model.Contrato;
import main.java.model.DiarioOficial2;
import main.java.model.Legislacao;
import main.java.model.Orgao2;
import main.java.model.enums.Esfera2;
import main.java.model.enums.Poder2;
import main.java.model.enums.TipoBloco2;
import main.java.model.enums.TipoLegislacao;
import main.java.repository.DiarioOficialRepository;

public class MyProgram2 {
    public static void main(String[] args) {
        DiarioOficial2 diarioOficialNiteroi = new DiarioOficial2("01/11/2023", 1, "Prefeitura municipal de niteroi", Esfera2.Municipal, null);
        diarioOficialNiteroi.imprimirDiario();

        Orgao2 orgaoNiteroi = new Orgao2(1, "Orgao niteroi", Poder2.Legislativo);
        orgaoNiteroi.imprimirOrgao();
    
        Legislacao lei3824 = new Legislacao(1, "Lei n 3824 31 de outubro de 2023", "atos do prefeito", "noticia", orgaoNiteroi, TipoLegislacao.LeisComplementares);
        lei3824.imprimirPublicacao2();
        Bloco2 bloco1 = new Bloco2("Declara o gremio o recreativo de Samba Souza Soares como Patrimonio Cultura Imaterial", TipoBloco2.Texto, 1);
        bloco1.imprimirBloco();
        Bloco2 bloco2 = new Bloco2("A CAMARA MUNICIPAL DE NITEROI DECRETA E EU SANCIONO A SEGUINTE LEI:", TipoBloco2.Texto, 2);
        bloco2.imprimirBloco();
        Bloco2 bloco3 = new Bloco2("Art.1 fica reconhecido", TipoBloco2.Texto, 3);
        bloco3.imprimirBloco();
        Bloco2 bloco4 = new Bloco2("Art.2 Esta lei entra", TipoBloco2.Texto, 4);
        bloco4.imprimirBloco();
        Bloco2 bloco5 = new Bloco2("PREFEITURA MUNICIPAL DE NITEROI", TipoBloco2.Texto, 5);
        bloco5.imprimirBloco();
        Bloco2 bloco6 = new Bloco2("AXEL GRAEL - PREFETITO", TipoBloco2.Texto, 6);
        bloco6.imprimirBloco();
        Bloco2 bloco7 = new Bloco2("PROJETO LEI N 099/2022", TipoBloco2.Texto,7);
        bloco7.imprimirBloco();
        Bloco2 bloco8 = new Bloco2("COAUTORES ANDERSON PIPICO", TipoBloco2.Texto,8);
        bloco8.imprimirBloco();

        Legislacao lei3825 = new Legislacao(2, "Lei n 3825 31 de outubro de 2023", "atos do prefeito", "noticia", orgaoNiteroi, TipoLegislacao.LeisComplementares);
        lei3825.imprimirPublicacao2();
        Bloco2 bloco9 = new Bloco2("Dispoe sobre o polo", TipoBloco2.Texto,9);
        bloco9.imprimirBloco();
        Bloco2 bloco10 = new Bloco2("A CAMARA MUNICIPAL DE NITEROI", TipoBloco2.Texto,10);
        bloco10.imprimirBloco();
        Bloco2 bloco11 = new Bloco2("ArT 1. altera o inciso VII", TipoBloco2.Texto,11);
        bloco11.imprimirBloco();
        Bloco2 bloco12 = new Bloco2("Art. 110 paragrafo unico.Fica definidos ", TipoBloco2.Texto,12);
        bloco12.imprimirBloco();
        Bloco2 bloco13 = new Bloco2("novos locais de interesse turisticos", TipoBloco2.Texto,13);
        bloco13.imprimirBloco();
        Bloco2 bloco14 = new Bloco2("VII- a rua Dr.Luiz Parther", TipoBloco2.Texto,14);
        bloco14.imprimirBloco();
        Bloco2 bloco15 = new Bloco2("n 15 e o entorno da praça", TipoBloco2.Texto,15);
        bloco15.imprimirBloco();
        Bloco2 bloco16 = new Bloco2("Art. 2 Esta lei", TipoBloco2.Texto,16);
        bloco16.imprimirBloco();
        Bloco2 bloco17 = new Bloco2("Art. 3 Esta Lei entra em vigor", TipoBloco2.Texto,17);
        bloco17.imprimirBloco();
        Bloco2 bloco18 = new Bloco2("PREFEITURA MUNICIPAL DE NITEROI", TipoBloco2.Texto,18);
        bloco18.imprimirBloco();
        Bloco2 bloco19 = new Bloco2("AXEL GRAEL-PREFEITO", TipoBloco2.Texto,19);
        bloco19.imprimirBloco();

        Orgao2 fundacaoMunicipal = new Orgao2(2, "fundacaoMunicipal", Poder2.Legislativo);
        fundacaoMunicipal.imprimirOrgao();
        Legislacao portaria1 = new Legislacao(3,"PORTARIA N 817/FMW/2023", null, "noticia", orgaoNiteroi, TipoLegislacao.Portaria);
        portaria1.imprimirPublicacao2();
        Bloco2 bloco20 = new Bloco2("Substiuti Equipe de gaestao", TipoBloco2.Texto, 20);
        bloco20.imprimirBloco();
        Bloco2 bloco21 = new Bloco2("a fim de atender as demandas", TipoBloco2.Texto, 20);
        bloco21.imprimirBloco();
        Bloco2 bloco22 = new Bloco2("(2 retirada). Gestao: Lorna Nevs", TipoBloco2.Texto, 20);
        bloco22.imprimirBloco();
        Bloco2 bloco23 = new Bloco2("Fiscais: 1) Andreia Bailano", TipoBloco2.Texto, 20);
        bloco23.imprimirBloco();
        Bloco2 bloco24 = new Bloco2("Arraujo", TipoBloco2.Texto, 20);
        bloco24.imprimirBloco();
        Bloco2 bloco25 = new Bloco2("INDUSTRIA E DISTRIBUICAO", TipoBloco2.Texto, 20);
        bloco25.imprimirBloco();
        Bloco2 bloco26 = new Bloco2("210/12849/2022", TipoBloco2.Texto, 20);
        bloco26.imprimirBloco();

        Contrato processo = new Contrato(3, "EXTRATO DE TERMO DE CONTARTO N 266/2023", null, null, orgaoNiteroi, null);
        processo.imprimirPublicacao2();
        Bloco2 bloco32 = new Bloco2("PROCESSO: 990031874/2023", TipoBloco2.Texto, 0);
        bloco32.imprimirBloco();
        Bloco2 bloco33 = new Bloco2("PARTES: FUNDAÇAÕ MUNICIPAL", TipoBloco2.Texto, 0);
        bloco33.imprimirBloco();
        Bloco2 bloco34 = new Bloco2("lado, a L.f.gomes", TipoBloco2.Texto, 0);
        bloco34.imprimirBloco();
        Bloco2 bloco35 = new Bloco2("Prestacao de srviços", TipoBloco2.Texto, 0);
        bloco35.imprimirBloco();
        Bloco2 bloco36 = new Bloco2("quatrocentos e trinta e dois", TipoBloco2.Texto, 0);
        bloco36.imprimirBloco();
        Bloco2 bloco37 = new Bloco2("Fonte: 1.704.00", TipoBloco2.Texto, 0);
        bloco37.imprimirBloco();
        Bloco2 bloco38 = new Bloco2("ASSINATURA:26/10/2023", TipoBloco2.Texto, 0);
        bloco38.imprimirBloco();

       Legislacao portaria2 = new Legislacao(4, "PORTARIA N 816/FMW/2023", null, "noticia", orgaoNiteroi, TipoLegislacao.Portaria);
       portaria2.imprimirPublicacao2();
       Bloco2 bloco27 = new Bloco2("Institui Equipe ", TipoBloco2.Texto, 20);
       bloco27.imprimirBloco();
       Bloco2 bloco28 = new Bloco2("Lorena Neves", TipoBloco2.Texto, 20);
       bloco28.imprimirBloco();
       Bloco2 bloco29 = new Bloco2("Bailano, matricula", TipoBloco2.Texto, 20);
       bloco29.imprimirBloco();
       Bloco2 bloco30 = new Bloco2("O. Cargo agente", TipoBloco2.Texto, 20);
       bloco30.imprimirBloco();
       Bloco2 bloco31 = new Bloco2("Serviços LTDA FUNDAMENTO: ", TipoBloco2.Texto, 20);
       bloco31.imprimirBloco();

       DiarioOficialRepository diarioOficialRepository = new DiarioOficialRepository();
       diarioOficialRepository.salvar(diarioOficialNiteroi);
    }
}
