package com.example.kkoriFriends.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbandonedDTO {

    //유기고유번호
    private String ABDM_IDNTFY_NO;
    //품종
    private String SPECIES_NM;
    //색상
    private String COLOR_NM;
    //나이
    private String AGE_INFO;
    //체중
    private String BDWGH_INFO;
    //이미지 경로
    private String IMAGE_COURS;
    //성별
    private String SEX_NM;
    //중성화여부
    private String NEUT_YN;
    //특징
    private String SFETR_INFO;
    //보호명
    private String SHTER_NM;

}
