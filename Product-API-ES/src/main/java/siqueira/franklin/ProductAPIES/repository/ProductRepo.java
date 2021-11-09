package siqueira.franklin.ProductAPIES.repository;

import org.springframework.data.repository.CrudRepository;
import siqueira.franklin.ProductAPIES.model.Product;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
