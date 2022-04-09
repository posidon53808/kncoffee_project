package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class connDatabase {
public static Session getDb() {
		Configuration c= new Configuration().configure();
		SessionFactory sf=c.buildSessionFactory();
		Session se=sf.openSession();
		return se;
}

public static ApplicationContext a1=new ClassPathXmlApplicationContext("spring.xml");

}
