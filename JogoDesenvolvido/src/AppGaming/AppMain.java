
package AppGaming;

import armas.*;
import personagens.*;
import java.util.Random;

public class AppMain {
    public static void main(String[] args) {
        Random random = new Random();
        
        while (true) {
            
            Soldado so = new Soldado();
            General g = new General();
            LutSUMO su = new LutSUMO();
            Mago m = new Mago();
            DragaoAlado dragao = new DragaoAlado();

            
            Arma_IF fuzil = new Fuzil();
            Arma_IF faca = new Faca();
            Arma_IF magia = new Magia();
            Arma_IF revolver = new Revolver();
            Arma_IF bolaDeFogo = new bolaDeFogo();


            personagem[] personagens = {so, g, su, m, dragao};
            Arma_IF[] armas = {fuzil, faca, magia, revolver, bolaDeFogo};

            boolean jogadorCorreu = false;  

            // Seleção do personagem pelo jogador
            InOut.MsgDeAviso("Escolha um personagem:", "Boa sorte");
            int escolhaPersonagem = Integer.parseInt(InOut.leString("1. Soldado\n2. General\n3. Lutador de Sumo\n4. Mago\n5. Dragao Alado"));
            personagem jogador = personagens[escolhaPersonagem - 1];

         
            InOut.MsgDeAviso("Escolha uma arma:", "Escolha sabiamente");
            Arma_IF armaEscolhida;
            while (true) {
                int escolhaArma = Integer.parseInt(InOut.leString("1. Fuzil\n2. Faca\n3. Magia\n4. Revolver\n5. Bola de Fogo"));
                armaEscolhida = armas[escolhaArma - 1];

               
                if (!(jogador instanceof DragaoAlado) && armaEscolhida instanceof bolaDeFogo) {
                    InOut.MsgDeAviso("Erro", "A Bola de Fogo só pode ser usada pelo Dragao Alado. Escolha outra arma.");
                } else if (!(jogador instanceof Mago) && armaEscolhida instanceof Magia) {
                    InOut.MsgDeAviso("Erro", "A Magia só pode ser usada pelo Mago. Escolha outra arma.");
                } else {
                    break;
                }
            }
            jogador.setArma(armaEscolhida);

            
            personagem oponente = personagens[random.nextInt(personagens.length)];
            Arma_IF armaOponente;
            while (true) {
                armaOponente = armas[random.nextInt(armas.length)];

                
                if (!(oponente instanceof DragaoAlado) && armaOponente instanceof bolaDeFogo) {
                    continue;
                } else if (!(oponente instanceof Mago) && armaOponente instanceof Magia) {
                    continue;
                } else {
                    break;
                }
            }
            oponente.setArma(armaOponente);

    
            InOut.MsgDeAviso("Escolha do Jogador", "Você escolheu: " + jogador.getClass().getSimpleName() + " com " + armaEscolhida.getClass().getSimpleName());
            InOut.MsgDeAviso("Escolha do Oponente", "Oponente escolheu: " + oponente.getClass().getSimpleName() + " com " + armaOponente.getClass().getSimpleName());

            
            if (!jogadorCorreu) {
                String resposta = InOut.leString("Deseja tentar correr do combate e escolher outra arma? (s/n)");
                if (resposta.equalsIgnoreCase("s")) {
                    jogadorCorreu = true;
                    if (jogador.correr()) {
                        InOut.MsgDeAviso("Ação", "Você conseguiu correr! Escolha uma nova arma.");
                        InOut.MsgDeAviso("Escolha uma arma:", "Escolha sabiamente");
                        while (true) {
                            int escolhaArma = Integer.parseInt(InOut.leString("1. Fuzil\n2. Faca\n3. Magia\n4. Revolver\n5. Bola de Fogo"));
                            armaEscolhida = armas[escolhaArma - 1];

                           
                            if (!(jogador instanceof DragaoAlado) && armaEscolhida instanceof bolaDeFogo) {
                                InOut.MsgDeAviso("Erro", "A Bola de Fogo só pode ser usada pelo Dragao Alado. Escolha outra arma.");
                            } else if (!(jogador instanceof Mago) && armaEscolhida instanceof Magia) {
                                InOut.MsgDeAviso("Erro", "A Magia só pode ser usada pelo Mago. Escolha outra arma.");
                            } else {
                                break;
                            }
                        }
                        jogador.setArma(armaEscolhida);
                    } else {
                        InOut.MsgDeAviso("Ação", "Você não conseguiu correr! O combate continua.");
                    }
                }
            }

            
            String resultado = decidirVencedor(jogador, armaEscolhida, oponente, armaOponente);
            InOut.MsgDeAviso("Resultado", resultado);

            
            String resposta = InOut.leString("Deseja jogar novamente? (s/n)");
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    private static String decidirVencedor(personagem jogador, Arma_IF armaJogador, personagem oponente, Arma_IF armaOponente) {
        if (armaJogador instanceof Magia) {
            if (armaOponente instanceof Fuzil || armaOponente instanceof Revolver) {
                return "Você venceu! Magia ganha de Fuzil e Revolver.";
            } else if (armaOponente instanceof Faca) {
                return "Você perdeu! Magia perde para Faca.";
            }
        } else if (armaJogador instanceof Revolver) {
            if (armaOponente instanceof Faca || armaOponente instanceof Fuzil) {
                return "Você venceu! Revolver ganha de Faca e Fuzil.";
            } else if (armaOponente instanceof Magia) {
                return "Você perdeu! Revolver perde para Magia.";
            }
        } else if (armaJogador instanceof Faca) {
            if (armaOponente instanceof Magia) {
                return "Você venceu! Faca ganha de Magia.";
            } else if (armaOponente instanceof Revolver) {
                return "Você perdeu! Faca perde para Revolver.";
            }
        } else if (armaJogador instanceof Fuzil) {
            if (armaOponente instanceof Revolver) {
                return "Você perdeu! Fuzil perde para Revolver.";
            }
        } else if (armaJogador instanceof bolaDeFogo) {
            if (armaOponente instanceof Fuzil || armaOponente instanceof Faca) {
                return "Você venceu! Bola de Fogo ganha de Fuzil e Faca.";
            } else if (armaOponente instanceof Revolver || armaOponente instanceof Magia) {
                return "Você perdeu! Bola de Fogo perde para Revolver e Magia.";
            }
        }

       
        if (jogador instanceof DragaoAlado && armaOponente instanceof Magia) {
            return "Você perdeu! Dragao Alado perde para Magia.";
        } else if (oponente instanceof DragaoAlado && armaJogador instanceof Magia) {
            return "Você venceu! Magia ganha de Dragao Alado.";
        }

   
        return "Empate! Ninguém ganhou.";
    }
}



