package com.dio.strategy;

public class Robo {

    //tem um atributo do tipo da interface
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
