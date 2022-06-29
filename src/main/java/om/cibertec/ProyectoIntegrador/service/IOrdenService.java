package om.cibertec.ProyectoIntegrador.service;

import java.util.List;
import java.util.Optional;

import om.cibertec.ProyectoIntegrador.model.Orden;
import om.cibertec.ProyectoIntegrador.model.Usuario;



public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
