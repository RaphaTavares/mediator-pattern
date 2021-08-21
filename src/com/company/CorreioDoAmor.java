package com.company;

public class CorreioDoAmor {
    private static CorreioDoAmor instancia = new CorreioDoAmor();

    private CorreioDoAmor() {}

    public static CorreioDoAmor getInstancia(){
        return instancia;
    }
    public String receberCarta(String mensagem, String destinatario){
        return ("Aqui está a mensagem de um admirador secreto para " + destinatario + ": " + mensagem);
    }

    public String receberPresente(Enum presente, String destinatario)
    {
        return "O admirador secreto está dando de presente para " + destinatario + ": " + presente;
    }
}
