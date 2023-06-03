package pro.sky.java.cours2.shoppingcart.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
private final Carts carts;

    public ShoppingCartServiceImpl(Carts carts) {
        this.carts = carts;
    }


    @Override
    public Set<Integer> add(List<Integer> id) {
        return carts.add(id);
    }

    @Override
    public Set<Integer> get() {
        return carts.get();
    }
}
