package com.example.kkoriFriends.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "abandoned")
public class Abandoned {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SIGUN_CD")
    private String SIGUN_CD;

    @Column(name = "SIGUN_NM")
    private String SIGUN_NM;

    @Column(name = "ABDM_IDNTFY_NO")
    private String ABDM_IDNTFY_NO;

    @Column(name = "THUMB_IMAGE_COURS")
    private String THUMB_IMAGE_COURS;

    @Column(name = "RECEPT_DE")
    private String RECEPT_DE;

    @Column(name = "DISCVRY_PLC_INFO")
    private String DISCVRY_PLC_INFO;

    @Column(name = "SPECIES_NM")
    private String SPECIES_NM;

    @Column(name = "COLOR_NM")
    private String COLOR_NM;

    @Column(name = "AGE_INFO")
    private String AGE_INFO;

    @Column(name = "BDWGH_INFO")
    private String BDWGH_INFO;

    @Column(name = "PBLANC_IDNTFY_NO")
    private String PBLANC_IDNTFY_NO;

    @Column(name = "PBLANC_BEGIN_DE")
    private String PBLANC_BEGIN_DE;

    @Column(name = "PBLANC_END_DE")
    private String PBLANC_END_DE;

    @Column(name = "IMAGE_COURS")
    private String IMAGE_COURS;

    @Column(name = "STATE_NM")
    private String STATE_NM;

    @Column(name = "SEX_NM")
    private String SEX_NM;

    @Column(name = "NEUT_YN")
    private String NEUT_YN;

    @Column(name = "SFETR_INFO")
    private String SFETR_INFO;

    @Column(name = "SHTER_NM")
    private String SHTER_NM;

    @Column(name = "SHTER_TELNO")
    private String SHTER_TELNO;

    @Column(name = "PROTECT_PLC")
    private String PROTECT_PLC;

    @Column(name = "JURISD_INST_NM")
    private String JURISD_INST_NM;

    @Column(name = "CHRGPSN_NM")
    private String CHRGPSN_NM;

    @Column(name = "CHRGPSN_CONTCT_NO")
    private String CHRGPSN_CONTCT_NO;

    @Column(name = "PARTCLR_MATR")
    private String PARTCLR_MATR;

    @Column(name = "REFINE_LOTNO_ADDR")
    private String REFINE_LOTNO_ADDR;

    @Column(name = "REFINE_ROADNM_ADDR")
    private String REFINE_ROADNM_ADDR;

    @Column(name = "REFINE_ZIP_CD")
    private String REFINE_ZIP_CD;

    @Column(name = "REFINE_WGS84_LOGT")
    private String REFINE_WGS84_LOGT;

    @Column(name = "REFINE_WGS84_LAT")
    private String REFINE_WGS84_LAT;


}
