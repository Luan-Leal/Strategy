package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculoHoraExtraTest {

    @Test
    void deveCalcularAdicionalNoturno() {
        Colaborador colaborador = new Colaborador();
        colaborador.AdicionalNoturno(1000.0f);
        assertEquals(1300.0f, colaborador.getSalario());
    }

    @Test
    void deveCalcularHoraExtraNormal() {
        Colaborador colaborador = new Colaborador();
        colaborador.HoraExtraNormal(1000.0f);
        assertEquals(1500.0f, colaborador.getSalario());
    }

    @Test
    void deveCalcularHoraExtraDomingoFeriado() {
        Colaborador colaborador = new Colaborador();
        colaborador.HoraExtraDomingoFeriado(1000.0f);
        assertEquals(2000.0f, colaborador.getSalario());
    }

    @Test
    void deveCalcularSalarioSemHoraExtra() {
        Colaborador colaborador = new Colaborador();
        colaborador.SemHoraExtra(1000.0f);
        assertEquals(1000.0f, colaborador.getSalario());
    }

}