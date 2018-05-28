package com.lydex.gestion_sst.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Resource(name = "UserDetailsServiceImpl")
    private UserDetailsService userDetailsService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        //http.csrf().ignoringAntMatchers("/nocsrf","/ignore/startswith/**");
        /*
        *
        * */

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers("/login/**","/chantier/**","/userName/**","/visiteHs/**",
                "/myVisiteHs/**","/visiteHsByEtat/**","/compteRenduByEtat/**").permitAll();

       // http.authorizeRequests().antMatchers(HttpMethod.PUT, "/chantier/**","/compteRenduByEtat/**").permitAll();
        /*
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/action/**","/visiteHs/**","/observations").permitAll();
        http.authorizeRequests().antMatchers(HttpMethod.POST, "/action/**","/visiteHs/**","/observations").permitAll();
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/action/**","").hasAuthority("APS");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/action/**","").hasAuthority("APS");
        */
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilter(new JWTAuthentificationFilter(authenticationManager()));
        http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}
