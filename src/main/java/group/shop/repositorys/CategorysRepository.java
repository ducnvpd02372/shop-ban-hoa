package group.shop.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import group.shop.entity.Categorys;
@Repository
public interface CategorysRepository extends CrudRepository<Categorys, Integer> {

}
