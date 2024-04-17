package com.barona.apimongodb.service;

import com.barona.apimongodb.model.Zapatilla;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.barona.apimongodb.repository.ZapatillaRepository;


import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ZapatillaService implements  IZapatillaService {
	private final ZapatillaRepository zapatillaRepository;

	public void save (Zapatilla zapatilla){
		zapatillaRepository.save(zapatilla);
	}

	public List<Zapatilla> findAll(){
		return zapatillaRepository.findAll();
	}

	public Optional<Zapatilla>  findById(String id){
		return zapatillaRepository.findById(id);
	}



	public Zapatilla patch( String id, Zapatilla materia ){

		Zapatilla zapatillaOld = findById( id ).get();
		return zapatillaRepository.save( patchSwapValidation( zapatillaOld, materia ) );
	}

	@Override
	public HttpHeaders optionsZapatilla() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Allow", "DELETE, GET, OPTIONS, PATCH, POST, PUT");
		httpHeaders.add("Access-Control-Allow-Methods", "DELETE, GET, OPTIONS, PATCH, POST, PUT");
		return httpHeaders;
	}

	public void deleteById(String id){
		zapatillaRepository.deleteById(id);

	}

	private Zapatilla patchSwapValidation( Zapatilla zapatillaOld, Zapatilla zapatilla ){

		if(zapatilla.getMarca()!= null ){
			zapatillaOld.setMarca(zapatilla.getMarca());
		}

		if( zapatilla.getColor() != null ){
			zapatillaOld.setColor( zapatilla.getColor());
		}

		if( zapatilla.getEstilo() != null ){
			zapatillaOld.setEstilo( zapatilla.getEstilo());
		}

		if( zapatilla.getPrecio() != null ){
			zapatillaOld.setPrecio( zapatilla.getPrecio() );
		}

		return zapatillaOld;
	}
}
