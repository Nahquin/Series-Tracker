package com.series.tracker.dto;

import com.series.tracker.domain.Type;
import lombok.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeriesCreateUpdateCommand {
    @NotBlank
    private String title;
    @NotNull
    private Type type;

}
