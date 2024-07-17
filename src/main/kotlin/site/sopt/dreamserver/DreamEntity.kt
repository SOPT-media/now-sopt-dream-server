package site.sopt.dreamserver

import jakarta.persistence.*

@Entity
@Table(name = "dream")
class DreamEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val name: String,
    @Enumerated(EnumType.STRING)
    val part: Part,
    val dreamMessage: String
) {

}