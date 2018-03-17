package com.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HelloWorldController {

    // controller method to show the name html form
    @GetMapping("/nameForm")
    public String nameForm() {
        return "name-form";
    }

    // controller method to process the name form
    @GetMapping("/nameGreeting")
    public String nameGreeting() {
        return "name-greeting";
    }

    // new route that processes the name first
    @GetMapping("/processName")
    public String processName(WebRequest request, Model model) {

        // read request parameter from the HTML form
        String theName = request.getParameter("name");

        // convert to all caps
        theName = theName.toUpperCase();

        // create the message
        String message = "Yo " + theName + "!";

        // add message to the model
        model.addAttribute("message", message);

        return "name-greeting";
    }

}
