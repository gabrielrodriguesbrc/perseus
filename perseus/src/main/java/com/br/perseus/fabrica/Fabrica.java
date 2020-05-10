/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.fabrica;

import com.br.perseus.contrato.ICategoria;
import com.br.perseus.contrato.IUsuario;
import com.br.perseus.dao.DaoCategoria;
import com.br.perseus.dao.DaoUsuario;

/**
 *
 * @author gabriel-pc
 */
public class Fabrica {

    public static IUsuario obterUsuario() {
        return new DaoUsuario();
    }

    public static ICategoria obterCategoria() {
        return new DaoCategoria();
    }
}
