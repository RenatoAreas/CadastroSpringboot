package br.com.cotiinformatica.interfaces;

import org.springframework.data.repository.CrudRepository;

import br.com.cotiinformatica.entities.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Integer>{

}
