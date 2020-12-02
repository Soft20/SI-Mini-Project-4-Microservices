package dk.dd.carsearch;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingSearchController {

    private RatingSearchClient ratingClient = null;
    private CarSearchClient carClient = null;
    private final Gson GSON = new Gson();

    public RatingSearchController(RatingSearchClient ratingClient, CarSearchClient carClient)
    {
        this.ratingClient = ratingClient;
        this.carClient = carClient;
    }

    @GetMapping("/ratings/username/{username}")
    @ResponseBody
    @CrossOrigin(origins = "*") // allow request from any client
    public List<Rating> getRatingsByUsername(@PathVariable String username)
    {
        String jsonReview = ratingClient.readReviewsByUsername(username);
        List<Rating> reviews = GSON.fromJson(jsonReview, new TypeToken<List<Rating>>(){}.getType());
        return reviews;
    }

    @GetMapping("/ratings/car-id/{carId}")
    @ResponseBody
    @CrossOrigin(origins = "*") // allow request from any client
    public List<Rating> ratingsByCarId(@PathVariable String carId)
    {
        String jsonReview = ratingClient.readReviewsByCarId(carId);
        List<Rating> ratings = GSON.fromJson(jsonReview, new TypeToken<List<Rating>>(){}.getType());
        return ratings;
    }
}