package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.hackngo.esn.entity.Session;
import pl.hackngo.esn.repository.SessionRepository;
import pl.hackngo.esn.service.SessionService;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Controller
@RequestMapping("/api/session")
public class SessionCtrl {

    @Autowired
    private SessionService sessionService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Collection<Session> loadAll() {
        return sessionService.loadAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Session loadById(@PathVariable Long id) {
        return sessionService.loadById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Session save(@RequestBody Session session) {
        return sessionService.save(session);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody Session update(@PathVariable Long id, @RequestBody Session session) {
        return sessionService.update(id, session);
    }

}
