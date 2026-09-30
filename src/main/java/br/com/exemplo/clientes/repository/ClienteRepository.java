package br.com.exemplo.clientes.repository;

import br.com.exemplo.clientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
