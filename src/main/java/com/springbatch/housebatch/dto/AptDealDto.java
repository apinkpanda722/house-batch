package com.springbatch.housebatch.dto;

import lombok.Getter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *  아파트 실거래가 API의 각각의 거래 정보를 담는 객체
 */
@ToString
@Getter
@XmlRootElement(name = "item")
public class AptDealDto {

    @XmlElement(name = "거래금액")
    private String dealAmount;

    @XmlElement(name = "거래유형")
    private String dealType;

    @XmlElement(name = "건축년도")
    private Integer builtYear;

    @XmlElement(name = "년")
    private Integer year;

    @XmlElement(name = "도로명")
    private String roadName;

    @XmlElement(name = "도로명건물본번호코드")
    private String roadNameBuildingMainNumberCode;

    @XmlElement(name = "도로명건물부번호코드")
    private String roadNameBuildingSecondNumberCode;

    @XmlElement(name = "도로명시군구코드")
    private String roadNameGunDistrictCode;

    @XmlElement(name = "도로명일련번호코드")
    private String roadNameSerialNumberCode;

    @XmlElement(name = "도로명지상지하코드")
    private String roadNameUnderGroundCode;

    @XmlElement(name = "도로명코드")
    private String roadNameCode;

    @XmlElement(name = "동")
    private String dong;

    @XmlElement(name = "등기일자")
    private String registrationDate;

    @XmlElement(name = "매도자")
    private String seller;

    @XmlElement(name = "매수자")
    private String buyer;

    @XmlElement(name = "법정동")
    private String lawDong;

    @XmlElement(name = "법정동본번코드")
    private String lawDongMainNumberCode;

    @XmlElement(name = "법정동부번코드")
    private String lawDongSecondNumberCode;

    @XmlElement(name = "법정동시군구코드")
    private String lawDongGunDistrictCode;

    @XmlElement(name = "법정동읍면동코드")
    private String lawDongMyunDistrictCode;

    @XmlElement(name = "법정동지번코드")
    private String lawDongJibunCode;

    @XmlElement(name = "아파트")
    private String aptName;

    @XmlElement(name = "월")
    private Integer month;

    @XmlElement(name = "일")
    private Integer day;

    @XmlElement(name = "일련번호")
    private String serialNumber;

    @XmlElement(name = "전용면적")
    private Double exclusiveArea;

    @XmlElement(name = "중개사소재지")
    private String intermediaryAgentLocation;

    @XmlElement(name = "지번")
    private String jibun;

    @XmlElement(name = "지역코드")
    private String regionalCode;

    @XmlElement(name = "층")
    private Integer floor;

    @XmlElement(name = "해제사유발생일")
    private String dealCanceledDate;

    @XmlElement(name = "해제여부")
    private String dealCanceled;
}
