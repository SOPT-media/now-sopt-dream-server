package site.sopt.dreamserver

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HomeController {

    @GetMapping("/home")
    fun home(): String {
        return "index"
    }

    @GetMapping("/now")
    fun now(): String {
        return "now"
    }

    @GetMapping("/cheme")
    fun cheme(): String {
        return "cheme"
    }



}