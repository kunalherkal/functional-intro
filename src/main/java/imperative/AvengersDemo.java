package imperative;

import java.util.LinkedList;
import java.util.List;

public class AvengersDemo {

    public static void main(String[] args) {
        LinkedList<Avenger> avengers = new LinkedList<>();

        avengers.add(new Avenger("Iron Man", 80, 100));
        avengers.add(new Avenger("Captain America", 90, 80));
        avengers.add(new Avenger("Hulk", 100, 0));
        avengers.add(new Avenger("Black Widow", 0, 80));
        avengers.add(new Avenger("Hawkeye", 0, 80));

        List<String> avengerNames = getAvengerNames(avengers);
        System.out.println("All avengers: " + avengerNames);
        System.out.println("---------");

        List<Avenger> realAvengers = getRealAvengers(avengers);
        List<String> realAvengersNames = getAvengerNames(realAvengers);
        System.out.println("Real avengers: " + realAvengersNames);
        System.out.println("---------");

        List<Avenger> intelligentAvengers = getIntelligentAvengers(avengers);
        List<String> intelligentAvengersNames = getAvengerNames(intelligentAvengers);
        System.out.println("Intelligent avengers: " + intelligentAvengersNames);
        System.out.println("---------");

        List<String> avengerNames2 = getAvengerNames(avengers);
        System.out.println("All avengers: " + avengerNames2);
        //System.out.println(avengerNames.equals(avengerNames2));
        System.out.println("---------");

    }

    public static List<String> getAvengerNames(List<Avenger> avengers) {
        List<String> names = new LinkedList<>();

        for (int i = 0; i < avengers.size(); i++) {
            names.add(avengers.get(i).getName());
        }

        return names;
    }

    public static List<Avenger> getRealAvengers(List<Avenger> avengers) {
        List<Avenger> realAvengers = new LinkedList<>();

        for (int i = 0; i < avengers.size(); i++) {

            if(avengers.get(i).getPower() > 50)
                realAvengers.add(avengers.get(i));
        }

        return realAvengers;
    }

    public static List<Avenger> getIntelligentAvengers(final List<Avenger> avengers) {
        int j = -1;
        for (int i = 0; i < avengers.size(); i++) {
            if(avengers.get(i).getIntelligence() < 50) {
                j = i;
            }
        }

        if(j > -1) {
            avengers.remove(j);
        }

        return avengers;
    }
}
