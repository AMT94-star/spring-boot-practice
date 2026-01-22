package se.amt.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.amt.springbootpractice.model.user;

import java.util.ArrayList;
import java.util.List;

@Controller
public class userController {
    @GetMapping("/users")
    public String users(Model model) {
        List<user> users = new ArrayList<>();
        users.add(new user("OtterFan01",
                "water",
                "otterFan@gmail.com",
                "Asli",
                "Taskin"));
        users.add(new user("PenguinFan91",
                "1234",
                "penguin91@gmail.com",
                "Simon",
                "Syrén"));
        users.add(new user("Polarbear55",
                "Ice",
                "polarbears_arecool@gmail.com",
                "Amanda",
                "Korall"));

        model.addAttribute("users", users);

        return "users";
    }
}
