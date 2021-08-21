package com.company.tests;

import com.company.Admirador;
import com.company.Presente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdmiradorTest {

    @Test
    void deveEnviarCarta() {
        Admirador admirador = new Admirador();
        assertEquals("Aqui está a mensagem de um admirador secreto para Raphaela: ela é muito bonita", admirador.enviarCarta("ela é muito bonita", "Raphaela"));
    }

    @Test
    void deveEnviarPresente(){
        Admirador admirador = new Admirador();
        Presente presente = Presente.PELUCIA;
        assertEquals("O admirador secreto está dando de presente para Raphaela: PELUCIA", admirador.enviarPresente(presente, "Raphaela"));
    }
}
