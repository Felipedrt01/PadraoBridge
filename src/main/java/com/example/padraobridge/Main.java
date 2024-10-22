package com.example.padraobridge;

public class Main {

    public static void main(String[] args) {
        Servico limpeza = new Limpeza(100);
        limpeza.setNivelExperiencia(new Junior());
        System.out.println("Pagamento Limpeza (Junior): " + limpeza.calcularPagamento());

        Servico reparacao = new Reparacao(200);
        reparacao.setNivelExperiencia(new Senior());
        System.out.println("Pagamento Reparação (Senior): " + reparacao.calcularPagamento());

        Consultoria consultoria = new Consultoria(150);
        consultoria.setNivelExperiencia(new Especialista());
        consultoria.setHorasTrabalhadas(10);
        System.out.println("Pagamento Consultoria (Especialista, 10 horas): " + consultoria.calcularPagamento());
    }
}
