package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) int count, ModelMap model) {
        if (count >= 5) {
            count = 5;
        }
        CarServiceImpl carService = new CarServiceImpl();
        model.addAttribute("CarList", carService.getCarCount(count));

        return "/cars";
    }
}
