package com.demo.cripto.entity;


import com.demo.cripto.utils.CryptoConverter;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = CryptoConverter.class)
    private String fullName;

    @Convert(converter = CryptoConverter.class)
    private String email;

    @Convert(converter = CryptoConverter.class)
    private String document;

    private LocalDate birthDate;

    @Convert(converter = CryptoConverter.class)
    private String phone;

    @Convert(converter = CryptoConverter.class)
    private String address;

}

