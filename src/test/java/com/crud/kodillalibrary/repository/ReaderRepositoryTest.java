package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Reader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@SpringBootTest
@RunWith(SpringRunner.class)
 public class ReaderRepositoryTest {

    @Autowired
        ReaderRepository readerRepository;

    @Test
    public void createReader(){

       //Given
       Reader reader = new Reader(1L,"Hanna", "Lis", LocalDate.of(2018,8,24));

        //When
        Reader testReader = readerRepository.save(reader);

        //Then
        Assert.assertTrue(readerRepository.existsById(testReader.getId()));

        //CleanUp
        readerRepository.deleteById(testReader.getId());
    }
}
