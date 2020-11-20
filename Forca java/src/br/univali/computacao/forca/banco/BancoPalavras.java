/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.computacao.forca.banco;

/**
 *
 * @author 1978233
 */
public class BancoPalavras {
    private final String[] palavras = {"terminator", "banana", "computer", "cow", "rain", "water" };

    public String selecionarPalavra() {
        return palavras[(int) (Math.random() * palavras.length)];
    }
   
}
