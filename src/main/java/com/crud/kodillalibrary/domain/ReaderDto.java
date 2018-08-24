package com.crud.kodillalibrary.domain;

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
        private LocalDate accountCreationDate;
    }

