package com.practice.riotdo.controller;

import com.practice.riotdo.repository.ImgRepository;
import com.practice.riotdo.response.ImgResponse;
import com.practice.riotdo.service.ImgService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Tag(name = "Image Controller", description = "이미지 반환 API")
public class ImgController {
    private final ImgService imgService;
    private final ImgRepository imgRepository;

    @Operation(summary = "전체 이미지 조회", description = "DB의 모든 이미지를 조회한다")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/list")
    public ImgResponse getList() {
        return new ImgResponse("성공", "전체 이미지 반환", imgService.img_findAll());
    }

    @Operation(summary = "이미지 업로드", description = "이미지를 업로드한다")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/img_upload")
    public String upload(@RequestParam("image") MultipartFile image) {
        if (image.isEmpty()) {
            try {
                String filename = image.getOriginalFilename();
                String filepath = "resources/static/img/" + filename;
                image.transferTo(new File(filepath));
                return "이미지 업로드 성공" + filename;
            } catch (IOException e) {
                e.printStackTrace();
                return "이미지 업로드 실패" + e.getMessage();
            }
        }
        return "올바르지 않은 파일입니다";
    }
}