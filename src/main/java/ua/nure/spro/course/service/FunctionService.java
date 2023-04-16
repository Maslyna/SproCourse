package ua.nure.spro.course.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.nure.spro.course.model.entity.FunctionEntity;
import ua.nure.spro.course.repository.FunctionEntityRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FunctionService {
    FunctionEntityRepository repository;

    public List<FunctionEntity> getFunctions() {
        return repository.findAll();
    }
}
