package site.sopt.dreamserver

import org.springframework.data.jpa.repository.JpaRepository

interface DreamJpaRepository : JpaRepository<DreamEntity, Int> {
    fun findByNameAndPart(name: String, part: Part): DreamEntity?
}