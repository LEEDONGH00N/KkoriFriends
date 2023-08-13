package com.example.kkoriFriends.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbandonedDTO {
    //시군코드
    private String SIGUN_CD;
    //시군명
    private String SIGUN_NM;
    //유기고유번호
    private String ABDM_IDNTFY_NO;
    //썸네일
    private String THUMB_IMAGE_COURS;
    //접수일자
    private String RECEPT_DE;
    //발견장소
    private String DISCVRY_PLC_INFO;
    //품종
    private String SPECIES_NM;
    //색상
    private String COLOR_NM;
    //나이
    private String AGE_INFO;
    //치중
    private String BDWGH_INFO;
    //공고 고유번호
    private String PBLANC_IDNTFY_NO;
    //공고시작일자
    private String PBLANC_BEGIN_DE;
    //공고마감일자
    private String PBLANC_END_DE;
    //이미지 경로
    private String IMAGE_COURS;
    //상태
    private String STATE_NM;
    //성별
    private String SEX_NM;
    //중성화여부
    private String NEUT_YN;
    //특징
    private String SFETR_INFO;

    //보호명
    private String SHTER_NM;

}
