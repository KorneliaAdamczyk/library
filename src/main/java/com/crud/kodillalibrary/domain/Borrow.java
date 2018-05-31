package com.crud.kodillalibrary.domain;

import java.time.LocalDate;

public class Borrow {
    private Long bookCopyId;
    private Long readerId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
}
