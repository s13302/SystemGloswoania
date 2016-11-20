package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.hackngo.esn.entity.Answer;
import pl.hackngo.esn.service.AnswerService;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Controller
@RequestMapping("/api/answer/")
public class AnswerCtrl {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Collection<Answer> loadAll() {
        return answerService.loadAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Answer loadById(@PathVariable Long id) {
        return answerService.loadById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Answer save(@RequestBody Answer answer) {
        return answerService.save(answer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody Answer update(@PathVariable Long id, @RequestBody Answer answer) {
        return answerService.update(id, answer);
    }

}
