package dk.dd.carrating;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Rating {
    String id;
    @Getter
    @NonNull String username;
    @NonNull int carId;
    @NonNull int rating;
}