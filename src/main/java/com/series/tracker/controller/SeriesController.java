package com.series.tracker.controller;

import com.series.tracker.dto.SeriesCreateUpdateCommand;
import com.series.tracker.dto.SeriesInfo;
import com.series.tracker.service.SeriesService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@RequestMapping("tracker/series")
@RestController
public class SeriesController{

    private final SeriesService seriesService;

    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @PostMapping("/save")
    public ResponseEntity<SeriesInfo> save( @Valid @RequestBody SeriesCreateUpdateCommand command) {
        //log.info("Http request, POST /api/, body: " + command.toString());
        System.out.println(command.toString());
        SeriesInfo seriesInfo = seriesService.save(command);
        return new ResponseEntity<>(seriesInfo, CREATED);
    }


}
