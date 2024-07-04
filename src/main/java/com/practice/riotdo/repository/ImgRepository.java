package com.practice.riotdo.repository;

import com.practice.riotdo.entity.Img;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImgRepository extends JpaRepository<Img, Integer> {
    Img findById(int id);
}