package com.br.perseus.entidades;

import com.br.perseus.tipos.EnumAcesso;
import com.br.perseus.tipos.EnumSexo;
import com.br.perseus.tipos.EnumSimNao;
import java.time.LocalDateTime;
import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @NotNull
    @Column(name = "USUARIO")
    private String usuario;
    @NotNull
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SEXO")
    private EnumSexo sexo;
    @NotNull
    @Column(name = "IDADE")
    private Integer idade;
    @Enumerated(EnumType.STRING)
    private List<EnumAcesso> acesso;
    @OneToMany(mappedBy = "idEndereco")
    private List<Endereco> endereco;
    @OneToOne
    @JoinColumn(name = "ID_CARTEIRA")
    private Carteira carteira;
    @Column(name = "ATIVO")
    @Enumerated(EnumType.STRING)
    private EnumSimNao ativo;
    @ManyToMany(mappedBy = "usuarios")
    private List<Categoria> categorias;
    @Column(name = "DATA_CRIACAO", updatable = false)
    private LocalDateTime dataCriacao;
    @Column(name = "DATA_ATUALIZACAO", insertable = false)
    private LocalDateTime dataAtualizacao;

    @Transient
    private String primeiroNome;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumSexo getSexo() {
        return sexo;
    }

    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<EnumAcesso> getAcesso() {
        return acesso;
    }

    public void setAcesso(List<EnumAcesso> acesso) {
        this.acesso = acesso;
    }
 
    

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public EnumSimNao getAtivo() {
        return ativo;
    }

    public void setAtivo(EnumSimNao ativo) {
        this.ativo = ativo;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    @PrePersist
    public void persist() {
        dataCriacao = LocalDateTime.now();
    }

    @PreUpdate
    public void persistAt() {
        dataAtualizacao = LocalDateTime.now();
    }

    @PostLoad
    public void getFirstName() {
        if (nome != null) {
            primeiroNome = nome.substring(0, nome.indexOf(" "));
        }
    }

}
