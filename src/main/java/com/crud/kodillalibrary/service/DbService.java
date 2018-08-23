package com.crud.kodillalibrary.service;

import com.crud.kodillalibrary.domain.Reader;
import com.crud.kodillalibrary.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class DbService {

@Autowired
    ReaderRepository readerRepository;

    public Reader saveReader (Reader reader) {
        return readerRepository.save(reader);
    }

}
