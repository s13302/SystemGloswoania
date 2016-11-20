package pl.hackngo.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.hackngo.esn.entity.Results;
import pl.hackngo.esn.service.ResultsService;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Controller
@RequestMapping("/api/result")
public class ResultCtrl {

    @Autowired
    private ResultsService resultsService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Collection<Results> loadAll() {
        return resultsService.loadAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Results loadById(@PathVariable Long id) {
        return resultsService.loadById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Results save(@RequestBody Results results) {
        return resultsService.save(results);
    }

}
