package org.engcia.cfsample;

//import org.drools.core.rule.builder.dialect.asm.ClassGenerator;
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

        	// Agenda listener
        	kSession.addEventListener(new TrackingAgendaListener());
        	
        	// Facts listener
        	kSession.addEventListener(new FactListener());

            // go !
            
            kSession.insert(new Hypothesis(0.0,"varroa", "true"));
            kSession.insert(new Hypothesis(0.0,"nosemose", "true"));
            kSession.insert(new Hypothesis(0.0,"virusdacriacaoensacada", "true"));
            kSession.insert(new Hypothesis(0.0,"envenenamento", "true"));
            kSession.insert(new Hypothesis(0.0,"fome", "true"));
            kSession.insert(new Hypothesis(0.0,"acarapisose", "true"));
            kSession.insert(new Hypothesis(0.0,"loqueeuropeia", "true"));
            kSession.insert(new Hypothesis(0.0,"loqueamericana", "true"));
            kSession.insert(new Hypothesis(0.0,"ascosferiose", "true"));
            kSession.insert(new Hypothesis(0.0,"virose", "true"));
            kSession.insert(new Hypothesis(0.0,"virusdaparalisiaaguda", "true"));
            int CfObsMortalidadeAumentada,CfObsDeformidadesNasAsas,CfObsDiminuicaoDeProdutividade,CfObsAcarosVermelhosNasAbelhas,CfObsAbdomenInchado,CfObsIncapacidadeDeVoar,CfObsManchasEscurasNaColmeia,CfObsLarvasMortasOuApodrecidas,CfObsOperculoDeprimidoOuPerfurado,CfObsCriacaoMalSemeada,CfObsMauCheiro,CfObsTesteDoPalito,CfObsOperculoAfundado,CfObsLarvasMumificadas,CfObsOperculosEsburacados,CfObsCriacaoEmMosaico,CfObsAusenciaDeCheiro,CfObsLarvasMortasNumSacoComLiquido,CfObsMudançaDeCorLarvas,CfObsEscamaCastanhaAposAMorteDaLarvaEmFormaDeGondola,CfObsNecroseEEnegrecimentoDasTraqueiasDasAbelhas,CfObsAbelhasArrastaremSe,CfObsAbelhasMortasNaEntradaDaColmeia,CfObsAbelhasMortasEmCaudaDeCometa,CfObsAblehasMortasEmDiferentesEstadosDeDesenvolvimento,CfObsAbelhasMortasComACabeçaDentroDasCelulas,CfObsDiminuicaoDoTamanhoDasAbelhas,CfObsFaltaDeReservas,CfObsPerdaDePelo,CfObsMovimentosTremidosDoCorpoEAsasDasAbelhasInfetadas,CfObsAspetoLuzidioEBrilhante;
            final int CfObsVerao=1,CfObsInverno=1,CfObsPrimavera=1,CfObsOutono=1;
            String estacao;
            System.out.println("Olá, caro utilizador! Por favor responda às próximas perguntas com os detalhes do que observou");
            System.out.println("-----------------------------------------------");
            System.out.println("Em que estação do ano se encontra?");
            estacao = scanner.nextLine();
            if(estacao.equals("Verão")){
                kSession.insert(new Evidence( CfObsVerao,"Verao", "true"));

            }
            if(estacao.equals("Inverno")){
                kSession.insert(new Evidence( CfObsInverno,"Inverno", "true"));

                
            }
            if(estacao.equals("Outono")){
                kSession.insert(new Evidence( CfObsOutono,"Outono", "true"));

                
            }
            if(estacao.equals("Primavera")){
                kSession.insert(new Evidence( CfObsPrimavera,"Primavera", "true"));

            
            }
           /*  kSession.insert(new Evidence( 0.5,"Mortalidade aumentada", "true"));
            kSession.insert(new Evidence( 0.5,"Deformidades nas asas", "true"));
            kSession.insert(new Evidence(0.5,"Diminuicao de produtividade", "true"));
            kSession.insert(new Evidence( 0.5,"Acaros vermelhos nas abelhas", "true"));*/
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
