package com.practice.riotdo.dto;

import com.practice.riotdo.entity.Img;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImgDto {
    private int img_id;
    private String img_path;
    private String img_name;

    public static ImgDto toDto(Img img) {
        return new ImgDto(img.getImg_id(), img.getImg_path(), img.getImg_name());
    }
}
