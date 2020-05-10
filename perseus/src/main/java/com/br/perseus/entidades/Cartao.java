package com.br.perseus.entidades;

import com.br.perseus.tipos.EnumCreditoDebito;
import com.br.perseus.tipos.EnumTipoCartao;
import java.io.Serializable;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cartao")
public class Cartao implements Serializable {

    @Id
    @Column(name = "ID_CARTAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCartao;
    @Column(name = "BANDEIRA")
    @Enumerated(EnumType.STRING)
    private EnumTipoCartao cartao;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "NUMERO")
    private long numero;
    @Column(name = "VALIDADE")
    private Date validade;
    @Column(name = "TITULAR")
    private String titular;
    @Column(name = "TIPO")
    @Enumerated(EnumType.STRING)
    private EnumCreditoDebito tipo;
    @Column(name = "AGENCIA")
    private Integer agencia;
    @Column(name ="CONTA")
    private Integer conta;
    @Column(name = "DIGITO")
    private Integer digito;
    @Column(name = "CPF")
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "ID_CARTEIRA")
    private Carteira carteira;

    public Cartao() {
    }

    public Integer getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Integer idCartao) {
        this.idCartao = idCartao;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public EnumTipoCartao getCartao() {
        return cartao;
    }

    public void setCartao(EnumTipoCartao cartao) {
        this.cartao = cartao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public EnumCreditoDebito getTipo() {
        return tipo;
    }

    public void setTipo(EnumCreditoDebito tipo) {
        this.tipo = tipo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartao cartao = (Cartao) o;
        return numero == cartao.numero &&
                idCartao.equals(cartao.idCartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCartao, numero);
    }
}
