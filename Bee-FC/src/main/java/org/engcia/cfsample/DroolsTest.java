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
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");
            Scanner scanner = new Scanner(System.in);
            Collection<?> hypotheses = kSession.getObjects();
            // Agenda listener
            kSession.addEventListener(new TrackingAgendaListener());

            // Facts listener
            kSession.addEventListener(new FactListener());

            // go !
            kSession.insert(new Hypothesis(0.0, "varroa", "true"));
            kSession.insert(new Hypothesis(0.0, "nosemose", "true"));
            kSession.insert(new Hypothesis(0.0, "virusdacriacaoensacada", "true"));
            kSession.insert(new Hypothesis(0.0, "envenenamento", "true"));
            kSession.insert(new Hypothesis(0.0, "fome", "true"));
            kSession.insert(new Hypothesis(0.0, "acarapisose", "true"));
            kSession.insert(new Hypothesis(0.0, "loqueeuropeia", "true"));
            kSession.insert(new Hypothesis(0.0, "loqueamericana", "true"));
            kSession.insert(new Hypothesis(0.0, "ascosferiose", "true"));
            kSession.insert(new Hypothesis(0.0, "virose", "true"));
            kSession.insert(new Hypothesis(0.0, "virusdaparalisiaaguda", "true"));

            int CfObsAbelhasMortasDiferentesFasesDeDesenvolvimento, CfObsMortalidadeAumentada, CfObsDeformidadesNasAsas, CfObsDiminuicaoDeProdutividade, CfObsAcarosVermelhosNasAbelhas, CfObsAbdomenInchado, CfObsIncapacidadeDeVoar, CfObsManchasEscurasNaColmeia, CfObsLarvasMortasOuApodrecidas, CfObsOperculoDeprimidoOuPerfurado, CfObsCriacaoMalSemeada, CfObsMauCheiro, CfObsTesteDoPalito, CfObsOperculoAfundado, CfObsLarvasMumificadas, CfObsOperculosEsburacados, CfObsCriacaoEmMosaico, CfObsAusenciaDeCheiro, CfObsLarvasMortasNumSacoComLiquido, CfObsMudançaDeCorLarvas, CfObsEscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola, CfObsNecroseEEnegrecimentoDasTraqueiasDasAbelhas, CfObsAbelhasArrastaremSe, CfObsAbelhasMortasNaEntradaDaColmeia, CfObsAbelhasMortasEmCaudaDeCometa, CfObsAblehasMortasEmDiferentesEstadosDeDesenvolvimento, CfObsAbelhasMortasComACabeçaDentroDasCelulas, CfObsDiminuicaoDoTamanhoDasAbelhas, CfObsFaltaDeReservas, CfObsPerdaDePelo, CfObsMovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas, CfObsAspetoLuzidioEBrilhante;
            final int CfObsVerao = 1, CfObsInverno = 1, CfObsPrimavera = 1, CfObsOutono = 1;
            String estacao, GrauDeCerteza;
            String MortalidadeAumentada, AbelhasMortasDiferentesFasesDeDesenvolvimento, DeformidadesNasAsas, DiminuicaoDeProdutividade, AcarosVermelhosNasAbelhas, AbdomenInchado, IncapacidadeDeVoar, ManchasEscurasNaColmeia, LarvasMortasOuApodrecidas, OperculoDeprimidoOuPerfurado, CriacaoMalSemeada, MauCheiro, TesteDoPalito, OperculoAfundado, LarvasMumificadas, OperculosEsburacados, CriacaoEmMosaico, AusenciaDeCheiro, LarvasMortasNumSacoComLiquido, MudançaDeCorLarvas, EscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola, NecroseEEnegrecimentoDasTraqueiasDasAbelhas, AbelhasArrastaremSe, AbelhasMortasNaEntradaDaColmeia, AbelhasMortasEmCaudaDeCometa, AblehasMortasEmDiferentesEstadosDeDesenvolvimento, AbelhasMortasComACabeçaDentroDasCelulas, DiminuicaoDoTamanhoDasAbelhas, FaltaDeReservas, PerdaDePelo, MovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas, AspetoLuzidioEBrilhante;

            System.out.println("Olá, caro utilizador! Por favor responda às próximas perguntas com os detalhes do que observou");
            System.out.println("-----------------------------------------------");
            System.out.println("Em que estação do ano se encontra?");
            estacao = scanner.nextLine();
            if (estacao.equals("Verão")) {
                kSession.insert(new Evidence(CfObsVerao, "Verao", "true"));
                kSession.fireAllRules();

            }
            if (estacao.equals("Inverno")) {
                kSession.insert(new Evidence(CfObsInverno, "Inverno", "true"));
                kSession.fireAllRules();

            }
            if (estacao.equals("Outono")) {
                kSession.insert(new Evidence(CfObsOutono, "Outono", "true"));
                kSession.fireAllRules();

            }
            if (estacao.equals("Primavera")) {
                kSession.insert(new Evidence(CfObsPrimavera, "Primavera", "true"));
                kSession.fireAllRules();
            }

            //Envenenamento por pesticidas
            System.out.println("Foram verificadas abelhas mortas dentro da colmeia em diferentes estados de desenvolvimento?");
            AbelhasMortasDiferentesFasesDeDesenvolvimento = scanner.nextLine();
            System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
            GrauDeCerteza = scanner.nextLine();

            if (AbelhasMortasDiferentesFasesDeDesenvolvimento.equals("Sim")) {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em diferentes estados de desenvolvimento", "true"));
                kSession.fireAllRules();
                System.out.println("Foram verificadas abelhas mortas na entrada da colmeia, em forma de 'cauda de cometa'?");
                AbelhasMortasEmCaudaDeCometa = scanner.nextLine();
                System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                GrauDeCerteza = scanner.nextLine();
                if (AbelhasMortasEmCaudaDeCometa.equals("Sim")) {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Abelhas mortas em forma de cauda de cometa", "true"));
                    kSession.fireAllRules();

                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("O coeficiente para 'envenenamento por pesticidas' é: " + hypothesis.getCf());
                                System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                System.exit(0);
                            }
                        }
                    }
                    System.out.println("Foi verificada uma quebra de vigor na colónia?");
                    DiminuicaoDeProdutividade = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDeProdutividade.equals("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        kSession.fireAllRules();
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("O coeficiente para 'envenenamento por pesticidas' é: " + hypothesis.getCf());
                                System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                System.exit(0);
                            }
                        }
                    }

                } else {
                    kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em forma de cauda de cometa", "true"));
                    kSession.fireAllRules();
                    System.out.println("Foi verificada uma quebra de vigor na colónia?");
                    DiminuicaoDeProdutividade = scanner.nextLine();
                    System.out.println("Quanta certeza tem desta observação? (Pouca/Muita/Intermedia)");
                    GrauDeCerteza = scanner.nextLine();
                    if (DiminuicaoDeProdutividade.equals("Sim")) {
                        kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "Diminuicao de produtividade", "true"));
                        kSession.fireAllRules();
                    }
                    for (Object obj : hypotheses) {
                        if (obj instanceof Hypothesis) {
                            Hypothesis hypothesis = (Hypothesis) obj;
                            if (hypothesis.getDescription().equalsIgnoreCase("envenenamento") && (hypothesis.getCf() > 0.7)) {
                                System.out.println("O coeficiente para 'envenenamento por pesticidas' é: " + hypothesis.getCf());
                                System.out.println("Diagnóstico Finalizado! Trata-se de envenenamento");
                                System.exit(0);
                            }
                        }
                    }
                }

            } else {
                kSession.insert(new Evidence(CheckGrauCerteza(GrauDeCerteza), "N Abelhas mortas em diferentes estados de desenvolvimento", "true"));
                kSession.fireAllRules();

            }

            /*  kSession.insert(new Evidence( 0.5,"Mortalidade aumentada", "true"));
            kSession.insert(new Evidence( 0.5,"Deformidades nas asas", "true"));
            kSession.insert(new Evidence(0.5,"Diminuicao de produtividade", "true"));
            kSession.insert(new Evidence( 0.5,"Acaros vermelhos nas abelhas", "true"));*/
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static double CheckGrauCerteza(String grauCerteza) {
        if (grauCerteza.equals("Pouca")) {
            return 0.40;
        }
        if (grauCerteza.equals("Intermedia")) {
            return 0.70;
        }
        if (grauCerteza.equals("Muita")) {
            return 0.90;
        }
        return 0.0;
    }

}
