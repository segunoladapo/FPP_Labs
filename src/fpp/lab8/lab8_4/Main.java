package fpp.lab8.lab8_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Address> listOfAddresses;
    private StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Main m = new Main();
        m.loadData();
        m.printAsUpperCase();
    }

    private void loadData() {
        listOfAddresses = new ArrayList<>();
        listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
        listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));


    }

    public void printAsUpperCase() {
        listOfAddresses.forEach(e -> {
            List<String> strLists = new ArrayList<>();
            strLists.add(e.getName());
            strLists.add(e.getStreet());
            strLists.add(e.getCity());
            strLists.add(e.getState());
            strLists.add(e.getZip());
            formatFields(strLists);
        });
        //implement
        System.out.println(output.toString());
    }

    private String formatFields(List<String> list) {
        //implement
        output.append(list.get(0).toUpperCase());
        output.append("\n");
        output.append(list.get(1).toUpperCase());
        output.append("\n");
        output.append(list.get(2).toUpperCase() + " " + list.get(3).toUpperCase() + " " + list.get(4).toUpperCase());
        output.append("\n");
        output.append("\n");
        return null;
    }


}
