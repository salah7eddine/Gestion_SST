package com.lydex.gestion_sst.sec;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import static com.lydex.gestion_sst.sec.SecurityConstants.*;

public class JWTAuthentificationFilter extends UsernamePasswordAuthenticationFilter {
    private AuthenticationManager authenticationManager;

    public JWTAuthentificationFilter(AuthenticationManager authenticationManager) {
        super();
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        com.lydex.gestion_sst.entities.user.User appUser = null;
        try {
            appUser = new ObjectMapper().readValue(request.getInputStream(), com.lydex.gestion_sst.entities.user.User.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("*****-*******");
        System.out.println("user" + appUser.getPseudoName());
        System.out.println("password" + appUser.getPassword());
        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(appUser.getPseudoName(), appUser.getPassword()));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        User springUser = (User) authResult.getPrincipal();
        String jwtToken = Jwts.builder().setSubject(springUser.getUsername()).
                setExpiration(new Date(System.currentTimeMillis() + EXPRITATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .claim("roles", springUser.getAuthorities())
                .compact();
        response.addHeader(HEADER_STRING, TOKEN_PREFIX + jwtToken);
    }
}
