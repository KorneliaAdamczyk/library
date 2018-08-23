package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public class ReaderDto {
        private Long id;
        private String name;
        private String surname;
        private LocalDate accountCreationDate;
    }

