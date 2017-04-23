/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentSpring.Main;

import AssignmentSpring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Darediya
 */
public class Main {
    public static void main(String[]args){
    ApplicationContext context =
    	  new ClassPathXmlApplicationContext(new String[] {"SpringDao.xml"});
    
    Student bean = (Student) context.getBean("student");
    System.out.println(bean);
    }
}
