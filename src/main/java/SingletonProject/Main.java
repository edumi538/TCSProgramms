/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonProject;

import SingletonProject.Models.Banco;
import SingletonProject.Models.Personagem;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {

            Personagem.CreatePersonagem();

        }
    }
}
