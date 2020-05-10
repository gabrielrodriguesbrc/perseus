package com.br.perseus.tipos;

public enum EnumCreditoDebito {
    CD("Crédito"), DB("Débito");

    private String valor;

    EnumCreditoDebito(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
