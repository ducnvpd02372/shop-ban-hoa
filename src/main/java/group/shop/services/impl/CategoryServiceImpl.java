package group.shop.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.shop.entity.Categorys;
import group.shop.repositorys.CategorysRepository;
import group.shop.services.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired 
	private CategorysRepository categorysRepository;

	@Override
	public <S extends Categorys> S save(S entity) {
		return categorysRepository.save(entity);
	}

	@Override
	public <S extends Categorys> Iterable<S> saveAll(Iterable<S> entities) {
		return categorysRepository.saveAll(entities);
	}

	@Override
	public Optional<Categorys> findById(Integer id) {
		return categorysRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return categorysRepository.existsById(id);
	}

	@Override
	public Iterable<Categorys> findAll() {
		return categorysRepository.findAll();
	}

	@Override
	public Iterable<Categorys> findAllById(Iterable<Integer> ids) {
		return categorysRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return categorysRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		categorysRepository.deleteById(id);
	}

	@Override
	public void delete(Categorys entity) {
		categorysRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Categorys> entities) {
		categorysRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		categorysRepository.deleteAll();
	}
	
}
