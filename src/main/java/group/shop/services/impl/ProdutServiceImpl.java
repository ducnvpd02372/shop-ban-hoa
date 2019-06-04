package group.shop.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.shop.entity.Products;
import group.shop.repositorys.ProdutRepository;
import group.shop.services.ProdutService;

@Service
public class ProdutServiceImpl implements ProdutService{
	@Autowired
	private ProdutRepository produtRepository;

	@Override
	public <S extends Products> S save(S entity) {
		return produtRepository.save(entity);
	}

	@Override
	public <S extends Products> Iterable<S> saveAll(Iterable<S> entities) {
		return produtRepository.saveAll(entities);
	}

	@Override
	public Optional<Products> findById(Integer id) {
		return produtRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return produtRepository.existsById(id);
	}

	@Override
	public Iterable<Products> findAll() {
		return produtRepository.findAll();
	}

	@Override
	public Iterable<Products> findAllById(Iterable<Integer> ids) {
		return produtRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return produtRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		produtRepository.deleteById(id);
	}

	@Override
	public void delete(Products entity) {
		produtRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Products> entities) {
		produtRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		produtRepository.deleteAll();
	}
	
}
