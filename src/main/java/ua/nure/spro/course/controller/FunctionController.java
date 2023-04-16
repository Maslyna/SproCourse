package ua.nure.spro.course.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.nure.spro.course.model.dto.FunctionDTO;
import ua.nure.spro.course.model.entity.FunctionEntity;
import ua.nure.spro.course.service.FunctionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class FunctionController {
    FunctionService functionService;

    @GetMapping("/functions")
    List<FunctionEntity> getFunctions() {
        return functionService.getFunctions();
    }

    @PatchMapping("/functions/{function-id}")
    void updateFunction(@RequestBody FunctionDTO functionDTO,
                        @PathVariable("function-id") Long id) {
        functionService.updateFunction(id, functionDTO);
    }
}
