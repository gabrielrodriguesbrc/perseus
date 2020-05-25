package com.br.perseus.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Embeddable
@Table(name = "categoria_usuario")
public class CategoriaUsuario implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoria")
    private Integer idCategoria;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

}
