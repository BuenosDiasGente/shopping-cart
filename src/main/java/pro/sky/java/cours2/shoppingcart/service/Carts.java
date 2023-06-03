package pro.sky.java.cours2.shoppingcart.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
@SessionScope
public class Carts {
    private final Set<Integer> product=new HashSet<>();
    public Set<Integer> add(List<Integer> id) {
        product.addAll(id);
        return product;
    }

    public Set<Integer> get() {
        return new HashSet<>(product);
    }



}
