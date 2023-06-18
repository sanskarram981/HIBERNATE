package com.spring;

import com.spring.entities.Student;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

       // Student st = new Student(1,"Shivam Sunderam","Ranchi",new cer);
        //System.out.println(st);
        Configuration myconfig = new Configuration();
        SessionFactory factory = myconfig.configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(st1);
        //session.update(st);

            Student st4 = session.get(Student.class,2);
            System.out.println("try -> "+st4);

        Student st5 = session.get(Student.class,1);
        System.out.println("try -> "+st5);

        if(st4 != null)
            System.out.println("null not found!!");
        if(st5 == null)
            System.out.println("null found!!");

        try
        {
            Student st6 = session.get(Student.class,2);
            System.out.println("no exception");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Student st7 = session.get(Student.class,1);
            System.out.println("no exception");
        }
        catch (ObjectNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        //session.delete(st);
        tx.commit();
        session.close();
    }
}
