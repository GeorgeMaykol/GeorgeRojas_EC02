package com.idat.idat_GeorgeRojas_ec02.service;

import java.util.List;

import com.idat.idat_GeorgeRojas_ec02.dto.ClienteRequestDTO;
import com.idat.idat_GeorgeRojas_ec02.dto.ClienteResponseDTO;


public interface ClienteService {
	
	public void guardarCliente(ClienteRequestDTO c);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO c);
	public List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);

}
