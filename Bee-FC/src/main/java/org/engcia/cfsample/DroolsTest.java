package org.engcia.cfsample;

import java.util.Collection;
import java.util.Scanner;

import org.engcia.cf.listeners.FactListener;
import org.engcia.cf.listeners.TrackingAgendaListener;
import org.engcia.cf.model.Evidence;
import org.engcia.cf.model.Hypothesis;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");
            Scanner scanner = new Scanner(System.in);
            Collection<?> hypotheses = kSession.getObjects();
            kSession.addEventListener(new TrackingAgendaListener());

            kSession.addEventListener(new FactListener());

            // go !
            kSession.insert(new Hypothesis(0.0, "varroa", "true"));
            kSession.insert(new Hypothesis(0.0, "nosemose", "true"));
            kSession.insert(new Hypothesis(0.0, "virusdacriacaoensacada", "true"));
            kSession.insert(new Hypothesis(0.0, "envenenamento", "true"));
            kSession.insert(new Hypothesis(0.0, "fome", "true"));
            kSession.insert(new Hypothesis(0.0, "acarapiose", "true"));
            kSession.insert(new Hypothesis(0.0, "loqueeuropeia", "true"));
            kSession.insert(new Hypothesis(0.0, "loqueamericana", "true"));
            kSession.insert(new Hypothesis(0.0, "ascosferiose", "true"));
            kSession.insert(new Hypothesis(0.0, "virose", "true"));
            kSession.insert(new Hypothesis(0.0, "virusdaparalisiaaguda", "true"));

            int CfObsAbelhasMortasDiferentesFasesDeDesenvolvimento, CfObsMortalidadeAumentada, CfObsDeformidadesNasAsas, CfObsDiminuicaoDeProdutividade, CfObsAcarosVermelhosNasAbelhas, CfObsAbdomenInchado, CfObsIncapacidadeDeVoar, CfObsManchasEscurasNaColmeia, CfObsLarvasMortasOuApodrecidas, CfObsOperculoDeprimidoOuPerfurado, CfObsCriacaoMalSemeada, CfObsMauCheiro, CfObsTesteDoPalito, CfObsOperculoAfundado, CfObsLarvasMumificadas, CfObsOperculosEsburacados, CfObsCriacaoEmMosaico, CfObsAusenciaDeCheiro, CfObsLarvasMortasNumSacoComLiquido, CfObsMudançaDeCorLarvas, CfObsEscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola, CfObsNecroseEEnegrecimentoDasTraqueiasDasAbelhas, CfObsAbelhasArrastaremSe, CfObsAbelhasMortasNaEntradaDaColmeia, CfObsAbelhasMortasEmCaudaDeCometa, CfObsAblehasMortasEmDiferentesEstadosDeDesenvolvimento, CfObsAbelhasMortasComACabeçaDentroDasCelulas, CfObsDiminuicaoDoTamanhoDasAbelhas, CfObsFaltaDeReservas, CfObsPerdaDePelo, CfObsMovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas, CfObsAspetoLuzidioEBrilhante;
            final int CfObsVerao = 1, CfObsInverno = 1, CfObsPrimavera = 1, CfObsOutono = 1;
            String estacao, GrauDeCerteza;
            String MortalidadeAumentada, DiminuicaoPopulacao, AbelhasMortasDiferentesFasesDeDesenvolvimento, DeformidadesNasAsas, DiminuicaoDeProdutividade, AcarosVermelhosNasAbelhas, AbdomenInchado, IncapacidadeDeVoar, ManchasEscurasNaColmeia, LarvasMortasOuApodrecidas, OperculoDeprimidoOuPerfurado, CriacaoMalSemeada, FacilidadeRemocaoEscama, MauCheiro, TesteDoPalito, OperculoAfundado, LarvasMumificadas, OperculosEsburacados, CriacaoEmMosaico, AusenciaDeCheiro, LarvasMortasNumSacoComLiquido, MudançaDeCorLarvas, EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola, NecroseEEnegrecimentoDasTraqueiasDasAbelhas, AbelhasArrastaremSe, AbelhasMortasNaEntradaDaColmeia, AbelhasMortasEmCaudaDeCometa, AblehasMortasEmDiferentesEstadosDeDesenvolvimento, AbelhasMortasComACabeçaDentroDasCelulas, DiminuicaoDoTamanhoDasAbelhas, FaltaDeReservas, PerdaDePelo, MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas, AspetoLuzidioEBrilhante;
            boolean b = true;
            boolean perguntaDiminuicaoProdutividade = false, perguntaMortalidadeAumentada = false, perguntaAbdomenInchado = false, perguntaIncapacidadeVoar = false, perguntaManchasEscuras = false;
            System.out.println("Olá, caro utilizador! Por favor responda às próximas perguntas com os detalhes do que observou");
            System.out.println("-----------------------------------------------");
            System.out.println("Em que estação do ano se encontra?");
            estacao = scanner.nextLine();
            while (b == true) {

                if (estacao.equalsIgnoreCase("Verao")) {
                    kSession.insert(new Evidence(CfObsVerao, "Verao", "true"));
                    kSession.fireAllRules();
                    b = false;
                    break;
                }
                if (estacao.equalsIgnoreCase("Inverno")) {
                    kSession.insert(new Evidence(CfObsInverno, "Inverno", "true"));
                    kSession.fireAllRules();
                    b = false;
                    break;

                }
                if (estacao.equalsIgnoreCase("Outono")) {
                    kSession.insert(new Evidence(CfObsOutono, "Outono", "true"));
                    kSession.fireAllRules();
                    b = false;
                    break;

                }
                if (estacao.equalsIgnoreCase("Primavera")) {
                    kSession.insert(new Evidence(CfObsPrimavera, "Primavera", "true"));
                    kSession.fireAllRules();
                    b = false;
                    break;

                }
                System.out.println("Por favor introduza uma estação do ano.");
                estacao = scanner.nextLine();
            }
            if (estacao.equalsIgnoreCase("Outono")) {
//outono
                //Loque Europeia e Americana
                System.out.println("Realizando o teste do palito foi verificada a formação de um filamento viscoso (1 a 2 cm de comprimento) ?");

                TesteDoPalito = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (TesteDoPalito.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                    kSession.fireAllRules();

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                    kSession.fireAllRules();
                }
                System.out.println("Foi identificado mau cheiro na colmeia (cheiro a cola de sapateiro)?");
                MauCheiro = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (MauCheiro.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mau cheiro (cheiro a cola de sapateiro)", "true"));
                    kSession.fireAllRules();

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mau cheiro (cheiro a cola de sapateiro)", "true"));
                    kSession.fireAllRules();

                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                            for (Object obj1 : hypotheses) {
                                if (obj1 instanceof Hypothesis) {
                                    Hypothesis hypothesis1 = (Hypothesis) obj1;
                                    if (hypothesis1.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis1.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! O diagnóstico aponta para loque americana e loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis1.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }

                if (!MauCheiro.equalsIgnoreCase("Sim") && !TesteDoPalito.equalsIgnoreCase("Sim")) { //RIP Loque Americana
                    System.out.println("Foi identificado o opérculo afundado?");
                    OperculoAfundado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foram identificadas larvas mortas ou apodrecidas?");
                        LarvasMortasOuApodrecidas = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (LarvasMortasOuApodrecidas.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mortas ou apodrecidas", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                            System.out.println("Foram identificadas manchas escuras na colmeia?");
                            ManchasEscurasNaColmeia = scanner.nextLine();
                            perguntaManchasEscuras = true;
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mortas ou apodrecidas", "true"));
                            kSession.fireAllRules();

                            System.out.println("Foram identificadas manchas escuras na colmeia?");
                            ManchasEscurasNaColmeia = scanner.nextLine();
                            perguntaManchasEscuras = true;

                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                        kSession.fireAllRules();

                        //RIP Loque Europeia
                    }
                } else {
                    System.out.println("Foi identificado o opérculo afundado?");
                    OperculoAfundado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada a criaçao mal semeada?");
                    CriacaoMalSemeada = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram identificadas manchas escuras na colmeia?");
                    ManchasEscurasNaColmeia = scanner.nextLine();
                    perguntaManchasEscuras = true;

                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi identificado o operculo deprimido ou perfurado?");
                    OperculoDeprimidoOuPerfurado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoDeprimidoOuPerfurado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo deprimido ou perfurado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo deprimido ou perfurado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }

//Acarapiose
                System.out.println("Foi verificada necrose e/ou enegrecimento das traqueias das abelhas?");
                NecroseEEnegrecimentoDasTraqueiasDasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (NecroseEEnegrecimentoDasTraqueiasDasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Necrose e enegrecimento das traqueias das abelhas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                System.exit(0);
                            }
                        }
                    }
                    if (perguntaAbdomenInchado == false) {
                        System.out.println("Foi verificado o abdómen das abelhas inchado?");
                        AbdomenInchado = scanner.nextLine();
                        perguntaAbdomenInchado = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Necrose e enegrecimento das traqueias das abelhas", "true"));
                    kSession.fireAllRules();
                }
                //Ascosferiose
                System.out.println("Foram verificadas larvas mumificadas ou com aspeto engessado?");
                LarvasMumificadas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (LarvasMumificadas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mumificadas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foram verificados opérculos esburacados?");
                    OperculosEsburacados = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculosEsburacados.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculos esburacados", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculos esburacados", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada criação em mosaico");
                    CriacaoEmMosaico = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (CriacaoEmMosaico.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao em mosaico", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao em mosaico", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada ausência de cheiro");
                    AusenciaDeCheiro = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AusenciaDeCheiro.equalsIgnoreCase("Sim")) {

                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Ausencia de cheiro", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Ausencia de cheiro", "true"));
                        kSession.fireAllRules();

                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mumificadas", "true"));
                    kSession.fireAllRules();
                }
                //fim outono

                //verao
                //virose e virus da criaçao ensacada
                System.out.println("Foram verificadas larvas mortas num saco cheio de líquido com a cabeça dentro das células?");
                LarvasMortasNumSacoComLiquido = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (LarvasMortasNumSacoComLiquido.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas Mortas num saco com liquido", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                    MudançaDeCorLarvas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        //Virose
                        System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                        EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                        System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                        FacilidadeRemocaoEscama = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        //ensacada
                        if (perguntaDiminuicaoProdutividade = false) {
                            System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                            DiminuicaoDeProdutividade = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                            GrauDeCerteza = scanner.nextLine();
                            if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                                kSession.fireAllRules();
                            }
                            System.out.println("Foi notada uma diminuição na população de abelhas?");
                            DiminuicaoPopulacao = scanner.nextLine();
                            perguntaMortalidadeAumentada = true;
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                            GrauDeCerteza = scanner.nextLine();
                            if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }

                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas Mortas num saco com liquido", "true"));
                    kSession.fireAllRules();
                    //RIP virus da criaçao ensacada
                    System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                    MudançaDeCorLarvas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        //Virose
                        System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                        EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();

                        }
                        System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                        FacilidadeRemocaoEscama = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                    }
                }
                //Virus da paralisia aguda
                System.out.println("Foi verificada perda de pelo nos corpos das abelhas");
                PerdaDePelo = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (PerdaDePelo.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Perda de pelo", "true"));
                    kSession.fireAllRules();

                    System.out.println("Foi verificado um aspeto luzidio/brilhante no corpo das abelhas?");
                    AspetoLuzidioEBrilhante = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AspetoLuzidioEBrilhante.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Aspeto luzidio e brilhante", "true"));
                        kSession.fireAllRules();

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Aspeto luzidio e brilhante", "true"));
                        kSession.fireAllRules();

                    }
                    System.out.println("Foram verificados movimentos bruscos e tremidos do corpo e das asas nas abelhas?");
                    MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                        kSession.fireAllRules();

                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Perda de pelo", "true"));
                    kSession.fireAllRules();
                }
                //fim verao
