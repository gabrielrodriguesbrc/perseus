package com.br.perseus.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carteira")
public class Carteira implements Serializable {

    @Id
    @Column(name = "ID_CATEIRA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarteira;
    @Column(name = "SALDO")
    private Double saldo;
    @OneToMany(mappedBy = "carteira")
    private List<Cartao> cartao;
    @OneToMany(mappedBy = "idHistoricoTransacao")
    private List<HistoricoTransacao> historicoTransacao;
    @OneToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    public Integer getIdCarteira() {
        return idCarteira;
    }

    public void setIdCarteira(Integer idCarteira) {
        this.idCarteira = idCarteira;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Cartao> getCartao() {
        return cartao;
    }

    public void setCartao(List<Cartao> cartao) {
        this.cartao = cartao;
    }

    public List<HistoricoTransacao> getHistoricoTransacao() {
        return historicoTransacao;
    }

    public void setHistoricoTransacao(List<HistoricoTransacao> historicoTransacao) {
        this.historicoTransacao = historicoTransacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
