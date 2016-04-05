package com.test.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
		private static final SessionFactory sessionFactory ;
//		private static ServiceRegistry serviceRegistry;

		 static  {

			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();

//				return configuration.buildSessionFactory();
				// this should be passed as parameter if above line uncommented: serviceRegistry;

			} catch (Throwable ex) {

				System.err.println("Failed to create sessionFactory object." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}

		public static SessionFactory getSessionFactory() {

			return sessionFactory;
		
		}
	
		public static void shutDown(){
			sessionFactory.close();
		}
}




