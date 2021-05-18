package njupt.orange.movies_rec.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
    @RequestMapping("/hello")
    public String index() {
        return "index";
    }
}