package com.crud.kodillalibrary.service;

import com.crud.kodillalibrary.domain.Reader;
import com.crud.kodillalibrary.mapper.ReaderMapper;
import com.crud.kodillalibrary.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DbService {

@Autowired
    ReaderRepository readerRepository;

@Autowired
    ReaderMapper readerMapper;

    public Reader saveReader(final Reader reader) {
        reader.setAccountCreationDate(LocalDate.now());
        readerRepository.save(reader);
        return reader;
    }
}
