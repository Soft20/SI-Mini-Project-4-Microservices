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
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserRepo repo;
    private Object User;

    @GetMapping("/")
    public List<dk.dd.carrating.User> retrieveAllUsers()
    {
        return (List<dk.dd.carrating.User>) repo.findAll();
    }

    @GetMapping("/{userid}")
    public dk.dd.carrating.User findByCarId(@PathVariable int userid)
    {
        return repo.findById(userid);
    }

    @PostMapping("/")
    public String saveUser(@RequestBody dk.dd.carrating.User user)
    {
        repo.save(user);
        return " record saved..";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id)
    {
        repo.deleteById((long) id);
        return " record deleted...";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@RequestBody dk.dd.carrating.User user, @PathVariable int id)
    {
        Optional<dk.dd.carrating.User> found = repo.findById((long) id);

        if (!found.isPresent())
            return ResponseEntity.badRequest()
                    .header("Custom-Header", "foo")
                    .body("Try again")
                    .notFound().build();
        user.setId((long) id);
        repo.save(user);
        return   ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Notice the custom header")
                .noContent().build();
    }
}

