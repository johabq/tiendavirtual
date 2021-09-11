package co.edu.unbosque.springtienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.springtienda.model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {

}
