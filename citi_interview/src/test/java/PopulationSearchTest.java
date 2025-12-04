import exception.CityNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PopulationSearchTest {

    @Test
    void populationSearch(){
        String city = "London";
        PopulationSearch ps = new PopulationSearch();
        int population = ps.getPopulation(city);
        assertEquals(200000, population);
    }

    @Test
    void populationSearchWhenCityEmpty(){
        String city = "";
        PopulationSearch ps = new PopulationSearch();
        assertThrows(IllegalArgumentException.class, () -> {
            ps.getPopulation("");
        });
    }

    @Test
    void populationSearchWhenCityIsNull(){
        String city = null;
        PopulationSearch ps = new PopulationSearch();
        assertThrows(IllegalArgumentException.class, () -> {
            ps.getPopulation(null);
        });
    }

    @Test
    void populationSearchWhenCityIsNotPresentInDB(){
        String city = null;
        PopulationSearch ps = new PopulationSearch();
        assertThrows(CityNotFoundException.class, () -> {
            ps.getPopulation("ABC");
        });
    }





}
