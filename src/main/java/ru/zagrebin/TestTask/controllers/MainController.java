package ru.zagrebin.TestTask.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zagrebin.TestTask.services.MainService;

@RestController
@RequestMapping("/main")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/{str}")
    public String counter(@PathVariable("str") String str) {
        return mainService.counterSymbols(str);
    }
}
