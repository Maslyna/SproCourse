package ua.nure.spro.course.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ua.nure.spro.course.model.dto.FunctionDTO;
import ua.nure.spro.course.model.entity.FunctionEntity;
import ua.nure.spro.course.repository.FunctionEntityRepository;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
@AllArgsConstructor
public class FunctionService {
    FunctionEntityRepository repository;

    public List<FunctionEntity> getFunctions() {
        return repository.findAll();
    }

    public void updateFunction(Long id, FunctionDTO functionDTO) {
        FunctionEntity entity = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "function with id = %s not found".formatted(id)));

        entity.setFunctionText(functionDTO.functionText());
        repository.save(entity);
    }
}
