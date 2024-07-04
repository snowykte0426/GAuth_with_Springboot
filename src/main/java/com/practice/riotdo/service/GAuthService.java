package com.practice.riotdo.service;

public class GAuthService {
    private final GAuth gauth;


    public SigninResponse gauthSignin(GAuthSigninRequestDTO gauthSigninRequestDTO) {
        try {
            // GAuth 서비스 사용을 위한 GAuth 토큰 발급
            GAuthToken gauthToken = gauth.generateToken(
                    gauthSigninRequestDTO.code, // 발급된 GAuth 코드
                    { 등록한 서비스의 ClientID },
                    { 등록한 서비스의 ClientSecret },
                    { 등록한 서비스의 redirectUri }
            );

            // GAuth로부터 유저 정보 가져오기
            GAuthUserInfo userInfo = gauth.getUserInfo(gauthToken.accessToken);

            // 유저가 이미 있다면 로그인, 없다면 회원가입 처리
            // userInfo.role을 통한 분기 처리 (ROLE_STUDENT, ROLE_TEACHER, ROLE_GRADUATE)
            // 자체 서비스의 토큰 생성 및 반환
        } catch(GAuthException e) {
            // e.code == 에러의 status code 를 통해 예외처리
        }
    }
}