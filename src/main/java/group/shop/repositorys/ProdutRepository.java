package group.shop.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Products;

@Repository
public interface ProdutRepository extends CrudRepository<Products, Integer>{

}
