package mj.project.eatgo.interfaces;

import mj.project.eatgo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> list() {
        return null;
    }


}
