package hu.clubsWebService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {
    @GetMapping("/")
    public String home() {
        return "index";
    } //templates mappában keresni fog egy "index" HTML fájlt
}
