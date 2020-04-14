/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes = {"Hexagono", "Quadrado", "Retangulo", "Triangulo"};
        Object tipoDeFigura;
        do {
            tipoDeFigura = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?",
                    "Finalização",
                    JOptionPane.PLAIN_MESSAGE,
                    null, opcoes, "Hexagono");

            if (tipoDeFigura.equals("Hexagono")) {
                Hexagono obj = new Hexagono();
                String saida = "Nome: " + obj.getNome() + "\n";
                saida += "Número de lados: " + obj.getNumerodeLados();
                JOptionPane.showMessageDialog(null, saida);
            } else if (tipoDeFigura.equals("Quadrado")) {
                Quadrado obj = new Quadrado();
                String saida = "Nome: " + obj.getNome() + "\n";
                saida += "Número de lados: " + obj.getNumerodeLados();
                JOptionPane.showMessageDialog(null, saida);
            } else if (tipoDeFigura.equals("Retangulo")) {
                Retangulo obj = new Retangulo();
                String saida = "Nome: " + obj.getNome() + "\n";
                saida += "Número de lados: " + obj.getNumerodeLados();
                JOptionPane.showMessageDialog(null, saida);
            } else if (tipoDeFigura.equals("Triangulo")) {
                Triangulo obj = new Triangulo();
                String saida = "Nome: " + obj.getNome() + "\n";
                saida += "Número de lados: " + obj.getNumerodeLados();
                JOptionPane.showMessageDialog(null, saida);
            }

        } while (controle);
    }
}
