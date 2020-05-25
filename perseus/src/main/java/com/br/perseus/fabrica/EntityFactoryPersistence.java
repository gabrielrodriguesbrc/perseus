/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.perseus.fabrica;

import javax.persistence.EntityManager;
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
            EntityManagerFactory em = Persistence.createEntityManagerFactory("perseus-PU");
            EntityManager entityManager = em.createEntityManager();
            entityManager.close(); 
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
