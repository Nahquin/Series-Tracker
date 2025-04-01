package com.series.tracker.domain;

import com.series.tracker.domain.enums.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor

public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @CreationTimestamp
    private LocalDateTime addedAt;

    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private boolean isFavourite;
    private boolean isFinished;


}
