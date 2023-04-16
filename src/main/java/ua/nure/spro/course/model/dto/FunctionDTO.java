package ua.nure.spro.course.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record FunctionDTO(
        Long id,
        @JsonProperty("function_text")
        String functionText
) {
}
