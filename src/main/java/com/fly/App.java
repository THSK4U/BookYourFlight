package com.fly;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration c = new Configuration();
        
        c.configure();
        
       SessionFactory f =  c.buildSessionFactory();
       System.out.println(f);
       
    }
}
