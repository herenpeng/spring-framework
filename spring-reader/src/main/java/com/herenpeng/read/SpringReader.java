package com.herenpeng.read;

import com.herenpeng.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author herenpeng
 * @since 2021-02-06 19:48
 */
public class SpringReader {

	public static void main(String[] args) {
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-${name}.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-${sun.jnu.encoding}.xml");
		User user = applicationContext.getBean("user", User.class);
		user.setUsername("I am a Spring reader");
		System.out.println(user.getUsername());
	}

}
