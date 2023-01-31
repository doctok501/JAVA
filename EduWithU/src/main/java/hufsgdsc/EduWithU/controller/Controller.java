package hufsgdsc.EduWithU.controller;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping("/google")
    public void getGooglerAurhUrl(HttpServletResponse response) throws Exception {
        //구글 URL 가져오기
        //GCP에 OAUth Id 인증 만들기 (추후에)
    }
}
