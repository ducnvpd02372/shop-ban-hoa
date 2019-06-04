package group.shop.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.shop.entity.Orders;
import group.shop.repositorys.UserRepository;
import group.shop.services.UserService;

@Service
public class UserServiceImpl implements UserService{
@Autowired 
private UserRepository userRepository;

@Override
public <S extends Orders> S save(S entity) {
	return userRepository.save(entity);
}

@Override
public <S extends Orders> Iterable<S> saveAll(Iterable<S> entities) {
	return userRepository.saveAll(entities);
}

@Override
public Optional<Orders> findById(Integer id) {
	return userRepository.findById(id);
}

@Override
public boolean existsById(Integer id) {
	return userRepository.existsById(id);
}

@Override
public Iterable<Orders> findAll() {
	return userRepository.findAll();
}

@Override
public Iterable<Orders> findAllById(Iterable<Integer> ids) {
	return userRepository.findAllById(ids);
}

@Override
public long count() {
	return userRepository.count();
}

@Override
public void deleteById(Integer id) {
	userRepository.deleteById(id);
}

@Override
public void delete(Orders entity) {
	userRepository.delete(entity);
}

@Override
public void deleteAll(Iterable<? extends Orders> entities) {
	userRepository.deleteAll(entities);
}

@Override
public void deleteAll() {
	userRepository.deleteAll();
}

}
