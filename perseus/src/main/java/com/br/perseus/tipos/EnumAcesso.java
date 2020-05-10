package com.br.perseus.tipos;

public enum EnumAcesso {

    TS("Teste"),
    US("Usuário"),
    PR("Professor"),
    IN("Instituição");

    private String valor;

    EnumAcesso(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
