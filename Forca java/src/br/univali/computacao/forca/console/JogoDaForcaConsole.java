/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.computacao.forca.console;

import br.univali.computacao.forca.JogoForca;
import br.univali.computacao.forca.banco.BancoPalavras;
import java.util.Scanner;

/**
 *
 * @author 1978233
 */
public class JogoDaForcaConsole {
    
    JogoForca forca;
    Scanner leitor;

    public JogoDaForcaConsole() {
        forca = new JogoForca();
        leitor = new Scanner(System.in);
    }
    
    
    public void novoJogo(){
        forca.iniciar();
        do {
            System.out.println("Adivinhe qualquer letra na palavra");
            System.out.println(forca.palavraSecreta());
            char guess = leitor.next().charAt(0);
            if (!forca.tentar(guess)){
                System.out.println("Palpite errado, tente de novo!");
                this.desenharForca(forca.erros());
            }
        } while (forca.possuiMaisTentativas());
        
        if (forca.ganhou()){
            System.out.println("PARABÉNS!!! você descobriu a palavra com "+forca.erros()+" erro(s)");
        } else {
            System.out.println("GAME OVER! A palavra era: " + forca.revelarPalavraSecreta());
        }
    }
    
    private void desenharForca(int contador){
        if (contador == 1) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("___|___");
                System.out.println();
        }
        if (contador == 2) {
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
        }
        if (contador == 3) {
                System.out.println("   ____________");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
        }
        if (contador == 4) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
        }
        if (contador == 5) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |");
                System.out.println("___|___");
        }
        if (contador == 6) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
        }
        if (contador == 7) {
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |          _|_");
                System.out.println("   |         / | \\");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
        }
    }
    
}
