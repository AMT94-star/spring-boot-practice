package se.amt.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.amt.springbootpractice.model.person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class personController {

    @GetMapping("/persons")
    public String persons(Model model) {
        List<person> persons = new ArrayList<>();
        persons.add(new person("Aslihan",
                "1234",
                31,
                "aslihan.taskin94@gmail.com"));
        persons.add(new person("Per",
                "95372",
                57,
                "per.gessle@gmail.com"));
        persons.add(new person("Amanda",
                "4321",
                25,
                "amanda.korall@gmail.com"));

        model.addAttribute("persons", persons);

        return "persons";
    }
}
