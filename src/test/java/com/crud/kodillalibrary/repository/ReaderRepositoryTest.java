package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Reader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
 public class ReaderRepositoryTest {

    @Autowired
        ReaderRepository readerRepository;

    @Test
    public void shouldCreateReader(){

       //Given
        Reader reader = new Reader(1L,"Hanna", "Lis",LocalDate.now());

        //When
        Reader testReader = readerRepository.save(reader);

        //Then
        Assert.assertTrue(readerRepository.existsById(testReader.getId()));

        //CleanUp
       readerRepository.deleteById(testReader.getId());
    }

    @Test
    public void shouldFindById(){

        //Given
        Reader reader1 = new Reader(1L,"Hanna", "Lis",LocalDate.now());
        Reader reader2 = new Reader(2L,"Helena", "Nowak",LocalDate.now());
        Reader reader3 = new Reader(3L,"Janusz", "Kowalski",LocalDate.now());
        readerRepository.save(reader1);
        readerRepository.save(reader2);
        readerRepository.save(reader3);

        List<Reader> testList = readerRepository.findAll();

        //When
        Optional<Reader> testReader = readerRepository.findById(testList.get(1).getId());

        //Then
        Assert.assertEquals("Helena", testReader.get().getName());

        //CleanUp
        readerRepository.deleteAll();
    }

    @Test
    public void shouldGetAllReaders(){

        //Given
        Reader reader1 = new Reader(1L,"Hanna", "Lis",LocalDate.now());
        Reader reader2 = new Reader(2L,"Bożena", "Nowak",LocalDate.now());
        Reader reader3 = new Reader(3L,"Janusz", "Kowalski",LocalDate.now());
        readerRepository.save(reader1);
        readerRepository.save(reader2);
        readerRepository.save(reader3);

        //When
        List<Reader> testList = readerRepository.findAll();

        //Then
        Assert.assertEquals(3, testList.size());

        //CleanUp
        readerRepository.deleteAll();
    }

    @Test
    public void shouldDeleteReader(){
        //Given
        Reader reader1 = new Reader(1L,"Hanna", "Lis",LocalDate.now());
        Reader reader2 = new Reader(2L,"Helena", "Nowak",LocalDate.now());
        Reader reader3 = new Reader(3L,"Janusz", "Kowalski",LocalDate.now());
        readerRepository.save(reader1);
        readerRepository.save(reader2);
        readerRepository.save(reader3);

        List<Reader> testList1 = readerRepository.findAll();

        //When
        readerRepository.deleteById(testList1.get(0).getId());
        List<Reader>testList2 = readerRepository.findAll();

        //Then
        Assert.assertEquals(2,testList2.size());

        //CleanUp
        readerRepository.deleteAll();

    }
}
