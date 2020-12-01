package dk.dd.carrating;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Rating
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull private int rating;
    @NonNull private int carId;

    @OneToOne
    // @JoinColumn(name = "")
    @NonNull private User userId;
}
