package com.idat.idat_GeorgeRojas_ec02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idat_GeorgeRojas_ec02.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
