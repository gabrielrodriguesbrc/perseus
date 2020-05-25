/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.ws.response;

import com.br.perseus.entidades.Usuario;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author gabrielrodrigues
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseAcesso {

    private ResponseStatus status;
    private Usuario usuario;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
