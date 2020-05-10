package com.br.perseus.tipos;

public enum EnumSimNao {
    S("Sim"), N("Não");
    private String valor;

    EnumSimNao(String valor){
        this.valor = valor;

    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
