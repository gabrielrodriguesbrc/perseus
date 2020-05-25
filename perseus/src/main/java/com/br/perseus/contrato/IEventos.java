/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

import com.br.perseus.entidades.Evento;
import com.br.perseus.entidades.Usuario;
import java.util.List;

/**
 *
 * @author gabrielrodrigues
 */
public interface IEventos {

    public List<Evento> buscaEventosProximos(Usuario usuario) throws Exception;
    
    public Evento buscaEvento(Evento evento) throws Exception;
    
}
