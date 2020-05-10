package com.br.perseus.tipos;

public enum EnumSexo {

    M("Masculino"), F("Feminino"), O("Outros");

    private String valor;

    EnumSexo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
