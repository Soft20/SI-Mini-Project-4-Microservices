package dk.dd.carrating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RepositoryRestController
@RepositoryRestResource
@ResponseBody
@RequestMapping("/ratings")
public class RatingController
{
    @Autowired
    private RatingRepo repo;
    private Object Rating;

    @GetMapping("/")
    public List<dk.dd.carrating.Rating> retrieveAllRatings()
    {
        return (List<dk.dd.carrating.Rating>) repo.findAll();
    }

    @GetMapping("/{carid}")
    public dk.dd.carrating.Rating findByCarId(@PathVariable int carid)
    {
        return repo.findByCarId(carid);
    }

    @PostMapping("/")
    public String saveRating(@RequestBody dk.dd.carrating.Rating rating)
    {
        repo.save(rating);
        return " record saved..";
    }

    @DeleteMapping("/{id}")
    public String deleteRating(@PathVariable int id)
    {
        repo.deleteById((long) id);
        return " record deleted...";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateRating(@RequestBody dk.dd.carrating.Rating rating, @PathVariable int id)
    {
        Optional<dk.dd.carrating.Rating> found = repo.findById((long) id);

        if (!found.isPresent())
            return ResponseEntity.badRequest()
                    .header("Custom-Header", "foo")
                    .body("Try again")
                    .notFound().build();
        rating.setId((long) id);
        repo.save(rating);
        return   ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Notice the custom header")
                .noContent().build();
    }
}

