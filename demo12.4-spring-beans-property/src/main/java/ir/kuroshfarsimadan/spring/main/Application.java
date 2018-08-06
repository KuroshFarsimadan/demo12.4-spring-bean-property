package ir.kuroshfarsimadan.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import ir.kuroshfarsimadan.spring.beans.User;

public class Application {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new FileSystemXmlApplicationContext("beans.xml");
		System.out.println("Spring beans test");
		User user = (User) context.getBean("user");
		user.whoIsUser();
		System.out.println(user.toString());

	}

}
