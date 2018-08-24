package com.crud.kodillalibrary.domain;

import com.crud.kodillalibrary.converter.LocalDateDeserializer;
import com.crud.kodillalibrary.converter.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

    public class ReaderDto {
        private Long id;
        private String name;
        private String surname;

        @JsonDeserialize(using= LocalDateDeserializer.class)
        @JsonSerialize(using= LocalDateSerializer.class)
        private LocalDate accountCreationDate;
    }

