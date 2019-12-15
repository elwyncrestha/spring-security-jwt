package com.elvin.springsecurityjwt.model;

/**
 * @author Elvin Shrestha on 15/12/2019
 */
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
