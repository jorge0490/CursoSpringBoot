package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();//findAll retornar todos
	
	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);//findOne retorna solo un cliente lo busca por su id
	
	public void delete(Long id);

}
