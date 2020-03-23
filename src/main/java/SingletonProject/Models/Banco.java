/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonProject.Models;

public class Banco {
    
    private static Banco InstanciaUnica;
    
    private Banco() {
    }

    public static Banco CreateBanco() {
        if (InstanciaUnica == null) {
            InstanciaUnica = new Banco();
        }
        return InstanciaUnica;
    }
}
