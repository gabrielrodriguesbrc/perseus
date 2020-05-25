package com.br.perseus.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author gabrielrodrigues
 */
@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    @Id
    @Column(name = "ID_EVENTO")
    private Integer idEvento;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DATA")
    private Date data;
    @MapsId("idEndereco")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ENDERECO", nullable = false,
            foreignKey = @ForeignKey(name = "FK_EVENTO_ENDERECO"))
    private Endereco endereco;
    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario professor;
    @OneToMany(mappedBy = "idUsuario")
    private List<Usuario> usuarios;
    @OneToMany(mappedBy = "idCategoria")
    private List<Categoria> categorias;

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getProfessor() {
        return professor;
    }

    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

}
