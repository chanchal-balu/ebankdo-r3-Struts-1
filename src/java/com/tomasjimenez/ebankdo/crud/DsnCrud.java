/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasjimenez.ebankdo.crud;

import com.tomasjimenez.ebankdo.hibernate.table.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Tomas
 */
public class DsnCrud {
    Session session = com.tomasjimenez.ebankdo.hibernate.config.NewHibernateUtil.getSessionFactory().openSession();
    public void insert(String x, String y, String z){
    
    try {
            Transaction tr = session.beginTransaction();
            Customer dsn = new Customer();

            dsn.setName(x);
            dsn.setCredit_card_number(y);
            dsn.setStatus(z);

            session.save(dsn);
            tr.commit();

        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void update(int v, String x, String y, String z){
        try {
            Transaction tr = session.beginTransaction();
            Customer dsn = (Customer) session.load(Customer.class, v);        
            dsn.setName(x);
            dsn.setCredit_card_number(y);
            dsn.setStatus(z);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
    
    public void delete(int x){
        try {
            Transaction tr = session.beginTransaction();
            Customer dsn = (Customer) session.load(Customer.class, x);        
            session.delete(dsn);
            tr.commit();
        } catch (HibernateException ex) {
            System.out.println("-" + ex);
        }
    }
}
