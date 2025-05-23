package com.sd_negeri_manado.sd_negeri_manado.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ekstrakurikuler")
public class Extracurricular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name="keterangan")
    private String description;

    @Column(name="penanggung_jawab")
    private String stakeHolder;
}
