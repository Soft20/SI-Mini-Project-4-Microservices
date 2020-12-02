package dk.dd.carrating;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepo extends MongoRepository<User, String> {
    User findByUsername(String username);
}