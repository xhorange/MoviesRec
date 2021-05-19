package njupt.orange.movies_rec.Controller;

import njupt.orange.movies_rec.Entity.UserEntity;
import njupt.orange.movies_rec.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/UserLogin", method = RequestMethod.POST)
    public String login(UserEntity user,Model model) {
        if (user == null) {
            return "error";
        }
        if (!user.getUserName().isEmpty() && !Objects.equals(user.getUserName(), "")) {
            if (!user.getPasswd().isEmpty() && !Objects.equals(user.getPasswd(), "")) {
                UserEntity loginUser = service.findByName(user.getUserName());
                if (loginUser == null) {
                    return "error";
                } else {
                    if (Objects.equals(loginUser.getPasswd(), user.getPasswd())) {
                        model.addAttribute("name",loginUser.getUserName());
                        return "index";
                    }
                }
            }
        }
        return "error";
    }
}
