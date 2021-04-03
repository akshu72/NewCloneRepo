package com.cjc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig
{
	 @Bean
	public UserDetailsService userDatailsService()
	 {
		 var ud= new InMemoryUserDetailsManager();
		 
		var user= User.withUsername("akshay")
		 .password("123")
		 .authorities("read")
		 .build();
		 ud.createUser(user);
		return ud;
		
	}
	 @Bean
	 public PasswordEncoder passwordEncorder()
	 {
		 return NoOpPasswordEncoder.getInstance();
	 }
}
