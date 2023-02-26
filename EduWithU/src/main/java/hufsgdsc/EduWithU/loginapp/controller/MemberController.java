package hufsgdsc.EduWithU.loginapp.controller;

import hufsgdsc.EduWithU.App.MemberForm;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

    @PostMapping("/login")
    public String create(@Validated MemberForm form, BindingResult result) {

        return null;
    }


}
