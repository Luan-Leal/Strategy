package org.example;

public class Colaborador {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void AdicionalNoturno(float salario ) {
        CalculadoraHoraExtra calculadora = new CalculadoraHoraExtra(salario);
        this.salario = calculadora.calcular(new AdicionalNoturno());
    }

    public void HoraExtraNormal(float salario) {
        CalculadoraHoraExtra calculadora = new CalculadoraHoraExtra(salario);
        this.salario = calculadora.calcular(new HoraExtraNormal());
    }

    public void HoraExtraDomingoFeriado(float salario) {
        CalculadoraHoraExtra calculadora = new CalculadoraHoraExtra(salario);
        this.salario = calculadora.calcular(new HoraExtraDomingoFeriado());
    }

    public void SemHoraExtra(float salario) {
        CalculadoraHoraExtra calculadora = new CalculadoraHoraExtra(salario);
        this.salario = calculadora.calcular(new SemHoraExtra());
    }


}
