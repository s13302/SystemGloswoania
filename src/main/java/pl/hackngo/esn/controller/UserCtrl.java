package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.hackngo.esn.entity.User;
import pl.hackngo.esn.service.UserService;

/**
 * Created by rpi on 20.11.16.
 */

@Controller
@RequestMapping("/api/user")
public class UserCtrl {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/logged", method = RequestMethod.GET)
    public @ResponseBody User getLoggedUser() {
        return service.getLoggedUser();
    }

}
