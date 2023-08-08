package com.example.start.Domain.user.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping(value ={ "","/"})
    public String home(){return "index";}

    @GetMapping(value ="/user")
    public String user(){return "user";}

    @GetMapping(value ="/manager")
    public String manager(){return "manager";}

    @GetMapping(value = "/admin")
    public String admin(){return "admin";}

    @GetMapping(value = "/join")
    public String join(){return "join";}

    @GetMapping(value = "/joinProc")
    public @ResponseBody String joinProc(){return "회원 가입 완료";}

    @GetMapping(value = "/login")
    public String login(){return "login";}
}
