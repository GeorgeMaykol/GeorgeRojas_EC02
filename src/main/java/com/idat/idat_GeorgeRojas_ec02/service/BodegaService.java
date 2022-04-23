package com.idat.idat_GeorgeRojas_ec02.service;

import java.util.List;

import com.idat.idat_GeorgeRojas_ec02.dto.BodegaRequestDTO;
import com.idat.idat_GeorgeRojas_ec02.dto.BodegaResponseDTO;

public interface BodegaService {
	
	public void guardarBodega(BodegaRequestDTO c);
	public void eliminarBodega(Integer id);
	public void editarBodega(BodegaRequestDTO c);
	public List<BodegaResponseDTO> listarBodega();
	public BodegaResponseDTO bodegaById(Integer id);

}
