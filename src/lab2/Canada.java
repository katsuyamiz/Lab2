package lab2;

public class Canada{

    private Province[] provinces = new Province[10];

    /***
     * fix
     */


    public Canada(){

        provinces[0] = new Province("Ontario", "Toronto", 13_448_494);
        provinces[1] = new Province("Quebec","Quebec City",8_164_361);
        provinces[2] = new Province("British Columbia","Victoria",4_648_055);
        provinces[3] = new Province("Alberta","Edmonton",4_067_175);
        provinces[4] = new Province("Manitoba","Winnipeg",1_278_365);
        provinces[5] = new Province("Saskatchewan","Regina",1_098_352);
        provinces[6] = new Province("Nova Scotia","Halifax",971_395);
        provinces[7] = new Province("New Brunswick","Fredericton",747_101);
        provinces[8] = new Province("Newfoundland and Labrador","St.John\'s",519_716);
        provinces[9] = new Province("Prince Edward Island","Charlottetown",142_907);

    }



    public void displayAllProvinces() {
        for (int i = 0; i < provinces.length; i++) {
            System.out.println(provinces[i].getDetails());
        }
    }


    public int getNumOfProvincesBetween(int min, int max) {

        int count = 0;
        min = 1_000_000 * min;
        max = 1_000_000 * max;
        for (int i = 0; i < provinces.length; i++) {
            if(min <= provinces[i].getPopulation() && provinces[i].getPopulation() <= max){
                count += 1;
            }

        }
        return count;
    }



}
