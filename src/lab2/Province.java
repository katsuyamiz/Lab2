package lab2;

public class Province {
    private String name;
    private String capital;
    private long population;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    public static final long DEFAULT_POPULATION = 4_648_055;


    public Province(String name, String capital, long population) {
        if (isValidPopulation​(population) && isValidProvince​(name) && isValidCapitalCity​(capital)) {

            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.population = DEFAULT_POPULATION;
        }
    }

    /**
     * @return true, false
     * <p>
     * private boolean isValidCapitalCity​(String captallll)​{
     * <p>
     * String[] capitals = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg",
     * "Victoria", "Charlottetown", "Regina", "Edmonton", "St.John's"};
     * <p>
     * for (int i = 0; i < capitals.length; i++){
     * <p>
     * if (capitals[i].equalsIgnoreCase(captallll)){
     * return true;
     * }
     * <p>
     * }
     * return false;
     * }
     */

    private boolean isValidCapitalCity​(String capital) {
        String[] capitals = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg",
                "Victoria", "Charlottetown", "Regina", "Edmonton", "St.John's"};
        for (int i = 0; i < capitals.length; i++) {
            if (capitals[i].equalsIgnoreCase(capital)) {
                return true;
            }
        }

        return false;
    }

    public Province() {
        setName("British Columbia");
        setCapital("Victoria");
        setPopulation(4_648_055);

    }


    /**
     * @param province
     * @return true, false
     */
    private boolean isValidProvince​(String province) {

        String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba",
                "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        for (int i = 0; i < provinces.length; i++) {
            if (provinces[i].equals(province)) {
                return true;
            }

        }
        return false;
    }

    private boolean isValidPopulation​(long population) {
        if (30_000 <= population && population <= 15_000_000) {
            return true;
        }
        return false;

    }


    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return population
     */
    public long getPopulation() {
        return population;
    }

    /**
     * @param population
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    public String getDetails() {
        String pr = "The capital of " + getName() + " (population. " + getPopulation() + ") is " + getCapital() + ".";
        return pr;
    }
}
