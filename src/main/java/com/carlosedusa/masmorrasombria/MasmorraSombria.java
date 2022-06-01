/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.carlosedusa.masmorrasombria;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class MasmorraSombria {

    private static int _tipoPoder;

    public static void main(String[] args) {
        System.out.println("###################################################");
        System.out.println("A Masmorra Sombria");
        System.out.println("###################################################");
        System.out.println("");
        System.out.println("Um habilidoso mercenário é contratado para fazer um trabalho confidencial, a única informação sobre a missão é que tem relação \n"
                + "ao reino de Cintra que a princípio é muito conhecido pela sua riqueza, justamente por isso o mercenário aceita o trabalho e \n"
                + "vai diretamente ao encontro de quem o contratou. Nessa aventura ele irá passar por algumas dificuldades e escolhas que impactarão \n"
                + "diretamente em seu futuro.");
        System.out.println("");
        System.out.println("__________________________________________________");
        System.out.println("");
        System.out.println("Você se encontra com os cavaleiros reais do reino de Cintra e sua missão é: escoltar uma jovem princesa até seu reinado para \n"
                + "protegê-la de uma grande guerra que está por vir. \n\n"
                + "Seguindo em direção à vila vocês são surpreendidos por mau tempo e ocorrências misteriosas, parando em frente a uma masmorra, \n"
                + "sua chance mais segura de sobreviver na tempestade, por enquanto.");
        System.out.println("");
        System.out.println("__________________________________________________");
        InicioJogoMasmorra();
    }

    public static void InicioJogoMasmorra() {

        int porta = 1, caminho = 2, escolhaJogador;
        boolean decisao = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("###################################################");
        System.out.println("DENTRO DA MASMORRA");
        System.out.println("###################################################");
        System.out.println("");
        System.out.println("Na masmorra você se depara com dois caminhos, escolha:");
        System.out.println("");
        System.out.println("Digite 1: \nChutar uma porta frágil de madeira.");
        System.out.println("\nDigite 2: \nSeguir um estranho rastro de um líquido preto.");
        System.out.println("\nQual sua decisão?");
        escolhaJogador = teclado.nextInt();

        while (decisao == true) {
            if (escolhaJogador == porta) {
                System.out.println("###################################################");
                System.out.println("CHUTOU A PORTA!");
                System.out.println("###################################################");
                System.out.println("\nVocê escolheu chutar a porta, o barulho do poderoso chute atraiu um pequeno grupo de duendes em sua direção, \n"
                        + "mas isso não é um problema para a tropa de cavaleiros que são especialistas em combate de curta distância.");
                System.out.println("");
                System.out.println("__________________________________________________\n");
                decisao = false;
                FugirOuLutar();
            } else if (escolhaJogador == caminho) {
                System.out.println("###################################################");
                System.out.println("SEGUIU O RASTRO!");
                System.out.println("###################################################");
                System.out.println("\nVocê escolheu seguir o rastro de líquido presente na caverna, que o-leva à um Minotauro furioso e faminto, a sua sorte é \n"
                        + "que ele está ferido e o líquido no chão estava saindo de sua armadura, mesmo ferido ele os-ataca com um poderoso golpe \n"
                        + "que é defendido pela magia da espada de um dos cavaleiros de Cintra que logo em seguida desfere um golpe na cabeça do \n"
                        + "Minotauro que o-desmaia.");
                System.out.println("");
                System.out.println("__________________________________________________");
                decisao = false;
                FugirOuLutar();
            } else {
                System.out.println("Opção inválida, digite 1 ou 2.");
                escolhaJogador = teclado.nextInt();
            }
        }

    }

    public static void FugirOuLutar() {

        int covarde = 1, proteger = 2, escolhaJogador;
        boolean decisao = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seguindo você encontrou uma biblioteca abandonada, dentro dela, a princesa como uma boa pesquisadora e admiradora da língua \n"
                + "antiga consegue achar um pergaminho que conta um pouco sobre a história da masmorra. ");
        System.out.println("");
        System.out.println("“A masmorra é uma antiga construção subterrânea por anões para abrigar um pequeno clã, que há muito tempo atras \n"
                + "desapareceu sem explicações. Séculos mais tarde essa mesma masmorra seria ocupada pelo famoso culto das sombras: \n"
                + "um grupo de magos malignos e diversas outras criaturas místicas que veneravam um grande monstro sombrio sem rosto. \n"
                + "Estes cultistas, dizem as lendas que um dia já foram cavaleiros e viajantes que se perderam no meio da floresta e com o tempo \n"
                + "foram transformados em criaturas pela magia negra presente nas dependências da masmorra”.");
        System.out.println("");
        System.out.println("Ao saber que estão dentro do lar de um culto extremamente perigoso vocês ficam desesperados para sair do local. Todos voltam \n"
                + "ao início da masmorra o mais ráido possível, a não ser a princesa que é puxada para as sombras por um enorme braço.");
        System.out.println("");
        System.out.println("Ao peceber que a pricesa é puxada para as sombras, lhe restam duas opções, escolha:");
        System.out.println("\nDigite 1: \nFugir como um covarde.");
        System.out.println("\nDigite 2: \nEntrar em meio as sombras para proteger a princesa a qualquer custo, já que ela era o único \n"
                + "motivo para você estar lá.");
        escolhaJogador = teclado.nextInt();

        while (decisao == true) {
            if (escolhaJogador == covarde) {
                System.out.println("###################################################");
                System.out.println("FUGIU COMO UM COVARDE");
                System.out.println("###################################################");
                System.out.println("\nVocê escolheu fugir, e foi sequestrado assim como a princesa, mas sem ninguém para te ajudar, você é morto e a princesa \n"
                        + "é salva por seus fiéis escudeiros.");
                System.out.println("");
                System.out.println("__________________________________________________");
                System.out.println("###################################################");
                System.out.println("Você moreu, fim de jogo.");
                System.out.println("###################################################");
                decisao = false;

            } else if (escolhaJogador == proteger) {
                System.out.println("###################################################");
                System.out.println("PROTEGEU A PRINCESA!");
                System.out.println("###################################################");
                System.out.println("\nVocê decidiu ficar e ir atras da princesa junto com os cavaleiros de Cintra, procurando por ela, você encontrou \n"
                        + "um livro de encantamentos no qual poderá escolher um dos seguintes feitiços para te ajudar durante a sua trajetória.");
                System.out.println("");
                System.out.println("__________________________________________________");
                decisao = false;
                Feiticos();
            } else {
                System.out.println("Opção inválida, digite 1 ou 2.");
                escolhaJogador = teclado.nextInt();
            }
        }
    }

    public static void Feiticos() {

        int cura = 1, fogo = 2, escolhaJogador;
        boolean decisao = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um dos feitiços:");
        System.out.println("");
        System.out.println("\nDigite 1: \nCura: o próprio nome já diz em um certo período você poderá usá-lo para curar a si mesmo ou curar algum de seus companheiros");
        System.out.println("\nDigite 2: \nFogo: Além de toda sua habilidade agora você poderá usar uma podeosa chama para atacar o inimigo.");
        escolhaJogador = teclado.nextInt();
        System.out.println("__________________________________________________");

        while (decisao == true) {
            if (escolhaJogador == cura) {
                System.out.println("###################################################");
                System.out.println("PODER DE CURA");
                System.out.println("###################################################");
                System.out.println("");
                System.out.println("__________________________________________________");
                decisao = false;
                _tipoPoder = 1;
                UsandoPoderes();

            } else if (escolhaJogador == fogo) {
                System.out.println("###################################################");
                System.out.println("PODER DE FOGO");
                System.out.println("###################################################");
                System.out.println("");
                System.out.println("__________________________________________________");
                decisao = false;
                _tipoPoder = 2;
                UsandoPoderes();
            } else {
                System.out.println("Opção inválida, digite 1 ou 2.");
                escolhaJogador = teclado.nextInt();
            }
        }
    }

    public static void UsandoPoderes() {

        if (_tipoPoder == 1) {
            System.out.println("Ao seguir em frente você encontra um rastro da princesa, um pedaço de seu vestido, rapidamente você segue \n"
                    + "esse rastro que o leva a mais um inimigo, um Cérbero, que logo ataca um de seus companheiros, você golpeia \n"
                    + "uma das cabeças da criatura afetando sua visão, com isso é formado um cerco em volta da dela encurralando-a, \n"
                    + "depois de uma luta difícil, vocês conseguem abater a enorme fera, você usa seu poder para curar a si mesmo, \n"
                    + "e os outos soldados.");
            System.out.println("");
            ComunicacaoPrincesa();
        } else {
            System.out.println("Ao seguir em frente você encontra um rastro da princesa, um pedaço de seu vestido, rapidamente você segue \n"
                    + "esse rastro que o leva a mais um inimigo, um Cérbero, que logo ataca um de seus companheiros, você golpeia \n"
                    + "uma das cabeças da criatura afetando sua visão, com isso é formado um cerco em volta da dela encurralando-a, \n"
                    + "você usa seu podere de fogo, e abate a enorme fera.");
            System.out.println("");
            ComunicacaoPrincesa();
        }
    }

    public static void ComunicacaoPrincesa() {

        int perto = 1, longe = 2, escolhaJogador;
        boolean decisao = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("__________________________________________________");
        System.out.println("\nObservando atrás da toca da criatura já derrotada, você encontra uma passagem estreita, sendo ela o único caminho, \n"
                + "você segue essa passagem até chegar em um grande salão que aparentemente não tem nenhuma saída. Analisando todo o espaço, \n"
                + "você acha uma pedra fora do padrão presente dentro do salão, com isso ao pressionar a pedra é aberta uma passagem \n"
                + "que te leva diretamente para o abrigo da criatura que raptou a princesa, para a surpresa do jogador a princesa está lá e a criatura não.");
        System.out.println("");
        System.out.println("Agora você tem duas escolhas:");
        System.out.println("");
        System.out.println("Digite 1: \nChegar perto da princesa e tentar se comunicar com ela.");
        System.out.println("\nDigite 2: \nTentar comunicação de longe.");
        System.out.println("\nQual sua decisão?");
        escolhaJogador = teclado.nextInt();

        while (decisao == true) {
            if (escolhaJogador == perto) {
                System.out.println("###################################################");
                System.out.println("SE APROXIMOU DA PRINCESA");
                System.out.println("###################################################");
                System.out.println("\nAo chegar perto da princesa o você é atacado pela criatura que possuiu o corpo da princesa.");
                System.out.println("");
                System.out.println("__________________________________________________");
                decisao = false;
                EncerrandoJogo();
            } else if (escolhaJogador == longe) {
                System.out.println("###################################################");
                System.out.println("FICOU EM UMA DISTÂNCIA SEGURA");
                System.out.println("###################################################");
                System.out.println("\nVocê ficou de longe, a criatura deixa transparecer que possuiu o corpo da princesa e logo em seguida \n"
                        + "ataca um de seus soldados. Restando apenas mais um soldado.");
                System.out.println("");
                System.out.println("__________________________________________________");
                decisao = false;
                EncerrandoJogo();
            } else {
                System.out.println("Opção inválida, digite 1 ou 2.");
                escolhaJogador = teclado.nextInt();
            }
        }
    }

    public static void EncerrandoJogo() {

        int esperar = 1, atacar = 2, escolhaJogador;
        boolean decisao = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("");
        System.out.println("Após ser atacado o você tem dusas estratégias diferentes para seguir:");
        System.out.println("");
        System.out.println("Digite 1: \nVocê espera um momento de desleixo do monstro e usa seus poderes para tentar derrotá-lo.");
        System.out.println("\nDigite 2: \nNão esperar uma brecha da criatura, e atacar a princesa na mesma hora.");
        System.out.println("\nQual sua decisão?");
        escolhaJogador = teclado.nextInt();

        while (decisao == true) {
            if (escolhaJogador == esperar) {
                System.out.println("###################################################");
                System.out.println("AGUARDOU O MELHOR MOMENTO");
                System.out.println("###################################################");
                System.out.println("\nVocê usou a melhor estratégioa, se preparou para que no melhor moento pudesse atacar o monstro.");
                System.out.println("");
                if (_tipoPoder == 1) {
                    System.out.println("Você usou seu poder para curar o soldado morto, com a ajuda dele, vocês conseguiram derrotar a criatura.");
                } else {
                    System.out.println("Você usou seu poder para queimar o monstro em um poderoso e mortal golpe.");
                }
                System.out.println("\nConseguindo levar a princesa até seu reino e assim concluindo a sua missão.\n");
                System.out.println("__________________________________________________");
                System.out.println("###################################################");
                System.out.println("A princesa está a salvo, você venceu!");
                System.out.println("");
                System.out.println("###################################################");
                decisao = false;

            } else if (escolhaJogador == atacar) {
                System.out.println("###################################################");
                System.out.println("ATACOU NA MESAM HORA");
                System.out.println("###################################################");
                System.out.println("\nVocê não esperou por uma brecha da criatura e atacou a princesa sem pensar duas vezes, o monstro sem rosto \n"
                        + "revida e o mata sem nenhuma cerimônia, causando a sua morte e a de todos que estavam junto com você.");
                System.out.println("");
                System.out.println("###################################################");
                System.out.println("Você moreu, fim de jogo.");
                System.out.println("###################################################");
                decisao = false;
            } else {
                System.out.println("Opção inválida, digite 1 ou 2.");
                escolhaJogador = teclado.nextInt();
            }
        }
    }
}