//outono
                //Loque Europeia e Americana
                System.out.println("Realizando o teste do palito foi verificada a formação de um filamento viscoso (1 a 2 cm de comprimento) ?");

                TesteDoPalito = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (TesteDoPalito.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                    kSession.fireAllRules();

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                    kSession.fireAllRules();
                }
                System.out.println("Foi identificado mau cheiro na colmeia (cheiro a cola de sapateiro)?");
                MauCheiro = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (MauCheiro.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mau cheiro (cheiro a cola de sapateiro)", "true"));
                    kSession.fireAllRules();

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mau cheiro (cheiro a cola de sapateiro)", "true"));
                    kSession.fireAllRules();

                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                            for (Object obj1 : hypotheses) {
                                if (obj1 instanceof Hypothesis) {
                                    Hypothesis hypothesis1 = (Hypothesis) obj1;
                                    if (hypothesis1.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis1.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! O diagnóstico aponta para loque americana e loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis1.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }

                if (!MauCheiro.equalsIgnoreCase("Sim") && !TesteDoPalito.equalsIgnoreCase("Sim")) { //RIP Loque Americana
                    System.out.println("Foi identificado o opérculo afundado?");
                    OperculoAfundado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foram identificadas larvas mortas ou apodrecidas?");
                        LarvasMortasOuApodrecidas = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (LarvasMortasOuApodrecidas.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mortas ou apodrecidas", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                            System.out.println("Foram identificadas manchas escuras na colmeia?");
                            ManchasEscurasNaColmeia = scanner.nextLine();
                            perguntaManchasEscuras = true;
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mortas ou apodrecidas", "true"));
                            kSession.fireAllRules();

                            System.out.println("Foram identificadas manchas escuras na colmeia?");
                            ManchasEscurasNaColmeia = scanner.nextLine();
                            perguntaManchasEscuras = true;

                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                        kSession.fireAllRules();

                        //RIP Loque Europeia
                    }
                } else {
                    System.out.println("Foi identificado o opérculo afundado?");
                    OperculoAfundado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada a criaçao mal semeada?");
                    CriacaoMalSemeada = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram identificadas manchas escuras na colmeia?");
                    ManchasEscurasNaColmeia = scanner.nextLine();
                    perguntaManchasEscuras = true;

                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi identificado o operculo deprimido ou perfurado?");
                    OperculoDeprimidoOuPerfurado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoDeprimidoOuPerfurado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo deprimido ou perfurado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo deprimido ou perfurado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
                /*for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    } */
//Acarapiose
                /* 
             * 
             * 
                 */
                System.out.println("Foi verificada necrose e/ou enegrecimento das traqueias das abelhas?");
                NecroseEEnegrecimentoDasTraqueiasDasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (NecroseEEnegrecimentoDasTraqueiasDasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Necrose e enegrecimento das traqueias das abelhas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                System.exit(0);
                            }
                        }
                    }
                    if (perguntaAbdomenInchado == false) {
                        System.out.println("Foi verificado o abdómen das abelhas inchado?");
                        AbdomenInchado = scanner.nextLine();
                        perguntaAbdomenInchado = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Necrose e enegrecimento das traqueias das abelhas", "true"));
                    kSession.fireAllRules();
                }
                //Ascosferiose
                System.out.println("Foram verificadas larvas mumificadas ou com aspeto engessado?");
                LarvasMumificadas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (LarvasMumificadas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mumificadas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foram verificados opérculos esburacados?");
                    OperculosEsburacados = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculosEsburacados.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculos esburacados", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculos esburacados", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada criação em mosaico");
                    CriacaoEmMosaico = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (CriacaoEmMosaico.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao em mosaico", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao em mosaico", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada ausência de cheiro");
                    AusenciaDeCheiro = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AusenciaDeCheiro.equalsIgnoreCase("Sim")) {

                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Ausencia de cheiro", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Ausencia de cheiro", "true"));
                        kSession.fireAllRules();

                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mumificadas", "true"));
                    kSession.fireAllRules();
                }
                //fim outono
                //inverno
                //nosemose
                System.out.println("Foi verificado o abdómen das abelhas inchado?");
                AbdomenInchado = scanner.nextLine();
                perguntaAbdomenInchado = true;
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada incapacidade de voar?");
                    IncapacidadeDeVoar = scanner.nextLine();
                    perguntaIncapacidadeVoar = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (IncapacidadeDeVoar.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Incapacidade de voar", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Incapacidade de voar", "true"));
                        kSession.fireAllRules();

                    }
                    if (perguntaManchasEscuras == false) {
                        System.out.println("Foram identificadas manchas escuras na colmeia?");
                        ManchasEscurasNaColmeia = scanner.nextLine();
                        perguntaManchasEscuras = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();

                        }
                    }
                    if (perguntaDiminuicaoProdutividade == false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();

                        }
                    }

                    if (perguntaMortalidadeAumentada == false) {
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();

                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                    kSession.fireAllRules();
                }
                /* */
                //Varroa 
                System.out.println("Foram identificados ácaros vermelhos nas abelhas?");
                AcarosVermelhosNasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AcarosVermelhosNasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Acaros vermelhos nas abelhas", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foram idenfiticadas deformidades nas asas?");
                    DeformidadesNasAsas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DeformidadesNasAsas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Deformidades nas asas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Deformidades nas asas", "true"));
                        kSession.fireAllRules();

                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                    if (perguntaDiminuicaoProdutividade == false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();

                        }
                    }
                    if (perguntaMortalidadeAumentada == false) {
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();

                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Acaros vermelhos nas abelhas", "true"));
                    kSession.fireAllRules();
                }

                //Fome
                System.out.println("Foram identificadas faltas de reservas na colmeia?");
                FaltaDeReservas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (FaltaDeReservas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Falta de reservas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi notória uma diminuição no tamanho das abelhas?");
                    DiminuicaoDoTamanhoDasAbelhas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDoTamanhoDasAbelhas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao do tamanho das abelhas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao do tamanho das abelhas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram identificadas abelhas mortas no interior da colmeia?");
                    AbelhasMortasComACabeçaDentroDasCelulas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbelhasMortasComACabeçaDentroDasCelulas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    }

                } else {

                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Falta de reservas", "true"));
                    kSession.fireAllRules();
                }
                //fim inverno

                // Envenenamento por pesticidas
                System.out.println("Foram verificadas abelhas mortas dentro da colmeia em diferentes estados de desenvolvimento?");
                AbelhasMortasDiferentesFasesDeDesenvolvimento = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (AbelhasMortasDiferentesFasesDeDesenvolvimento.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em diferentes estados de desenvolvimento", "true"));

                    System.out.println("Foram verificadas abelhas mortas na entrada da colmeia, em forma de 'cauda de cometa'?");
                    AbelhasMortasEmCaudaDeCometa = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbelhasMortasEmCaudaDeCometa.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em forma de cauda de cometa", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foi verificada uma quebra de vigor na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                        }
                        kSession.fireAllRules();

                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em forma de cauda de cometa", "true"));
                        kSession.fireAllRules();
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em diferentes estados de desenvolvimento", "true"));
                    kSession.fireAllRules();
                }
                //fim
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if ((hypothesis.getCf() > 0.5)) {
                            System.out.println("Diagnóstico Finalizado! Existe alguma incerteza, mas o mais provável é " + hypothesis.getDescription());
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Não há conhecimento suficiente para fazer um diagnóstico, por favor contacte a DGAV.");
                System.exit(0);

            }
            if (estacao.equalsIgnoreCase("Inverno")) {
                //inverno
                //nosemose
                System.out.println("Foi verificado o abdómen das abelhas inchado?");
                AbdomenInchado = scanner.nextLine();
                perguntaAbdomenInchado = true;
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada incapacidade de voar?");
                    IncapacidadeDeVoar = scanner.nextLine();
                    perguntaIncapacidadeVoar = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (IncapacidadeDeVoar.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Incapacidade de voar", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Incapacidade de voar", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    if (perguntaManchasEscuras == false) {
                        System.out.println("Foram identificadas manchas escuras na colmeia?");
                        ManchasEscurasNaColmeia = scanner.nextLine();
                        perguntaManchasEscuras = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                    if (perguntaDiminuicaoProdutividade == false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                    if (perguntaMortalidadeAumentada == false) {
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                    kSession.fireAllRules();
                }
                /* */
                //Varroa 
                System.out.println("Foram identificados ácaros vermelhos nas abelhas?");
                AcarosVermelhosNasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AcarosVermelhosNasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Acaros vermelhos nas abelhas", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foram idenfiticadas deformidades nas asas?");
                    DeformidadesNasAsas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DeformidadesNasAsas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Deformidades nas asas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Deformidades nas asas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                    if (perguntaDiminuicaoProdutividade == false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                    if (perguntaMortalidadeAumentada == false) {
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Acaros vermelhos nas abelhas", "true"));
                    kSession.fireAllRules();
                }

                //Fome
                System.out.println("Foram identificadas faltas de reservas na colmeia?");
                FaltaDeReservas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (FaltaDeReservas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Falta de reservas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi notória uma diminuição no tamanho das abelhas?");
                    DiminuicaoDoTamanhoDasAbelhas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDoTamanhoDasAbelhas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao do tamanho das abelhas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao do tamanho das abelhas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram identificadas abelhas mortas no interior da colmeia?");
                    AbelhasMortasComACabeçaDentroDasCelulas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbelhasMortasComACabeçaDentroDasCelulas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    }

                } else {

                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Falta de reservas", "true"));
                    kSession.fireAllRules();
                }
                //fim inverno
//outono
                //Loque Europeia e Americana
                System.out.println("Realizando o teste do palito foi verificada a formação de um filamento viscoso (1 a 2 cm de comprimento) ?");

                TesteDoPalito = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (TesteDoPalito.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                    kSession.fireAllRules();

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                    kSession.fireAllRules();
                }
                System.out.println("Foi identificado mau cheiro na colmeia (cheiro a cola de sapateiro)?");
                MauCheiro = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (MauCheiro.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mau cheiro (cheiro a cola de sapateiro)", "true"));
                    kSession.fireAllRules();

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mau cheiro (cheiro a cola de sapateiro)", "true"));
                    kSession.fireAllRules();

                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                            for (Object obj1 : hypotheses) {
                                if (obj1 instanceof Hypothesis) {
                                    Hypothesis hypothesis1 = (Hypothesis) obj1;
                                    if (hypothesis1.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis1.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! O diagnóstico aponta para loque americana e loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis1.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }

                if (!MauCheiro.equalsIgnoreCase("Sim") && !TesteDoPalito.equalsIgnoreCase("Sim")) { //RIP Loque Americana
                    System.out.println("Foi identificado o opérculo afundado?");
                    OperculoAfundado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foram identificadas larvas mortas ou apodrecidas?");
                        LarvasMortasOuApodrecidas = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (LarvasMortasOuApodrecidas.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mortas ou apodrecidas", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                            System.out.println("Foram identificadas manchas escuras na colmeia?");
                            ManchasEscurasNaColmeia = scanner.nextLine();
                            perguntaManchasEscuras = true;
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mortas ou apodrecidas", "true"));
                            kSession.fireAllRules();

                            System.out.println("Foram identificadas manchas escuras na colmeia?");
                            ManchasEscurasNaColmeia = scanner.nextLine();
                            perguntaManchasEscuras = true;

                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                                System.out.println("Foi verificada a criaçao mal semeada?");
                                CriacaoMalSemeada = scanner.nextLine();
                                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                                GrauDeCerteza = scanner.nextLine();
                                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                } else {
                                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                    kSession.fireAllRules();
                                    for (Object obj : hypotheses) {
                                        if (obj instanceof Hypothesis) {
                                            Hypothesis hypothesis = (Hypothesis) obj;
                                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                        kSession.fireAllRules();

                        //RIP Loque Europeia
                    }
                } else {
                    System.out.println("Foi identificado o opérculo afundado?");
                    OperculoAfundado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada a criaçao mal semeada?");
                    CriacaoMalSemeada = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram identificadas manchas escuras na colmeia?");
                    ManchasEscurasNaColmeia = scanner.nextLine();
                    perguntaManchasEscuras = true;

                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi identificado o operculo deprimido ou perfurado?");
                    OperculoDeprimidoOuPerfurado = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculoDeprimidoOuPerfurado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo deprimido ou perfurado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo deprimido ou perfurado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
                /*for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    } */
//Acarapiose
                /* 
             * 
             * 
                 */
                System.out.println("Foi verificada necrose e/ou enegrecimento das traqueias das abelhas?");
                NecroseEEnegrecimentoDasTraqueiasDasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (NecroseEEnegrecimentoDasTraqueiasDasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Necrose e enegrecimento das traqueias das abelhas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                System.exit(0);
                            }
                        }
                    }
                    if (perguntaAbdomenInchado == false) {
                        System.out.println("Foi verificado o abdómen das abelhas inchado?");
                        AbdomenInchado = scanner.nextLine();
                        perguntaAbdomenInchado = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Necrose e enegrecimento das traqueias das abelhas", "true"));
                    kSession.fireAllRules();
                }
                //Ascosferiose
                System.out.println("Foram verificadas larvas mumificadas ou com aspeto engessado?");
                LarvasMumificadas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (LarvasMumificadas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mumificadas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foram verificados opérculos esburacados?");
                    OperculosEsburacados = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (OperculosEsburacados.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculos esburacados", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculos esburacados", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada criação em mosaico");
                    CriacaoEmMosaico = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (CriacaoEmMosaico.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao em mosaico", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao em mosaico", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foi verificada ausência de cheiro");
                    AusenciaDeCheiro = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AusenciaDeCheiro.equalsIgnoreCase("Sim")) {

                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Ausencia de cheiro", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Ausencia de cheiro", "true"));
                        kSession.fireAllRules();

                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mumificadas", "true"));
                    kSession.fireAllRules();
                }
                //fim outono

                //verao
                //virose e virus da criaçao ensacada
                System.out.println("Foram verificadas larvas mortas num saco cheio de líquido com a cabeça dentro das células?");
                LarvasMortasNumSacoComLiquido = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (LarvasMortasNumSacoComLiquido.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas Mortas num saco com liquido", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                    MudançaDeCorLarvas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        //Virose
                        System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                        EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                        System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                        FacilidadeRemocaoEscama = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        //ensacada
                        if (perguntaDiminuicaoProdutividade = false) {
                            System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                            DiminuicaoDeProdutividade = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                            GrauDeCerteza = scanner.nextLine();
                            if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                                kSession.fireAllRules();
                            }
                            System.out.println("Foi notada uma diminuição na população de abelhas?");
                            DiminuicaoPopulacao = scanner.nextLine();
                            perguntaMortalidadeAumentada = true;
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                            GrauDeCerteza = scanner.nextLine();
                            if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }

                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas Mortas num saco com liquido", "true"));
                    kSession.fireAllRules();
                    //RIP virus da criaçao ensacada
                    System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                    MudançaDeCorLarvas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        //Virose
                        System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                        EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                        System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                        FacilidadeRemocaoEscama = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                    }
                }
                //Virus da paralisia aguda
                System.out.println("Foi verificada perda de pelo nos corpos das abelhas");
                PerdaDePelo = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (PerdaDePelo.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Perda de pelo", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi verificado um aspeto luzidio/brilhante no corpo das abelhas?");
                    AspetoLuzidioEBrilhante = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AspetoLuzidioEBrilhante.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Aspeto luzidio e brilhante", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Aspeto luzidio e brilhante", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram verificados movimentos bruscos e tremidos do corpo e das asas nas abelhas?");
                    MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Perda de pelo", "true"));
                    kSession.fireAllRules();
                }
                //fim verao

                // Envenenamento por pesticidas
                System.out.println("Foram verificadas abelhas mortas dentro da colmeia em diferentes estados de desenvolvimento?");
                AbelhasMortasDiferentesFasesDeDesenvolvimento = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (AbelhasMortasDiferentesFasesDeDesenvolvimento.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em diferentes estados de desenvolvimento", "true"));

                    System.out.println("Foram verificadas abelhas mortas na entrada da colmeia, em forma de 'cauda de cometa'?");
                    AbelhasMortasEmCaudaDeCometa = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbelhasMortasEmCaudaDeCometa.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em forma de cauda de cometa", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foi verificada uma quebra de vigor na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                        }
                        kSession.fireAllRules();

                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em forma de cauda de cometa", "true"));
                        kSession.fireAllRules();
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em diferentes estados de desenvolvimento", "true"));
                    kSession.fireAllRules();
                }
                //fim
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if ((hypothesis.getCf() > 0.5)) {
                            System.out.println("Diagnóstico Finalizado! Existe alguma incerteza, mas o mais provável é " + hypothesis.getDescription());
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Não há conhecimento suficiente para fazer um diagnóstico, por favor contacte a DGAV.");
                System.exit(0);

            }
            if (estacao.equalsIgnoreCase("Verao")) {

                //verao
                //virose e virus da criaçao ensacada
                System.out.println("Foram verificadas larvas mortas num saco cheio de líquido com a cabeça dentro das células?");
                LarvasMortasNumSacoComLiquido = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (LarvasMortasNumSacoComLiquido.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas Mortas num saco com liquido", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                    MudançaDeCorLarvas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        //Virose
                        System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                        EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                        System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                        FacilidadeRemocaoEscama = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                        }
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        //ensacada
                        if (perguntaDiminuicaoProdutividade = false) {
                            System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                            DiminuicaoDeProdutividade = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                            GrauDeCerteza = scanner.nextLine();
                            if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                                kSession.fireAllRules();
                            }
                            System.out.println("Foi notada uma diminuição na população de abelhas?");
                            DiminuicaoPopulacao = scanner.nextLine();
                            perguntaMortalidadeAumentada = true;
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                            GrauDeCerteza = scanner.nextLine();
                            if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }

                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas Mortas num saco com liquido", "true"));
                    kSession.fireAllRules();
                    //RIP virus da criaçao ensacada
                    System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                    MudançaDeCorLarvas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        //Virose
                        System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                        EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                        System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                        FacilidadeRemocaoEscama = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                        kSession.fireAllRules();
                    }
                }
                //Virus da paralisia aguda
                System.out.println("Foi verificada perda de pelo nos corpos das abelhas");
                PerdaDePelo = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (PerdaDePelo.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Perda de pelo", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi verificado um aspeto luzidio/brilhante no corpo das abelhas?");
                    AspetoLuzidioEBrilhante = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AspetoLuzidioEBrilhante.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Aspeto luzidio e brilhante", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Aspeto luzidio e brilhante", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram verificados movimentos bruscos e tremidos do corpo e das asas nas abelhas?");
                    MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }

                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Perda de pelo", "true"));
                    kSession.fireAllRules();
                }
                //fim verao

                //inverno
                //nosemose
                System.out.println("Foi verificado o abdómen das abelhas inchado?");
                AbdomenInchado = scanner.nextLine();
                perguntaAbdomenInchado = true;
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada incapacidade de voar?");
                    IncapacidadeDeVoar = scanner.nextLine();
                    perguntaIncapacidadeVoar = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (IncapacidadeDeVoar.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Incapacidade de voar", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Incapacidade de voar", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    if (perguntaManchasEscuras == false) {
                        System.out.println("Foram identificadas manchas escuras na colmeia?");
                        ManchasEscurasNaColmeia = scanner.nextLine();
                        perguntaManchasEscuras = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                    if (perguntaDiminuicaoProdutividade == false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                    if (perguntaMortalidadeAumentada == false) {
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                    kSession.fireAllRules();
                }
                /* */
                //Varroa 
                System.out.println("Foram identificados ácaros vermelhos nas abelhas?");
                AcarosVermelhosNasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AcarosVermelhosNasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Acaros vermelhos nas abelhas", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foram idenfiticadas deformidades nas asas?");
                    DeformidadesNasAsas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DeformidadesNasAsas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Deformidades nas asas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Deformidades nas asas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                    if (perguntaDiminuicaoProdutividade == false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                    if (perguntaMortalidadeAumentada == false) {
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Acaros vermelhos nas abelhas", "true"));
                    kSession.fireAllRules();
                }

                //Fome
                System.out.println("Foram identificadas faltas de reservas na colmeia?");
                FaltaDeReservas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (FaltaDeReservas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Falta de reservas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi notória uma diminuição no tamanho das abelhas?");
                    DiminuicaoDoTamanhoDasAbelhas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDoTamanhoDasAbelhas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao do tamanho das abelhas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao do tamanho das abelhas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Foram identificadas abelhas mortas no interior da colmeia?");
                    AbelhasMortasComACabeçaDentroDasCelulas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbelhasMortasComACabeçaDentroDasCelulas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }

                    }

                } else {

                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Falta de reservas", "true"));
                    kSession.fireAllRules();
                }
                //fim inverno

                // Envenenamento por pesticidas
                System.out.println("Foram verificadas abelhas mortas dentro da colmeia em diferentes estados de desenvolvimento?");
                AbelhasMortasDiferentesFasesDeDesenvolvimento = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (AbelhasMortasDiferentesFasesDeDesenvolvimento.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em diferentes estados de desenvolvimento", "true"));

                    System.out.println("Foram verificadas abelhas mortas na entrada da colmeia, em forma de 'cauda de cometa'?");
                    AbelhasMortasEmCaudaDeCometa = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbelhasMortasEmCaudaDeCometa.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em forma de cauda de cometa", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foi verificada uma quebra de vigor na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        perguntaDiminuicaoProdutividade = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                        }
                        kSession.fireAllRules();

                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em forma de cauda de cometa", "true"));
                        kSession.fireAllRules();
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em diferentes estados de desenvolvimento", "true"));
                    kSession.fireAllRules();
                }

                //fim
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if ((hypothesis.getCf() > 0.5)) {
                            System.out.println("Diagnóstico Finalizado! Existe alguma incerteza, mas o mais provável é " + hypothesis.getDescription());
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Não há conhecimento suficiente para fazer um diagnóstico, por favor contacte a DGAV.");
                System.exit(0);


            }
            if (estacao.equalsIgnoreCase("Primavera")) {
                System.out.println("Nelson4");
            }
            //outono
            //Loque Europeia e Americana
            System.out.println("Foi identificado mau cheiro na colmeia (cheiro a cola de sapateiro)?");
            MauCheiro = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
            GrauDeCerteza = scanner.nextLine();
            if (MauCheiro.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mau cheiro (cheiro a cola de sapateiro)", "true"));
                kSession.fireAllRules();

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mau cheiro (cheiro a cola de sapateiro)", "true"));
                kSession.fireAllRules();

            }
            System.out.println("Realizando o teste do palito foi verificada a formação de um filamento viscoso (1 a 2 cm de comprimento) ?");

            TesteDoPalito = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
            GrauDeCerteza = scanner.nextLine();
            if (TesteDoPalito.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                kSession.fireAllRules();

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Teste do palito (formacao de filamento visocoso de 1 a 2 cm de comprimento)", "true"));
                kSession.fireAllRules();
            }
           
            for (Object obj : hypotheses) {
                if (obj instanceof Hypothesis) {
                    Hypothesis hypothesis = (Hypothesis) obj;
                    if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                        for (Object obj1 : hypotheses) {
                            if (obj1 instanceof Hypothesis) {
                                Hypothesis hypothesis1 = (Hypothesis) obj1;
                                if (hypothesis1.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis1.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! O diagnóstico aponta para loque americana e loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis1.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
            }
            for (Object obj : hypotheses) {
                if (obj instanceof Hypothesis) {
                    Hypothesis hypothesis = (Hypothesis) obj;
                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                        System.exit(0);
                    }
                }
            }
            for (Object obj : hypotheses) {
                if (obj instanceof Hypothesis) {
                    Hypothesis hypothesis = (Hypothesis) obj;
                    if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                        System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                        System.exit(0);
                    }
                }
            }

            if (!MauCheiro.equalsIgnoreCase("Sim") && !TesteDoPalito.equalsIgnoreCase("Sim")) { //RIP Loque Americana
                System.out.println("Foi identificado o opérculo afundado?");
                OperculoAfundado = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foram identificadas larvas mortas ou apodrecidas?");
                    LarvasMortasOuApodrecidas = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (LarvasMortasOuApodrecidas.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mortas ou apodrecidas", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Foram identificadas manchas escuras na colmeia?");
                        ManchasEscurasNaColmeia = scanner.nextLine();
                        perguntaManchasEscuras = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                            System.out.println("Foi verificada a criaçao mal semeada?");
                            CriacaoMalSemeada = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            System.out.println("Foi verificada a criaçao mal semeada?");
                            CriacaoMalSemeada = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mortas ou apodrecidas", "true"));
                        kSession.fireAllRules();

                        System.out.println("Foram identificadas manchas escuras na colmeia?");
                        ManchasEscurasNaColmeia = scanner.nextLine();
                        perguntaManchasEscuras = true;

                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                        GrauDeCerteza = scanner.nextLine();
                        if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                            System.out.println("Foi verificada a criaçao mal semeada?");
                            CriacaoMalSemeada = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                        System.exit(0);
                                    }
                                }
                            }
                            System.out.println("Foi verificada a criaçao mal semeada?");
                            CriacaoMalSemeada = scanner.nextLine();
                            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                            GrauDeCerteza = scanner.nextLine();
                            if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            } else {
                                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                                kSession.fireAllRules();
                                for (Object obj : hypotheses) {
                                    if (obj instanceof Hypothesis) {
                                        Hypothesis hypothesis = (Hypothesis) obj;
                                        if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                            System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                    kSession.fireAllRules();

                    //RIP Loque Europeia
                }
            } else {
                System.out.println("Foi identificado o opérculo afundado?");
                OperculoAfundado = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (OperculoAfundado.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo afundado", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo afundado", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foi verificada a criaçao mal semeada?");
                CriacaoMalSemeada = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (CriacaoMalSemeada.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao mal semeada", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao mal semeada", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foram identificadas manchas escuras na colmeia?");
                ManchasEscurasNaColmeia = scanner.nextLine();
                perguntaManchasEscuras = true;

                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foi identificado o operculo deprimido ou perfurado?");
                OperculoDeprimidoOuPerfurado = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (OperculoDeprimidoOuPerfurado.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculo deprimido ou perfurado", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculo deprimido ou perfurado", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueeuropeia") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque europeia");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("loqueamericana") && (hypothesis.getCf() > 0.75)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de loque americana");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                }
            }
            /*for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    } */
//Acarapiose
            /* 
             * 
             * 
             */
            System.out.println("Foi verificada necrose e/ou enegrecimento das traqueias das abelhas?");
            NecroseEEnegrecimentoDasTraqueiasDasAbelhas = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (NecroseEEnegrecimentoDasTraqueiasDasAbelhas.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Necrose e enegrecimento das traqueias das abelhas", "true"));
                kSession.fireAllRules();
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                            System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                            System.exit(0);
                        }
                    }
                }
                if (perguntaAbdomenInchado == false) {
                    System.out.println("Foi verificado o abdómen das abelhas inchado?");
                    AbdomenInchado = scanner.nextLine();
                    perguntaAbdomenInchado = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("acarapiose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de acarapiose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Necrose e enegrecimento das traqueias das abelhas", "true"));
                kSession.fireAllRules();
            }
            //Ascosferiose
            System.out.println("Foram verificadas larvas mumificadas ou com aspeto engessado?");
            LarvasMumificadas = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (LarvasMumificadas.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas mumificadas", "true"));
                kSession.fireAllRules();
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Foram verificados opérculos esburacados?");
                OperculosEsburacados = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (OperculosEsburacados.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Operculos esburacados", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Operculos esburacados", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foi verificada criação em mosaico");
                CriacaoEmMosaico = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (CriacaoEmMosaico.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Criacao em mosaico", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Criacao em mosaico", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foi verificada ausência de cheiro");
                AusenciaDeCheiro = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AusenciaDeCheiro.equalsIgnoreCase("Sim")) {

                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Ausencia de cheiro", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("ascosferiose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de ascosferiose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Ausencia de cheiro", "true"));
                    kSession.fireAllRules();

                }

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas mumificadas", "true"));
                kSession.fireAllRules();
            }
            //fim outono

            //verao
            //virose e virus da criaçao ensacada
            System.out.println("Foram verificadas larvas mortas num saco cheio de líquido com a cabeça dentro das células?");
            LarvasMortasNumSacoComLiquido = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (LarvasMortasNumSacoComLiquido.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Larvas Mortas num saco com liquido", "true"));
                kSession.fireAllRules();
                System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                MudançaDeCorLarvas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    //Virose
                    System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                    EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                    FacilidadeRemocaoEscama = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                        kSession.fireAllRules();
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                    kSession.fireAllRules();
                    //ensacada
                    if (perguntaDiminuicaoProdutividade = false) {
                        System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                        DiminuicaoDeProdutividade = scanner.nextLine();
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                            kSession.fireAllRules();
                        }
                        System.out.println("Foi notada uma diminuição na população de abelhas?");
                        DiminuicaoPopulacao = scanner.nextLine();
                        perguntaMortalidadeAumentada = true;
                        System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                        GrauDeCerteza = scanner.nextLine();
                        if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        } else {
                            kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                            kSession.fireAllRules();
                            for (Object obj : hypotheses) {
                                if (obj instanceof Hypothesis) {
                                    Hypothesis hypothesis = (Hypothesis) obj;
                                    if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                        System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                        System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("Foi notada uma diminuição na população de abelhas?");
                    DiminuicaoPopulacao = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    perguntaMortalidadeAumentada = true;
                    if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virusdacriacaoensacada") && (hypothesis.getCf() > 0.75)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virus da criação ensacada");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }

                }
            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Larvas Mortas num saco com liquido", "true"));
                kSession.fireAllRules();
                //RIP virus da criaçao ensacada
                System.out.println("Foi verificada a mudança de cor das larvas de branco pérola para amarelo pálido?");
                MudançaDeCorLarvas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (MudançaDeCorLarvas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mudanca de cor das larvas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                    //Virose
                    System.out.println("Foi verificada uma escama castanha escura após a morte da larva, com forma de gôndola?");
                    EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Escama castanha apos a morte da larva com forma de gondola", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Escama castanha apos a morte da larva com forma de gondola", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                    System.out.println("Existe facilidade na remoção da escama da larva com um palito?");
                    FacilidadeRemocaoEscama = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (FacilidadeRemocaoEscama.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Facilidade de remocao da escama da larva com um palito", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Facilidade de remocao da escama da larva com um palito", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("virose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de virose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mudanca de cor das larvas", "true"));
                    kSession.fireAllRules();
                }
            }
            //Virus da paralisia aguda
            System.out.println("Foi verificada perda de pelo nos corpos das abelhas");
            PerdaDePelo = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (PerdaDePelo.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Perda de pelo", "true"));
                kSession.fireAllRules();
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }
                System.out.println("Foi verificado um aspeto luzidio/brilhante no corpo das abelhas?");
                AspetoLuzidioEBrilhante = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AspetoLuzidioEBrilhante.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Aspeto luzidio e brilhante", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Aspeto luzidio e brilhante", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foram verificados movimentos bruscos e tremidos do corpo e das asas nas abelhas?");
                MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Movimentos Bruscos e tremidos do corpo e asas das abelhas infetadas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("virusdaparalisiaaguda") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de virusdaparalisiaaguda");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }

                }

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Perda de pelo", "true"));
                kSession.fireAllRules();
            }
            //fim verao

            //inverno
            //nosemose
            System.out.println("Foi verificado o abdómen das abelhas inchado?");
            AbdomenInchado = scanner.nextLine();
            perguntaAbdomenInchado = true;
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (AbdomenInchado.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abdomen inchado", "true"));
                kSession.fireAllRules();
                System.out.println("Foi verificada incapacidade de voar?");
                IncapacidadeDeVoar = scanner.nextLine();
                perguntaIncapacidadeVoar = true;
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (IncapacidadeDeVoar.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Incapacidade de voar", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Incapacidade de voar", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                }
                if (perguntaManchasEscuras == false) {
                    System.out.println("Foram identificadas manchas escuras na colmeia?");
                    ManchasEscurasNaColmeia = scanner.nextLine();
                    perguntaManchasEscuras = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (ManchasEscurasNaColmeia.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Manchas escuras na colmeia", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
                if (perguntaDiminuicaoProdutividade == false) {
                    System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                    DiminuicaoDeProdutividade = scanner.nextLine();
                    perguntaDiminuicaoProdutividade = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }

                if (perguntaMortalidadeAumentada == false) {
                    System.out.println("Foi notada uma diminuição na população de abelhas?");
                    DiminuicaoPopulacao = scanner.nextLine();
                    perguntaMortalidadeAumentada = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("nosemose") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de nosemose");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abdomen inchado", "true"));
                kSession.fireAllRules();
            }
            /* */
            //Varroa 
            System.out.println("Foram identificados ácaros vermelhos nas abelhas?");
            AcarosVermelhosNasAbelhas = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (AcarosVermelhosNasAbelhas.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Acaros vermelhos nas abelhas", "true"));
                kSession.fireAllRules();
                System.out.println("Foram idenfiticadas deformidades nas asas?");
                DeformidadesNasAsas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (DeformidadesNasAsas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Deformidades nas asas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Deformidades nas asas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                }
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                            System.exit(0);
                        }
                    }
                }
                if (perguntaDiminuicaoProdutividade == false) {
                    System.out.println("Foi verificada uma quebra de produtividade na colónia?");
                    DiminuicaoDeProdutividade = scanner.nextLine();
                    perguntaDiminuicaoProdutividade = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
                if (perguntaMortalidadeAumentada == false) {
                    System.out.println("Foi notada uma diminuição na população de abelhas?");
                    DiminuicaoPopulacao = scanner.nextLine();
                    perguntaMortalidadeAumentada = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoPopulacao.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Mortalidade aumentada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Mortalidade aumentada", "true"));
                        kSession.fireAllRules();
                        for (Object obj : hypotheses) {
                            if (obj instanceof Hypothesis) {
                                Hypothesis hypothesis = (Hypothesis) obj;
                                if (hypothesis.getDescription().equalsIgnoreCase("varroa") && (hypothesis.getCf() > 0.7)) {
                                    System.out.println("Diagnóstico Finalizado! Trata-se de varroa");
                                    System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                    System.exit(0);
                                }
                            }
                        }
                    }
                }

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Acaros vermelhos nas abelhas", "true"));
                kSession.fireAllRules();
            }

            //Fome
            System.out.println("Foram identificadas faltas de reservas na colmeia?");
            FaltaDeReservas = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
            GrauDeCerteza = scanner.nextLine();
            if (FaltaDeReservas.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Falta de reservas", "true"));
                kSession.fireAllRules();
                for (Object obj : hypotheses) {
                    if (obj instanceof Hypothesis) {
                        Hypothesis hypothesis = (Hypothesis) obj;
                        if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                            System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                            System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Foi notória uma diminuição no tamanho das abelhas?");
                DiminuicaoDoTamanhoDasAbelhas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (DiminuicaoDoTamanhoDasAbelhas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao do tamanho das abelhas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao do tamanho das abelhas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println("Foram identificadas abelhas mortas no interior da colmeia?");
                AbelhasMortasComACabeçaDentroDasCelulas = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)?");
                GrauDeCerteza = scanner.nextLine();
                if (AbelhasMortasComACabeçaDentroDasCelulas.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas com a cabeca dentro das celulas", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("fome") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de fome");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");
                                System.exit(0);
                            }
                        }
                    }

                }

            } else {

                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Falta de reservas", "true"));
                kSession.fireAllRules();
            }
            //fim inverno

            // Envenenamento por pesticidas
            System.out.println("Foram verificadas abelhas mortas dentro da colmeia em diferentes estados de desenvolvimento?");
            AbelhasMortasDiferentesFasesDeDesenvolvimento = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
            GrauDeCerteza = scanner.nextLine();
            if (AbelhasMortasDiferentesFasesDeDesenvolvimento.equalsIgnoreCase("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em diferentes estados de desenvolvimento", "true"));

                System.out.println("Foram verificadas abelhas mortas na entrada da colmeia, em forma de 'cauda de cometa'?");
                AbelhasMortasEmCaudaDeCometa = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (AbelhasMortasEmCaudaDeCometa.equalsIgnoreCase("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em forma de cauda de cometa", "true"));
                    kSession.fireAllRules();
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi verificada uma quebra de vigor na colónia?");
                    DiminuicaoDeProdutividade = scanner.nextLine();
                    perguntaDiminuicaoProdutividade = true;
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDeProdutividade.equalsIgnoreCase("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                    } else {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Diminuicao de produtividade", "true"));
                    }
                    kSession.fireAllRules();

                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                System.out.println("Grau de confiança mínimo: " + String.format("%.2f", hypothesis.getCf() * 100) + "%");

                                System.exit(0);
                            }
                        }
                    }
                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em forma de cauda de cometa", "true"));
                    kSession.fireAllRules();
                }
            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em diferentes estados de desenvolvimento", "true"));
                kSession.fireAllRules();
            }

            //fim
            for (Object obj : hypotheses) {
                if (obj instanceof Hypothesis) {
                    Hypothesis hypothesis = (Hypothesis) obj;
                    if ((hypothesis.getCf() > 0.5)) {
                        System.out.println("Diagnóstico Finalizado! Existe alguma incerteza, mas o mais provável é " + hypothesis.getDescription());
                        System.exit(0);
                    }
                }
            }
            System.out.println("Não há conhecimento suficiente para fazer um diagnóstico, por favor contacte a DGAV.");
            System.exit(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static double CheckGrauCerteza(String grauCerteza) {
        if (grauCerteza.equalsIgnoreCase("Pouca")) {
            return 0.40;
        }
        if (grauCerteza.equalsIgnoreCase("Intermedia")) {
            return 0.70;
        }
        if (grauCerteza.equalsIgnoreCase("Muita")) {
            return 0.90;
        }
        return 0.0;
    }
}
