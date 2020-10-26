/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.dao;

import com.lucas.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author lucas
 */
public class DefaultDAO {
    
    public static DefaultDAO defDao = null;
    
    private SessionFactory factory;
    private Transaction transaction;
    private Session sec;
    
    public DefaultDAO(){
        factory = HibernateUtil.getSessionFactory();
    }
    
    public static DefaultDAO getInstance(){
        if(defDao == null){
            defDao = new DefaultDAO();
        }
        return defDao;
    }
    
    public boolean create(Object obj){
        boolean result = false;
        sec = factory.openSession();
        transaction = null;
        try{
           transaction = sec.beginTransaction();
           sec.save(obj);
           transaction.commit();
           result = true;
        }catch(Exception ex){
           transaction.rollback();
           result = false;
           ex.printStackTrace();
        }finally{
           sec.close();
        }
        return result;
    }
    
    public void edit(Object obj) {
        try {
            sec = factory.openSession();
            transaction = sec.beginTransaction();
            sec.merge(obj);
            transaction.commit();
	} catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
	} finally {
            sec.close();
	}
    }
    
}
