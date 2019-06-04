package group.shop.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Orders;

@Repository
public interface UserRepository extends CrudRepository<Orders, Integer>{

}
