package com.series.tracker.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private Type type;

    private int season;
    private int episode;
    private boolean favourite;

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", season=" + season +
                ", episode=" + episode +
                ", favourite=" + favourite +
                '}';
    }
}
