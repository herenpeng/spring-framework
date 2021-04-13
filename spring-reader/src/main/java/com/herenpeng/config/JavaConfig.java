package com.herenpeng.config;

import com.herenpeng.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author herenpeng
 * @since 2021-03-06 18:01
 */
@Configuration
public class JavaConfig {


	@Bean("user")
	public User user() {
		return new User();
	}

}
