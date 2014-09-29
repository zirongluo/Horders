package com.mkyong.common;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.horders.model.UserInfo;
import com.horders.persistence.HibernateUtil;



 
public class App 
{
	/*@Test
	public static void main(String[] args)
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Stock stock = new Stock();
 
        stock.setStockCode("4725");
        stock.setStockName("GANM");
 
        session.save(stock);
        session.getTransaction().commit();
    }*/
	@Test
	@Transactional
	public void HibernateTest()
	{
        System.out.println("Maven + Hibernate + MySQL");
        /*Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        UserInfo userInfo = new UserInfo();
 
        userInfo.setUserName("fanyarong");
        userInfo.setPassword("dddddd");
        userInfo.setAccount(100);
 
        session.save(userInfo);
        session.getTransaction().commit();*/
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        
//      UserInfo userInfo = new UserInfo();
//      
//      userInfo.setUserName("fanyarong1");
//      userInfo.setPassword("dddddd1");
//      userInfo.setAccount(100);
//      sessionFactory.getCurrentSession().persist(userInfo);
//        UserService service = new UserService();
//        UserInfo userInfo = new UserInfo();
//        
//        userInfo.setUserName("fanyarong1");
//        userInfo.setPassword("dddddd1");
//        userInfo.setAccount(100);
//        service.saveUser(userInfo);
	}
	public static void main(String[] arg){
		send();
	}

	   private static final String USERNAME = "zirongluo@sina.com";
	    private static final String PASSWD = "5710802";
	    private static final String RECEIVER = "zirongluo@163.com";//"zirongluo@sina.com";
	 public static void send()    
	    {    
		 System.setProperty("java.net.preferIPv4Stack", "true");
	        SimpleEmail email = new SimpleEmail();       
	        //email.setTLS(true); //是否TLS校验，，某些邮箱需要TLS安全校验，同理有SSL校验  
	        email.setDebug(true);  
	        //email.setSSL(true);          
	        email.setHostName("smtp.sina.com");   
	        email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWD));  
	        try     
	        {    
	         email.setFrom(USERNAME); //发送方,这里可以写多个  
	         email.addTo(RECEIVER); // 接收方  
	         email.setCharset("GB2312");  
	         email.setSubject("标题哦"); // 标题  
	         email.setMsg("测试测试内容，请查阅");
	         email.send();  
	         System.out.println("发送成功");  
	        } catch (EmailException e) {    
	            e.printStackTrace();    
	        }     
	    }    
	      
}
