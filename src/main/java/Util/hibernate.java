package Util;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import metier.Reservation;
import metier.vol;
import metier.passager;
import metier.siege;
import metier.utilisateur;
import metier.airport;



public class hibernate {

		private static SessionFactory sessionFactory;
		
		public static SessionFactory getSessionFactory() {
			if (sessionFactory == null) {
				try {
					Configuration configuration = new Configuration();
					

					Properties settings = new Properties();
					settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
					settings.put(Environment.URL, "jdbc:mysql://localhost:3306/Bookyourflight");
					settings.put(Environment.USER, "root");
					settings.put(Environment.PASS, "TAHAtaha");
					settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
					settings.put(Environment.HBM2DDL_AUTO, "update");
					settings.put(Environment.SHOW_SQL, "true");


					configuration.setProperties(settings);
					  configuration.addAnnotatedClass(vol.class);
					  configuration.addAnnotatedClass(passager.class);
					  configuration.addAnnotatedClass(siege.class);
					  configuration.addAnnotatedClass(airport.class);
					  configuration.addAnnotatedClass(utilisateur.class);
					  configuration.addAnnotatedClass(Reservation.class);

					 
					
					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties()).build();
					
					sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return sessionFactory;
		}
	}
