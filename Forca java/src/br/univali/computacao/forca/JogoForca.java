/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.computacao.forca;

import br.univali.computacao.forca.banco.BancoPalavras;

/**
 *
 * @author 1978233
 */
public class JogoForca {

    private final BancoPalavras banco;
    private String palavraSelecionada;
    private String asterisco;
    private int erros;
    private final int maxTentativas;
    
    private boolean jogando = false;

    public JogoForca() {
        this.banco = new BancoPalavras();
        this.maxTentativas = 7;
    }

    public void iniciar() {
        this.palavraSelecionada = banco.selecionarPalavra();
        this.asterisco = new String(new char[this.palavraSelecionada.length()]).replace("\0", "*");
        this.erros = 0;
        this.jogando = true;
    }

    public boolean tentar(char letra){
        String novoAsterisco = "";
        for (int i = 0; i < palavraSelecionada.length(); i++) {
            if (palavraSelecionada.charAt(i) == letra) {
                novoAsterisco += letra;
            } else if (asterisco.charAt(i) != '*') {
                novoAsterisco += palavraSelecionada.charAt(i);
            } else {
                novoAsterisco += "*";
            }
        }
        
        if (asterisco.equals(novoAsterisco)){
            erros++;
            return false;
        }
        
        asterisco = novoAsterisco;
        return true;
    }
    
    public boolean ganhou(){
        return asterisco.equals(palavraSelecionada);
    }
    
    public String palavraSecreta(){
        return this.asterisco;
    }
    
    public String revelarPalavraSecreta(){
        return this.palavraSelecionada;
    }
    
    public boolean possuiMaisTentativas(){
        return this.erros < this.maxTentativas && !this.ganhou();
    }
    
    public int erros(){
        return this.erros;
    }

}
