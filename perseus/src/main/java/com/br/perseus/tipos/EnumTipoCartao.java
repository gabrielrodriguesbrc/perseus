package com.br.perseus.tipos;

public enum EnumTipoCartao {

    VS("Visa"),
    MC("Master Card"),
    AE("American Express"),
    EL("Elo"),
    DN("Discover Network");

    private String valor;

    EnumTipoCartao(String valor) {
        this.valor = valor;
    }
}
