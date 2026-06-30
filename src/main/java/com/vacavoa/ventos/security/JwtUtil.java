package com.vacavoa.ventos.security;

import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;

public class JwtUtil {
    private static final SecretKey key = Jwts.SIG.HS256.key().build();
    private static final long EXPIRATION_TIME = 86400000;

    public String generateToken(String username)
    {
        return Jwts.builder()
            .subject(username)
            .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(key)
            .compact();            
    }

    public String extractUsername(String token)
    {
        return Jwts.parser()
            .verifyWith(key)
            .build()
            .parseSignedClaims(token)
            .getPayload()
            .getSubject();
    }

    public boolean validateToken(String token)
    {
        try
        {
            Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token);

                return true;
        }
        catch(JwtException exception)
        {
            return false;
        }
    }
}
