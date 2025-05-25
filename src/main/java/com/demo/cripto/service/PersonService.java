package com.demo.cripto.service;

import com.demo.cripto.entity.Person;
import com.demo.cripto.repository.PersonRepository;
import com.demo.cripto.utils.DocumentGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public void insertMassive(int quantity) {

        log.info("Inserindo {} registros", quantity);

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            list.add(Person.builder()
                    .fullName("Pessoa Teste " + i)
                    .email("teste" + i + "@email.com")
                    .document(DocumentGenerator.generate())
                    .birthDate(LocalDate.of(1990, 1, 1))
                    .phone("1199999999" + i)
                    .address("Rua X Y Z " + i + ", 12345-678")
                    .build());
        }

        repository.saveAll(list);

    }

    public List<Person> selectAll() {
        log.info("Selecting all");

        return repository.findAll();
    }

    public List<Person> searchByDocument(String document) {
        log.info("Searching by document {}", document);

        return repository.findByDocument(document);
    }

}
