package ua.nure.spro.course.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.nure.spro.course.model.entity.FunctionEntity;
import ua.nure.spro.course.service.FunctionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class FunctionController {
    FunctionService functionService;

    @GetMapping("/functions")
    List<FunctionEntity> getFunctions() {
        return functionService.getFunctions();
    }
}
