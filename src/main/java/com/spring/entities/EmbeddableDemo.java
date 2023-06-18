package com.spring.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!!");

        Configuration myconfig = new Configuration();
        SessionFactory factory = myconfig.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Certificate ct = new Certificate("java",2);
        System.out.println(ct);
        Student st = new Student(1,"Shivam Sunderam Sahu","Booty More",ct);
        System.out.println(st);
        session.save(st);
        tx.commit();
        session.close();
    }
}
