package dk.dd.carrating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingRepo repo;
    @Autowired
    private UserRepo userRepo;
    private Object Rating;

    @GetMapping("/")
    public List<Rating> retrieveAllReviews() {
        return repo.findAll();
    }

    @GetMapping("/username/{username}")
    public List<Rating> findByUsername(@PathVariable String username) {
        return (List<Rating>) repo.findByUsername(username);
    }

    @GetMapping("/car-id/{carId}")
    public List<Rating> findByCarId(@PathVariable int carId) {
        System.out.println("hello");
        return (List<Rating>) repo.findByCarId(carId);
    }
}