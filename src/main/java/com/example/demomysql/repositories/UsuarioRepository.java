package com.example.demomysql.repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demomysql.models.*;

@Repository
public interface  UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
	public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad); 
	public abstract ArrayList<UsuarioModel> findByNombre(String nombre); 
	public abstract ArrayList<UsuarioModel> findByEmail(String email); 

}
