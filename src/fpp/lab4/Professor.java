package fpp.lab4;

/**
 * Created by segun on 3/4/2018.
 */
public class Professor extends DeptEmployee {
    private int noOfPublications;
    public Professor(String name, double salary, String hireDate, int noOfPublications){
        super(name, salary, hireDate);
        this.setNoOfPublications(noOfPublications);
    }


    public int getNoOfPublications() {
        return noOfPublications;
    }

    public void setNoOfPublications(int noOfPublications) {
        this.noOfPublications = noOfPublications;
    }
}
