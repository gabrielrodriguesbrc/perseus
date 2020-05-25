
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.servico;

import com.br.perseus.contrato.IUsuario;
import com.br.perseus.entidades.Usuario;
import com.br.perseus.fabrica.Fabrica;

/**
 *
 * @author gabriel-pc
 */
public class ServicoUsuario {

    private final IUsuario crud;

    public ServicoUsuario() {
        this.crud = Fabrica.obterUsuario();
    }

    public Usuario salvarUsuario(Usuario entidade) throws Exception {
        crud.salvar(entidade);
        return entidade;
    }

}
