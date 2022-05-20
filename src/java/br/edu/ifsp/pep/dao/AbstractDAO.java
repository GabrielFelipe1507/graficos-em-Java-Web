package br.edu.ifsp.pep.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO<T> {
    
    @PersistenceContext(unitName = "")
    private EntityManager em;    
    
    public void create(T entity){
        em.persist(entity);    
    }
    
    public void remove(T entity){
        em.remove(em.merge(entity));
    }
    
    public void edit(T entity){
        em.merge(entity);    
    }
    
}
