package nz.temple.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Home
    @GetMapping({"/", "/home"})
    public String home() {
        return "index";
    }

    // Daily fortune / guidance
    @GetMapping({"/fortune", "/daily-fortune", "/guidance"})
    public String fortune() {
        return "fortune";
    }

    // Courses
    @GetMapping({"/courses", "/course"})
    public String courses() {
        return "courses";
    }

    // Ritual booking
    @GetMapping({"/booking", "/ritual-booking"})
    public String booking() {
        return "booking";
    }

    // Shop
    @GetMapping({"/shop", "/store"})
    public String shop() {
        return "shop";
    }

    // Login
    @GetMapping({"/login", "/signin"})
    public String login() {
        return "login";
    }

    // Optional: prevent a confusing whitelabel error page if someone hits /error directly.
    // This simply sends them back to the home page.
    @GetMapping("/error")
    public String error() {
        return "redirect:/";
    }
}
