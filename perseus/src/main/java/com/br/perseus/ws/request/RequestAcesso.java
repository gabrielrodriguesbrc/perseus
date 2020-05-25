/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.ws.request;

import com.br.perseus.entidades.Usuario;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author gabrielrodrigues
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class RequestAcesso {

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
