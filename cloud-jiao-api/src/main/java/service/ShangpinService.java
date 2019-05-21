package service;

import model.ShopModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface ShangpinService {
    @GetMapping("/addCar/{id}")
    @ResponseBody
    void findall(@PathVariable("id")Integer id);

    @RequestMapping(value = "queryShop")
    @ResponseBody
    ShopModel queryShop(@RequestParam("id")Integer id);

    @RequestMapping(value = "findDrugAll")
    @ResponseBody
    Map<String, Object> findDrugAll(@RequestParam ("page")Integer page,@RequestParam("rows") Integer rows);
}