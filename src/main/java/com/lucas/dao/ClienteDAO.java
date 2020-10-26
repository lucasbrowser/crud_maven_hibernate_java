/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.dao;

import com.lucas.model.Cliente;
import com.lucas.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author lucas
 */
public class ClienteDAO {
    
    public static ClienteDAO cliDao = null;
    
    private SessionFactory factory;
    private Transaction transaction;
    private Session session;
    
    public ClienteDAO(){
        factory = HibernateUtil.getSessionFactory();
    }
    
    public static ClienteDAO getInstance(){
        if(cliDao == null){
            cliDao = new ClienteDAO();
        }
        return cliDao;
    }
    
    public void create(Cliente cliente) {
	try{
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(cliente);
            transaction.commit();
	}catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
	}finally {
            session.close();
	}
    }
    
    public void update(Cliente cliente) {
	try{
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.merge(cliente);
            transaction.commit();
	}catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
	}finally {
            session.close();
	}
    }
    
    public void delete(Cliente cliente) {
	try{
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.delete(cliente);
            transaction.commit();
	}catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
	}finally {
            session.close();
	}
    }
    
    public Cliente select(long id) {
        Cliente result = new Cliente();
	try{
            session = factory.openSession();
            transaction = session.beginTransaction();
            result = (Cliente) session.get(Cliente.class, id);
            transaction.commit();
	}catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
	}finally {
            session.close();
	}
        return result;
    }
    
    @SuppressWarnings("unchecked")
    public List<Cliente> findCliente() {
	List<Cliente> lista = new ArrayList<Cliente>();
	try{
            session = factory.openSession();
            transaction = session.beginTransaction();
            lista = (List<Cliente>) session.createCriteria(Cliente.class).list();
            transaction.commit();
	}catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
        }finally {
            session.close();
	}
        return lista;
    }
    
    @SuppressWarnings("unchecked")
    public List<Cliente> findCliente(Cliente cliente) {
	Criteria c = session.createCriteria(Cliente.class);
        if (cliente.getNome().length() > 0) {
            c.add(Restrictions.like("nome", cliente.getNome() + "%"));
	}
	c.addOrder(Order.asc("nome"));
	return (List<Cliente>) c.list();
    }
    
    
}
