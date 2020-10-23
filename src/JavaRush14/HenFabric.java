package JavaRush14;

public class HenFabric {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen2 = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();
       System.out.println(hen.getDescription());
       System.out.println("");
       System.out.println(hen2.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Belarus")){
                hen = new BelarusianHen();
            }
            else if (country.equals("Russia")){
                hen = new RussianHen();
            }
            else if (country.equals("Ukraine")){
                hen = new UkrainianHen();
            }
            else hen = new MoldovanHen();
            return hen;
        }
    }
}

