package dk.dd.carrating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RepositoryRestResource
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo repo;
    private Object User;

    @GetMapping("/")
    public List<User> getAllUsers()
    {
        return repo.findAll();
    }

    @GetMapping("/username/{username}")
    public User findByUsername(@PathVariable String username)
    {
        return repo.findByUsername(username);
    }

    @PostMapping("/")
    public String saveUser(@RequestBody User user)
    {
        repo.save(user);
        return " record saved..";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id)
    {
        repo.deleteById(id);
        return " record deleted...";
    }
}