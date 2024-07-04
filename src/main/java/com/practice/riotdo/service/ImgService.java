package com.practice.riotdo.service;

import com.practice.riotdo.dto.ImgDto;
import com.practice.riotdo.entity.Img;
import com.practice.riotdo.repository.ImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImgService {
    private final ImgRepository imgRepository;
    public Img img_save(ImgDto imgDto) {
        Img img = new Img();
        img.setImg_name((imgDto.getImg_name()));
        img.setImg_path((imgDto.getImg_path()));
        return imgRepository.save(img);
    }
    @Transactional(readOnly = true)
    public List<Img> img_findAll() {
        return imgRepository.findAll();
    }
}
