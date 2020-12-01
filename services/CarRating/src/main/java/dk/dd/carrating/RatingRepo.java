package dk.dd.carrating;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RatingRepo extends JpaRepository<Rating, Long>
{
    Rating findByUserId(int id);
    Rating findByCarId(int id);
}
