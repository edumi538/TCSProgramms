/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.lang.constant.Constable;

/**
 *
 * @author Eduardo
 */
public class Hexagono {

    private String nome = "Hexagono";
    private int NumerodeLados = 6;

    /**
     * @return the NumerodeLados
     */
    public int getNumerodeLados() {
        return NumerodeLados;
    }

    /**
     * @param NumerodeLados the NumerodeLados to set
     */
    public void setNumerodeLados(int NumerodeLados) {
        this.NumerodeLados = NumerodeLados;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
