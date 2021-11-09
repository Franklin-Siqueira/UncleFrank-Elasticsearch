package siqueira.franklin.ShoppingCart.repository;

import org.springframework.data.repository.CrudRepository;
import siqueira.franklin.ShoppingCart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
        Cart findByCustomerId(Integer customerId);
}