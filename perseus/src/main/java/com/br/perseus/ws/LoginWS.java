/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.ws;

import com.br.perseus.entidades.Usuario;
import com.br.perseus.requestWS.RequestAcesso;
import com.br.perseus.responseWS.ResponseAcesso;
import com.br.perseus.responseWS.ResponseStatus;
import com.br.perseus.servico.ServicoUsuario;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author gabriel-pc
 */
@Path("acesso")
public class LoginWS {

    @POST
    @Path("teste")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseAcesso validaAcesso() {

        ResponseAcesso response = new ResponseAcesso();
        Usuario usuario = new Usuario();
        Usuario us = new Usuario();
        us.setNome("gabriel");

        ServicoUsuario servico = new ServicoUsuario();
        try {
            usuario = servico.salvarUsuario(us);
        } catch (Exception e) {
        }
        ResponseStatus status = new ResponseStatus();
        status.setMensagem("Verdade não minto");
        status.setStatus(true);
        response.setStatus(status);
        response.setUsuario(usuario);

        return response;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("usuarios")
    public String getUsuario() {
        ResponseAcesso response = new ResponseAcesso();
        ResponseStatus status = new ResponseStatus();
        status.setMensagem("Verdade não minto");
        status.setStatus(true);
        response.setStatus(status);

        return response.toString();

    }

}
