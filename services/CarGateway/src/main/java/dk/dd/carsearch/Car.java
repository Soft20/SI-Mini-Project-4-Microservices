package dk.dd.carsearch;

import lombok.Data;
import lombok.NonNull;

@Data
public class Car
{
        //@Id
        //@GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @NonNull private String brand;
        @NonNull private int year;
        @NonNull private long km;

        public String getBrand() {
                return brand;
        }
        public Long getId() {
                return id;
        }
        public long getKm() {
                return km;
        }
        public int getYear() {
                return year;
        }
}
