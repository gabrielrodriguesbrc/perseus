/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

import com.br.perseus.entidades.Categoria;
import com.br.perseus.entidades.Evento;
import com.br.perseus.entidades.Usuario;
import java.util.List;

/**
 *
 * @author gabrielrodrigues
 */
public interface IEventos {

    public Evento buscaEvento(Evento evento) throws Exception;

    public List<Evento> buscaEventosProximos(Usuario usuario) throws Exception;

    public List<Evento> buscaEventosCategoria(List<Categoria> categorias) throws Exception;

    public Evento alteraEvento(Evento evento) throws Exception;

    public void desativarEvento(Evento evento) throws Exception;

}
