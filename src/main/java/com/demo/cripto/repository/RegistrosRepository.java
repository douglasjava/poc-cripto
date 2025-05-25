package com.demo.cripto.repository;

import com.demo.cripto.entity.Registros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrosRepository extends JpaRepository<Registros, Long> {
}
