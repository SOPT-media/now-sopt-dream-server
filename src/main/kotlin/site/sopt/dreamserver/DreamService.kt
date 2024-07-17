package site.sopt.dreamserver

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class DreamService(
    private val dreamJpaRepository: DreamJpaRepository
) {
    fun getDreamByNameAndPart(name: String, part: String) : DreamResponse {
        val convertedPart = convertToPart(part)
        val dream = dreamJpaRepository.findByNameAndPart(name, convertedPart) ?: throw IllegalArgumentException("해당하는 꿈이 없습니다.")
        return DreamResponse(dream.name, dream.part.value, dream.dreamMessage)
    }

    private fun convertToPart(part: String): Part {
        return when (part) {
            "기획" -> Part.PLAN
            "디자인" -> Part.DESIGN
            "안드로이드" -> Part.ANDROID
            "iOS" -> Part.IOS
            "서버" -> Part.SERVER
            "웹" -> Part.WEB
            else -> throw IllegalArgumentException("해당하는 파트가 없습니다.")
        }
    }

    data class DreamResponse(
        val name: String,
        val part: String,
        val dreamMessage: String
    )

}