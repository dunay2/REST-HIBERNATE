package web.arq.local.webuser.database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import web.arq.local.webuser.model.MtUser;

/**
 *
 * @author ashh412
 */
@Stateless
public class UserFacade extends AbstractFacade<MtUser> {

    @PersistenceContext(unitName = "WebUserPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(MtUser.class);
    }
    
}