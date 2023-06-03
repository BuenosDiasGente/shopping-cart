package pro.sky.java.cours2.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.cours2.shoppingcart.service.ShoppingCartService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }


    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> id){
        return shoppingCartService.add(id);
    }
    @GetMapping("/get")
    public Set <Integer> get(){
        return shoppingCartService.get();
    }
}
