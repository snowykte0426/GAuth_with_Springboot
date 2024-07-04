package com.practice.riotdo.dto;

import jakarta.validation.constraints.NotBlank;

public class GAuthSigninRequestDto {
    @NotBlank
    String code;
}