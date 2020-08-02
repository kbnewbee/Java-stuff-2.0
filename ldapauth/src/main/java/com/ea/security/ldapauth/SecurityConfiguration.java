package com.ea.security.ldapauth;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.ldapAuthentication()
			.userDnPatterns("")
			.groupSearchBase("")
			.contextSource()
			.url("")
			.and()
			.passwordCompare()
			.passwordEncoder(new LdapShaPasswordEncoder())
			.passwordAttribute("");
	}


}
