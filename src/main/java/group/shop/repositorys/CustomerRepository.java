package group.shop.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Customers;

@Repository
public interface CustomerRepository extends CrudRepository< Customers, Integer>{

}
