package com.br.perseus.tipos;

public enum EnumEvento {

    EV("Evento"), DP("Depósito");

    private String valor;

    EnumEvento(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
