package com.example.together.global.security;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class TokenResponse {

    private String accessToken;

    private String refreshToken;
}
