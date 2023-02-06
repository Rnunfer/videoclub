package org.iesvdm.service;

import org.iesvdm.domain.Categoria;
import org.iesvdm.dto.CategoriaDTO;
import org.iesvdm.repository.CategoriaRepository;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {
	
	CategoriaRepository categoriaRepository;
	
	public CategoriaService(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}

	public Categoria one(Long id) {
		return categoriaRepository.find(id); 
	}
	
	public CategoriaDTO oneDTO(Long id) {
		CategoriaDTO cat = categoriaRepository.findDTO(id);
		cat.setNumeroPeliculasAlmacen(categoriaRepository.listarNumeroPeliculasAlmacen(cat.getId()));
		return cat;
	}

}
