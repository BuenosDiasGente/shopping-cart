package pro.sky.java.cours2.shoppingcart.service;

import java.util.List;
import java.util.Set;

public interface ShoppingCartService {
    Set<Integer> add(List<Integer> id);
    Set <Integer> get();

}
