package paw_walk.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/")
public class mainController {
        
    @RequestMapping("main.do")
    public String main() {

        return "main/main";
    }

}
