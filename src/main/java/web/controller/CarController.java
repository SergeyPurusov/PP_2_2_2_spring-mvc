package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    String getCars(@RequestParam(name = "count",defaultValue = "5") int count, Model model) {
        List<Car> cars = Arrays.asList(
                new Car("BMW","Blue","sidan"),
                new Car("AUDI","white","Sidan"),
                new Car("Lexus","silver","570"),
                new Car("Toyota","Black","Coupe"),
                new Car("Range Rover","blue","SPORT")
        );
        List<Car> carList = new ArrayList<>();

        if (count > 5) count = cars.size();
        for (int i = 0; i < count; i++) {
            carList.add(cars.get(i));
        }

        model.addAttribute("cars", carList);
        return "cars";
    }


}
