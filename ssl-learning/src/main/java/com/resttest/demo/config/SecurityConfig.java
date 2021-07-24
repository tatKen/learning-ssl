package com.resttest.demo.config;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig {//extends WebSecurityConfigurerAdapter{
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.anyRequest().authenticated().and()
//		.x509().subjectPrincipalRegex("CN=(.*?)(?:,|$)"); 
////		.userDetailsService(userDetailsService()); 
//	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		return (UserDetailsService) username -> {
//			if(username.equals("ball")) {
//				return new User(username, "", 
//						AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER")); 
//			} else {
//				throw new UsernameNotFoundException(String.format("User %s not found", username));
//			}
//		}; 
//	}
}
