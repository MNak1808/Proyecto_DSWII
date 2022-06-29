package om.cibertec.ProyectoIntegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import om.cibertec.ProyectoIntegrador.model.DetalleOrden;



@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
