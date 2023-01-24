package jpabook.jpashop.web;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Documented;


@Getter @Setter
public class MemberForm {

    //Not empty annotation 찾아보기
    @Nonnull
    private String name;
    private String city;
    private String street;
    private String zipcode;
}
