package ua.nure.spro.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.nure.spro.course.model.entity.UserEntity;

import java.util.Optional;

@Component
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByLogin(String login);

}