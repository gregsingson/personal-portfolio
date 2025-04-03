package com.portfolio.controllers;

import com.portfolio.models.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute Contact contact, Model model) {
        // Here you would typically save the contact message to a database or send an email
        model.addAttribute("message", "Thank you for your message, " + contact.getName() + "!");
        return "contact";
    }
}