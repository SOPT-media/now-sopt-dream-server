package site.sopt.dreamserver

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class DreamController(
    private val dreamService: DreamService
) {

    @PostMapping("/submit")
    fun getDream(
        @RequestParam(name = "userName") name: String,
        @RequestParam(name = "part") part: String,
        model: Model) : String {
        val response = dreamService.getDreamByNameAndPart(name, part)
        model.addAttribute("name", response.name)
        model.addAttribute("part", response.part)
        model.addAttribute("dreamMessage", response.dreamMessage)
        return "result"
    }
}