/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass;

public class Piloto {

    private String Nome;
    private String Id;

   public Piloto(String constructorNome, String constructorId) {
        this.Nome = constructorNome;
        this.Id = constructorId;
    }

   public Piloto(String str) {
        String[] vet = str.split(";");
        this.Id = vet[0];
        this.Nome = vet[1];
        
    }

    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }
}
