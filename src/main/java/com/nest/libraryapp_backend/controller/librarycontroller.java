package com.nest.libraryapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class librarycontroller {
    @PostMapping("/")
    public String homepage()
    {
        return "Welcome home page";
    }
    @PostMapping("/bookEntry")
    public String bookEntry()
    {
        return "Welcome book entry page";
    }
    @PostMapping("/bookEdit")
    public String bookEdit()
    {
        return "Welcome book edit page";
    }
    @PostMapping("/bookSearch")
    public String bookSearch()
    {
        return "Welcome book search page";
    }
    @PostMapping("/bookDelete")
    public String bookDelete()
    {
        return "Welcome book delete page";
    }
    @PostMapping("/bookIssue")
    public String bookIssue()
    {
        return "Welcome book issue page";
    }
    @PostMapping("/viewBooks")
    public String viewBooks()
    {
        return "Welcome view all books page";
    }
}
