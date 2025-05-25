package com.demo.cripto.repository;

import com.demo.cripto.entity.RegsVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegsVeiculosRepository extends JpaRepository<RegsVeiculos, Long> {
}
