/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.dao;

import com.br.perseus.contrato.IEventos;
import com.br.perseus.entidades.Categoria;
import com.br.perseus.entidades.Evento;
import com.br.perseus.entidades.Usuario;
import java.util.List;

/**
 *
 * @author gabrielrodrigues
 */
public class DaoEventos extends DaoGenerico<DaoEventos> implements IEventos {

    @Override
    public Evento buscaEvento(Evento evento) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> buscaEventosProximos(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento alteraEvento(Evento evento) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desativarEvento(Evento evento) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> buscaEventosCategoria(List<Categoria> categorias) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
