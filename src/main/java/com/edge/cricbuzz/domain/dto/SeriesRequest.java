package com.edge.cricbuzz.domain.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class SeriesRequest {

        private String name;

        private String category;

        private String gender;

        private Date startDate;

        private Date endData;

}
