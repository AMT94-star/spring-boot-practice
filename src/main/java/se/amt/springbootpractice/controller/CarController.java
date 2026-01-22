package se.amt.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.amt.springbootpractice.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private List<Car> carList = new ArrayList<>();

    @GetMapping
    public String showCars(Model model) {
        model.addAttribute("cars", carList);
        return "car-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("car", new Car());
        return "car-form";
    }
    @PostMapping
    public String createCar(@ModelAttribute Car car) {
        carList.add(car);
        return "redirect:/cars";
    }
}
