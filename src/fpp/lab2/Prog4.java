package fpp.lab2;

public class Prog4 {
    public static void main(String[] args){
        String data = Data.records;
        String[] records = data.split(":");
        for(String row : records){
            String[] columns = row.split(",");
            System.out.println(columns[0]);
        }
    }
}
