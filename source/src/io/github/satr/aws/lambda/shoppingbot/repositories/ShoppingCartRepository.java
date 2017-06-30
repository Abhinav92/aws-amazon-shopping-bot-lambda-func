package io.github.satr.aws.lambda.shoppingbot.repositories;

import com.sun.media.sound.InvalidDataException;
import io.github.satr.aws.lambda.shoppingbot.entity.ShoppingCart;
import io.github.satr.aws.lambda.shoppingbot.repositories.exceptions.UnexpectedMultipleDataItemsException;

import java.util.List;

public interface ShoppingCartRepository extends Repository {
    List<ShoppingCart> getAllShoppingCarts();
    ShoppingCart getShoppingCartByUserId(String userId);
    void save(ShoppingCart cart);
    void delete(ShoppingCart cart);
}
