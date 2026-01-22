package se.amt.springbootpractice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.amt.springbootpractice.model.product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class productController {

    @GetMapping("/products")
    public String products(Model model) {
        List<product> products = new ArrayList<>();
        products.add(new product(1010L,
                "Led Light 1",
                "A beautiful small table led light that lights in the dark",
                300,
                50));
        products.add(new product(1011L,
                "Disco ball",
                "A prurple LED discoball",
                400,
                40));
        products.add(new product(1012l,
                "Flying dragon",
                "A flying LED dragon attach to wall",
                500,
                30));

        model.addAttribute("products", products);

        return "products";
    }
}