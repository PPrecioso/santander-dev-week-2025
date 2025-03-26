package me.dio.santander_dev_week_2025.repository;

import me.dio.santander_dev_week_2025.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
