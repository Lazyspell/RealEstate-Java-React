package com.example.realestatejavareact.web.security;

import com.example.realestatejavareact.web.dtos.Principal;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class TokenGenerator {

    public TokenGenerator(){}

    public static String createJwt(Principal subject){
        long now = System.currentTimeMillis();

        JwtBuilder builder = Jwts.builder()
                                    .setId(Integer.toString(subject.getId()))
                                    .setSubject(subject.getUsername())
                                    .claim("role", subject.getRole().toString())
                                    .setIssuer("realestate")
                                    .setIssuedAt(new Date(now))
                                    .setExpiration(new Date(now + JwtConfig.EXPIRATION))
                                    .signWith(JwtConfig.SIG_ALG, JwtConfig.SECRET.getBytes());

        return JwtConfig.PREFIX + builder.compact();
    }
}
