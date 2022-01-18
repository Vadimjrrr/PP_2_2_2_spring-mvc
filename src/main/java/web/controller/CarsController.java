
package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCountCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("carList", carService.getCountCars(carService.carList, count));
        return "cars";
    }
}