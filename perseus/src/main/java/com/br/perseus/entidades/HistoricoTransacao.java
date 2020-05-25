package com.br.perseus.entidades;

import com.br.perseus.tipos.EnumEvento;
import java.io.Serializable;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "historico_transacao")
public class HistoricoTransacao implements Serializable {

    @Id
    @Column(name = "ID_HISTORICO_TRANSACAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistoricoTransacao;
    @Column(name = "HISTORICO")
    @Enumerated(EnumType.STRING)
    private EnumEvento historico;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "DATA")
    private Date data;
    @ManyToOne
    @JoinColumn(name = "ID_CARTEIRA")
    private Carteira carteira;

    public Integer getIdHistoricoTransacao() {
        return idHistoricoTransacao;
    }

    public void setIdHistoricoTransacao(Integer idHistoricoTransacao) {
        this.idHistoricoTransacao = idHistoricoTransacao;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public EnumEvento getHistorico() {
        return historico;
    }

    public void setHistorico(EnumEvento historico) {
        this.historico = historico;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoricoTransacao that = (HistoricoTransacao) o;
        return idHistoricoTransacao.equals(that.idHistoricoTransacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistoricoTransacao );
    }
}
