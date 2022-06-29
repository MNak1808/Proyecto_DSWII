package om.cibertec.ProyectoIntegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import om.cibertec.ProyectoIntegrador.model.Viaje;



@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Integer> {

}
