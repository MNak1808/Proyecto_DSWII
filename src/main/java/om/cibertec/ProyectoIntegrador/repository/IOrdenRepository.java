package om.cibertec.ProyectoIntegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import om.cibertec.ProyectoIntegrador.model.Orden;
import om.cibertec.ProyectoIntegrador.model.Usuario;



@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);
}
