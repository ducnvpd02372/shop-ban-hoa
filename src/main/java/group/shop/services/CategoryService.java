package group.shop.services;

import java.util.Optional;

import group.shop.entity.Categorys;

public interface CategoryService {

	void deleteAll();

	void deleteAll(Iterable<? extends Categorys> entities);

	void delete(Categorys entity);

	void deleteById(Integer id);

	long count();

	Iterable<Categorys> findAllById(Iterable<Integer> ids);

	Iterable<Categorys> findAll();

	boolean existsById(Integer id);

	Optional<Categorys> findById(Integer id);

	<S extends Categorys> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Categorys> S save(S entity);

}
