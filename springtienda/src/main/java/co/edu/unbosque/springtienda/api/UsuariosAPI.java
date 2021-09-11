package co.edu.unbosque.springtienda.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import co.edu.unbosque.springtienda.dao.UsuariosDAO;
import co.edu.unbosque.springtienda.model.Usuarios;

public class UsuariosAPI {
@Autowired
private UsuariosDAO usuarioDAO;
@PostMapping("/guardar") //metodo guardar publico y vacio
public void guardar(@RequestBody Usuarios usuarios) {
	usuarioDAO.save(usuarios);//aqui me guarda los usuarios
	}
	@GetMapping(" /listar")
	public List<Usuarios> listar(){
		return usuarioDAO.findAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		usuarioDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		usuarioDAO.save(usuarios);
	}
}
