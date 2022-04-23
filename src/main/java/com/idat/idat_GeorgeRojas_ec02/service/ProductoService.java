package com.idat.idat_GeorgeRojas_ec02.service;

import java.util.List;

import com.idat.idat_GeorgeRojas_ec02.dto.ProductoRequestDTO;
import com.idat.idat_GeorgeRojas_ec02.dto.ProductoResponseDTO;


public interface ProductoService {
	
	public void guardarProducto(ProductoRequestDTO p);
	public void eliminarProducto(Integer id);
	public void editarProducto(ProductoRequestDTO p);
	public List<ProductoResponseDTO> listarProducto();
	public ProductoResponseDTO productById(Integer id);

}
