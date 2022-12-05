package com.nest.libraryapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class librarycontroller {
    @GetMapping("/")
    public String homepage()
    {
        return "Welcome home page";
    }
    @GetMapping("/bookEntry")
    public String bookEntry()
    {
        return "Welcome book entry page";
    }
    @GetMapping("/bookEdit")
    public String bookEdit()
    {
        return "Welcome book edit page";
    }
    @GetMapping("/bookSearch")
    public String bookSearch()
    {
        return "Welcome book search page";
    }
    @GetMapping("/bookDelete")
    public String bookDelete()
    {
        return "Welcome book delete page";
    }
    @GetMapping("/bookIssue")
    public String bookIssue()
    {
        return "Welcome book issue page";
    }
    @GetMapping("/viewBooks")
    public String viewBooks()
    {
        return "Welcome view all books page";
    }
}
