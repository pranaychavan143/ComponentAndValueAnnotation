package com.pranay.SpringAutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pranay.model.UserDetails;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cnt=new ClassPathXmlApplicationContext("Bean.xml");
       
         UserDetails userDetails = cnt.getBean("userBean", UserDetails.class);
         System.out.println(userDetails.getUserName() +"\t"+userDetails.getPassword());
           ((AbstractApplicationContext) cnt).close();
          }
}
