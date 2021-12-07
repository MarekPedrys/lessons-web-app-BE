package pl.marekpedrys.lessons.infrastructure.user.userdb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
