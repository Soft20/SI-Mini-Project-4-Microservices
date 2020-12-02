package dk.dd.carsearch;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@FeignClient("car-rating")
@RibbonClient(name="car-rating", configuration = RibbonConfig.class)
public interface RatingSearchClient {

    @GetMapping("/ratings/username/{username}")
    String readReviewsByUsername(@PathVariable String username);

    @GetMapping("/ratings/car-id/{carId}")
    String readReviewsByCarId(@PathVariable String carId);

    @GetMapping("/username/{username}")
    String readUserByUsername(@PathVariable String username);

}