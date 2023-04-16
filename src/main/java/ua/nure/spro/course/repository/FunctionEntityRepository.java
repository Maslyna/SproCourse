package ua.nure.spro.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nure.spro.course.model.entity.FunctionEntity;

public interface FunctionEntityRepository extends JpaRepository<FunctionEntity, Long> {
}