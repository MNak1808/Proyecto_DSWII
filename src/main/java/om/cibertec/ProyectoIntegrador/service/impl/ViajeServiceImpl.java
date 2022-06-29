package om.cibertec.ProyectoIntegrador.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.cibertec.ProyectoIntegrador.model.Viaje;
import om.cibertec.ProyectoIntegrador.repository.ViajeRepository;
import om.cibertec.ProyectoIntegrador.service.ViajeService;

@Service
public class ViajeServiceImpl implements ViajeService{
	
	@Autowired
	private ViajeRepository viajeRepository;

	@Override
	public Viaje save(Viaje producto) {
		return viajeRepository.save(producto);
	}

	@Override
	public Optional<Viaje> get(Integer id) {
		return viajeRepository.findById(id);
	}

	@Override
	public void update(Viaje producto) {
		viajeRepository.save(producto);		
	}

	@Override
	public void delete(Integer id) {
		viajeRepository.deleteById(id);		
	}

	@Override
	public List<Viaje> findAll() {
		return viajeRepository.findAll();
	}

}
