package fpp.lab4;

/**
 * Created by segun on 3/4/2018.
 */
public abstract class DeptEmployee {
    private String name;
    private double salary;
    private String hireDate;

    public DeptEmployee(String name, double salary, String hireDate){
        this.setName(name);
        this.salary = salary;
        this.setHireDate(hireDate);
    }

    protected double computeSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
