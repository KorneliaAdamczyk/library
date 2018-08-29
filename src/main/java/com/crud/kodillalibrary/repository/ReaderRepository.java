package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Reader;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface ReaderRepository extends CrudRepository <Reader, Long> {

    @Override
    Reader save(Reader reader);

    @Override
    Optional<Reader> findById(Long id);

    @Override
    List<Reader> findAll();

}
