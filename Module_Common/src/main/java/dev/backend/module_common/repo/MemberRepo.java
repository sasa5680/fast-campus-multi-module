package dev.backend.module_common.repo;


import dev.backend.module_common.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MemberRepo extends JpaRepository<Member, Long> {
}
