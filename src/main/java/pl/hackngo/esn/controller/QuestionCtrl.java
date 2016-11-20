package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.hackngo.esn.entity.Question;
import pl.hackngo.esn.service.QuestionService;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Controller
@RequestMapping("/api/question")
public class QuestionCtrl {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Collection<Question> loadAll() {
        return questionService.loadAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Question loadById(Long id) {
        return questionService.loadById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Question save(@RequestBody Question question) {
        return questionService.save(question);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody Question update(@PathVariable Long id, @RequestBody Question question) {
        return questionService.update(id, question);
    }

}
