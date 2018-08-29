package com.crud.kodillalibrary.mapper;

import com.crud.kodillalibrary.domain.Reader;
import com.crud.kodillalibrary.domain.ReaderDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReaderMapper {

    public Reader mapToReader (final ReaderDto readerDto) {
        return new Reader (readerDto.getId(), readerDto.getName(), readerDto.getSurname(), readerDto.getAccountCreationDate());
    }

    public ReaderDto mapToReaderDto (final Reader reader) {
        return new ReaderDto (reader.getId(), reader.getName(), reader.getSurname(), reader.getAccountCreationDate());
    }

    public List<ReaderDto> mapToReaderDtoList (final List<Reader> readers) {
        return readers.stream()
                .map(r->new ReaderDto(r.getId(), r.getName(), r.getSurname(), r.getAccountCreationDate()))
                .collect(Collectors.toList());
    }
}
