package com.company;

public class Pessoa {

    public String enviarCarta(String mensagem, String destinatario){
        return CorreioDoAmor.getInstancia().receberCarta(mensagem, destinatario);
    }

    public String enviarPresente(Enum presente, String destinatario){
        return CorreioDoAmor.getInstancia().receberPresente(presente, destinatario);
    }
}
