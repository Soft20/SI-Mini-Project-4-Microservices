package dk.dd.carsearch;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Rating {
    String id;
    @NonNull String username;
    @NonNull int carId;
    @NonNull int rating;
}