import exception.CityNotFoundException;

import java.util.Map;

public class PopulationSearch {

    private static final Map<String, Integer> POP_DB = Map.of(
            "London", 200000,
            "Manchester", 150000
    );

    public int getPopulation(String city) {
        if (null == city || city.isBlank()) {
            throw new IllegalArgumentException("City name cannot be null or empty");
        }
        Integer population = POP_DB.get(city);
        if (null == population) {
            throw new CityNotFoundException("Please check the city you have provided");
        }
        return population;
    }

}
