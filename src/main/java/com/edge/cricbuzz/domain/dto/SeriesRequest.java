package com.edge.cricbuzz.domain.dto;

import com.edge.cricbuzz.domain.enums.Gender;
import com.edge.cricbuzz.domain.enums.SeriesCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class SeriesRequest {

        private String name;

        private SeriesCategory category;

        private Gender gender;

        private Date startDate;

        private Date endDate;

}
