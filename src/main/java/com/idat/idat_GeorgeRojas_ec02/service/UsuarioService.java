package com.idat.idat_GeorgeRojas_ec02.service;

import java.util.List;

import com.idat.idat_GeorgeRojas_ec02.dto.UsuarioRequestDTO;
import com.idat.idat_GeorgeRojas_ec02.dto.UsuarioResponseDTO;

public interface UsuarioService {
	
	public void guardarUsuario(UsuarioRequestDTO p);
	public void eliminarUsuario(Integer id);
	public void editarUsuario(UsuarioRequestDTO p);
	public List<UsuarioResponseDTO> listarUsuario();
	public UsuarioResponseDTO usuarioById(Integer id);

}
