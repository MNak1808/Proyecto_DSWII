package om.cibertec.ProyectoIntegrador.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.cibertec.ProyectoIntegrador.model.DetalleOrden;
import om.cibertec.ProyectoIntegrador.repository.IDetalleOrdenRepository;
import om.cibertec.ProyectoIntegrador.service.IDetalleOrdenService;



@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}
