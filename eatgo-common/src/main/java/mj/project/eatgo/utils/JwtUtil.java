package mj.project.eatgo.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class JwtUtil {
    public String createToken(long userId, String name) {

        String secret = "12345678901234567890123456789012";
        Key key = Keys.hmacShaKeyFor(secret.getBytes());

        String token = Jwts.builder()
                .claim("userId", userId)
                .claim("name", name)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        System.out.println(">>>>>token" + token);
        return token;
    }
}
