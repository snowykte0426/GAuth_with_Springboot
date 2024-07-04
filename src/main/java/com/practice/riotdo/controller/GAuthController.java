package com.practice.riotdo.controller;

import com.practice.riotdo.dto.GAuthSigninRequestDto;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class GAuthController {
    @NotBlank
    String code;
}

public class AuthController {

    @PostMapping("/gauth")
    public ResponseEntity<SigninResponse> gauthSignin(GAuthSigninRequestDto gauthSigninRequestDTO) {
        SigninResponse responseDto = oooService.gauthSignin(gauthSigninRequestDTO);
        return new ResponseEntity.ok(responseDto);
    }

}