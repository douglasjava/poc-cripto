package com.demo.cripto.repository;

import com.demo.cripto.entity.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Enderecos, Integer> {
}
