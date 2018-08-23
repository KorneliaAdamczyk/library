package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Reader;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ReaderRepository extends CrudRepository <Reader, Long>{

    @Override
    Reader save (Reader reader);
}
