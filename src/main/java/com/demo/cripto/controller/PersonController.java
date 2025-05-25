package com.demo.cripto.controller;

import com.demo.cripto.entity.Person;
import com.demo.cripto.entity.Registros;
import com.demo.cripto.entity.RegsVeiculos;
import com.demo.cripto.service.PersonService;
import com.demo.cripto.service.RegistrosServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;
    private final RegistrosServices registrosServices;

    @PostMapping("/mass-insert-vehicle/{qtdRegistro}/{qtdeVehicle}")
    public ResponseEntity<String> insertMassVehicle(@PathVariable int qtdRegistro, @PathVariable int qtdeVehicle) {

        long start = System.currentTimeMillis();
        registrosServices.insertMassive(qtdRegistro, qtdeVehicle);
        long end = System.currentTimeMillis();
        return ResponseEntity.ok("Inseridos " + qtdRegistro + " registros em " + (end - start) + "ms");

    }

    @GetMapping("/all-registros")
    public ResponseEntity<List<Registros>> getAllRegistros() {

        long start = System.currentTimeMillis();
        List<Registros> result = registrosServices.listAllRegistros();
        long end = System.currentTimeMillis();
        System.out.println("Select all levou: " + (end - start) + "ms");
        return ResponseEntity.ok(result);

    }

    @GetMapping("/all-vehicle")
    public ResponseEntity<List<RegsVeiculos>> getAllVehicle() {

        long start = System.currentTimeMillis();
        List<RegsVeiculos> result = registrosServices.listAllRegsVeiculosBy();
        long end = System.currentTimeMillis();
        System.out.println("Select all levou: " + (end - start) + "ms");
        return ResponseEntity.ok(result);

    }

    @PostMapping("/mass-insert/{qtd}")
    public ResponseEntity<String> insertMass(@PathVariable int qtd) {

        long start = System.currentTimeMillis();
        service.insertMassive(qtd);
        long end = System.currentTimeMillis();
        return ResponseEntity.ok("Inseridos " + qtd + " registros em " + (end - start) + "ms");

    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAll() {

        long start = System.currentTimeMillis();
        List<Person> result = service.selectAll();
        long end = System.currentTimeMillis();
        System.out.println("Select all levou: " + (end - start) + "ms");
        return ResponseEntity.ok(result);

    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<List<Person>> findByCpf(@PathVariable String cpf) {

        long start = System.currentTimeMillis();
        List<Person> result = service.searchByDocument(cpf);
        long end = System.currentTimeMillis();
        return ResponseEntity.ok()
                .header("X-Duration-ms", String.valueOf(end - start))
                .body(result);

    }

}

