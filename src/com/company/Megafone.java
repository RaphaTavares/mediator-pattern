package com.company;

public class Megafone {
    private static Megafone instancia = new Megafone();

    private Megafone() {}

    public static Megafone getInstancia(){ return instancia; }

    public String receberCartaCorreio(String mensagem, String destinatario)
    {
        return "O correio do amor agradece sua participação.\n" +
                "Aqui está a mensagem enviada: " + CorreioDoAmor.getInstancia().receberCarta(mensagem, destinatario);
    }

    public String receberPresenteCorreio(Enum presente, String destinatario)
    {
        return "O correio do amor agradece sua participação.\n" +
                "Aqui está a mensagem do presente enviado: " + CorreioDoAmor.getInstancia().receberPresente(presente, destinatario);
    }

}
