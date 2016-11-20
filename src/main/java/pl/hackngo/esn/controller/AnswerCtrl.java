package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.hackngo.esn.service.AnswerService;

/**
 * Created by rpi on 20.11.16.
 */
@Controller
@RequestMapping("/api/answer/")
public class AnswerCtrl {

    @Autowired
    private AnswerService answerService;

}
