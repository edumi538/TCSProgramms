package SingletonProject.Models;

public class Personagem {

    public Personagem() {

    }
    public static Personagem CreatePersonagem() {
        Banco.CreateBanco();
        Personagem novoPersonagem = new Personagem();
        return novoPersonagem;
    }
}
