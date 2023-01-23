package jpabook.jpashop.web;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class MemberForm {

    //Not empty annotation 찾아보기
    private String name;
    private String city;
    private String street;
    private String zipcode;
}
