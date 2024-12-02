package web.servis;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private static int count;

    private List <Car> carList = new ArrayList<>();

    {
        carList.add(new Car("mazda", "3", "red"));
        carList.add(new Car("honda", "civic","white"));
        carList.add(new Car("lexus", "gs", "green"));
        carList.add(new Car("scoda", "rapid", "black"));
        carList.add(new Car("ford", "focus", "blue"));
    }

    public List<Car> getCarList(){
        return carList;
    }


}
