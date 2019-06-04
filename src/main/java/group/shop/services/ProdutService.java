package group.shop.services;

import java.util.Optional;

import group.shop.entity.Products;

public interface ProdutService {

	void deleteAll();

	void deleteAll(Iterable<? extends Products> entities);

	void delete(Products entity);

	void deleteById(Integer id);

	long count();

	Iterable<Products> findAllById(Iterable<Integer> ids);

	Iterable<Products> findAll();

	boolean existsById(Integer id);

	Optional<Products> findById(Integer id);

	<S extends Products> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Products> S save(S entity);

}
