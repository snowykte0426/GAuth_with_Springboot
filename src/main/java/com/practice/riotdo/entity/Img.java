package com.practice.riotdo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Img {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int img_id;
    @Column(unique = true, nullable = false)
    private String img_name;
    @Column(unique = true, nullable = false)
    private String img_path;
}