/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.fabrica;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gabrielrodrigues
 */
public class EntityFactoryPersistence {

    protected static EntityManagerFactory entityManagerFactory;

    public EntityFactoryPersistence() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("perseus-PU");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
