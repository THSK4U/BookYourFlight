package dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import metier.vol;
import metier.airport;
import Util.hibernate;

public class flyDao {

	//save
	    public void saveVol(airport vol) {
	        Transaction transaction = null;
	        try (Session session = hibernate.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();
	            session.save(vol);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        	}
	    	}
	    
	    //all vol
	    @SuppressWarnings("unchecked")
		public List<vol> allvol() {
	        Transaction transaction = null;
	        List<vol>  vols = null;
	        try (Session session = hibernate.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();
	            
	            vols = session.createQuery("From vol").list();
	            
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        	}
	        return vols;
	    		}
		
	    //by id
	    public airport volbyid(int  id) {
	        Transaction transaction = null;
	        airport vols = null;
	        try (Session session = hibernate.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();
	            
	            vols = session.get(airport.class, id);
	            
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        	}
	        return vols;
	    		}
	    
	    //update
	    public void updateVol(vol vol) {
	        Transaction transaction = null;
	        try (Session session = hibernate.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();
	            session.saveOrUpdate(vol);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        	}
	    		}
	    //delete
	    public void deletvol(int  id) {
	        Transaction transaction = null;
	        airport vols = null;
	        try (Session session = hibernate.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();
	            
	            vols = session.get(airport.class, id);
	            session.delete(vols);
	            
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        	}
	    		}
}