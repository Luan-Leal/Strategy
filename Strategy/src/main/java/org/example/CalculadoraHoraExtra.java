package org.example;

public class CalculadoraHoraExtra {

    private float salario;

    public CalculadoraHoraExtra(float salario) {
        this.salario = salario;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(salario);
    }
}
