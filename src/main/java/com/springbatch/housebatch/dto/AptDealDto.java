package com.springbatch.housebatch.dto;

import lombok.Getter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *  ����Ʈ �ǰŷ��� API�� ������ �ŷ� ������ ��� ��ü
 */
@ToString
@Getter
@XmlRootElement(name = "item")
public class AptDealDto {

    @XmlElement(name = "�ŷ��ݾ�")
    private String dealAmount;

    @XmlElement(name = "�ŷ�����")
    private String dealType;

    @XmlElement(name = "����⵵")
    private Integer builtYear;

    @XmlElement(name = "��")
    private Integer year;

    @XmlElement(name = "���θ�")
    private String roadName;

    @XmlElement(name = "���θ�ǹ�����ȣ�ڵ�")
    private String roadNameBuildingMainNumberCode;

    @XmlElement(name = "���θ�ǹ��ι�ȣ�ڵ�")
    private String roadNameBuildingSecondNumberCode;

    @XmlElement(name = "���θ�ñ����ڵ�")
    private String roadNameGunDistrictCode;

    @XmlElement(name = "���θ��Ϸù�ȣ�ڵ�")
    private String roadNameSerialNumberCode;

    @XmlElement(name = "���θ����������ڵ�")
    private String roadNameUnderGroundCode;

    @XmlElement(name = "���θ��ڵ�")
    private String roadNameCode;

    @XmlElement(name = "��")
    private String dong;

    @XmlElement(name = "�������")
    private String registrationDate;

    @XmlElement(name = "�ŵ���")
    private String seller;

    @XmlElement(name = "�ż���")
    private String buyer;

    @XmlElement(name = "������")
    private String lawDong;

    @XmlElement(name = "�����������ڵ�")
    private String lawDongMainNumberCode;

    @XmlElement(name = "�������ι��ڵ�")
    private String lawDongSecondNumberCode;

    @XmlElement(name = "�������ñ����ڵ�")
    private String lawDongGunDistrictCode;

    @XmlElement(name = "���������鵿�ڵ�")
    private String lawDongMyunDistrictCode;

    @XmlElement(name = "�����������ڵ�")
    private String lawDongJibunCode;

    @XmlElement(name = "����Ʈ")
    private String aptName;

    @XmlElement(name = "��")
    private Integer month;

    @XmlElement(name = "��")
    private Integer day;

    @XmlElement(name = "�Ϸù�ȣ")
    private String serialNumber;

    @XmlElement(name = "�������")
    private Double exclusiveArea;

    @XmlElement(name = "�߰��������")
    private String intermediaryAgentLocation;

    @XmlElement(name = "����")
    private String jibun;

    @XmlElement(name = "�����ڵ�")
    private String regionalCode;

    @XmlElement(name = "��")
    private Integer floor;

    @XmlElement(name = "���������߻���")
    private String dealCanceledDate;

    @XmlElement(name = "��������")
    private String dealCanceled;
}
