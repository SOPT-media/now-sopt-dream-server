package site.sopt.dreamserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DreamserverApplication

fun main(args: Array<String>) {
    runApplication<DreamserverApplication>(*args)
}
