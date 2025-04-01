package com.series.tracker.dto;

import com.series.tracker.domain.enums.Genre;
import lombok.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeriesCreateUpdateCommand {
    @NonNull
    @NotBlank
    private String title;
    @NonNull
    @NotNull
    private Genre genre;

    private LocalDateTime addedAt;
    private int season;
    private int episode;
    private boolean isFavourite;
    private boolean isFinished;


}
