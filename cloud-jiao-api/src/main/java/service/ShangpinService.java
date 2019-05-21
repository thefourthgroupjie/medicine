package service;

import model.ShopModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ShangpinService {
    @GetMapping("/addCar/{id}")
    @ResponseBody
    void findall(@PathVariable("id")Integer id);

    @RequestMapping(value = "queryShop")
    @ResponseBody
    ShopModel queryShop(@RequestParam("id")Integer id);
}
