package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.hackngo.esn.entity.Session;
import pl.hackngo.esn.repository.SessionRepository;

/**
 * Created by rpi on 20.11.16.
 */
@Controller
@RequestMapping("/api/session")
public class SessionCtrl {

    @Autowired
    private SessionRepository sessionRepository;

    @RequestMapping(value = "/{qr}", method = RequestMethod.GET)
    public @ResponseBody Session getSession(@PathVariable String qr) {
        return sessionRepository.findByQr(qr);
    }

}
