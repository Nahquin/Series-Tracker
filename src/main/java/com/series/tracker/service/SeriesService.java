package com.series.tracker.service;

import com.series.tracker.domain.Series;
import com.series.tracker.dto.SeriesCreateUpdateCommand;
import com.series.tracker.dto.SeriesInfo;
import com.series.tracker.repository.SeriesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SeriesService {
    private final ModelMapper modelMapper;
    private final SeriesRepository seriesRepository;

    public SeriesService(ModelMapper modelMapper, SeriesRepository seriesRepository) {
        this.modelMapper = modelMapper;
        this.seriesRepository = seriesRepository;
    }

    public SeriesInfo save(SeriesCreateUpdateCommand command) {
        Series series = modelMapper.map(command, Series.class);
        System.out.println(series.toString());
        System.out.println();
        seriesRepository.save(series);
        return modelMapper.map(series, SeriesInfo.class);
    }
}
