package dk.dd.carrating;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RatingRepo extends MongoRepository<Rating, String> {
    Iterable<Rating> findByCarId(int carId);
    Iterable<Rating> findByUsername(String username);
}