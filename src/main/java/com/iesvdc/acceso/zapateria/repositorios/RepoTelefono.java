package com.iesvdc.acceso.zapateria.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iesvdc.acceso.zapateria.zapapp.modelos.Telefono;

@Repository
public interface RepoTelefono extends JpaRepository<Telefono, Long> {

}
