package com.fly;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Util.hibernate;
import metier.vol;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
        System.out.println("Hello World!");

        
        SessionFactory factory = hibernate.getSessionFactory();
       
        vol emp = new vol("taha","11212024","11222024","maroc");
        vol up = new vol(2,"Se","11212024","11222024","sdf");

        
        
        
        
        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(emp);
        
        session.update(up);
        
        tx.commit();
        session.close();
        
       
//        System.out.println(factory);
        
    }

}