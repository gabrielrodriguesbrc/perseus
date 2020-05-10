/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.contrato;

import com.br.perseus.entidades.Usuario;

/**
 *
 * @author gabriel-pc
 */
public interface IUsuario {

    public Usuario salvar(Usuario entidade) throws Exception;

    public Usuario alterar(Usuario entidade, Integer id) throws Exception;

    public void excluir(Usuario entidade, Integer id) throws Exception;
    
    public Usuario desativar(Usuario entidade) throws Exception;
}
