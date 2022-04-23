package com.idat.idat_GeorgeRojas_ec02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idat_GeorgeRojas_ec02.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByUsuario(String usuario);

}
