package com.crud.kodillalibrary.mapper;

import com.crud.kodillalibrary.domain.Reader;
import com.crud.kodillalibrary.domain.ReaderDto;
import org.springframework.stereotype.Component;

@Component
public class ReaderMapper {

    public Reader mapToReader (final ReaderDto readerDto) {
        return new Reader (readerDto.getId(), readerDto.getName(), readerDto.getSurname(),readerDto.getAccountCreationDate());
    }
}