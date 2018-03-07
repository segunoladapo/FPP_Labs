package fpp.lab4;

/**
 * Created by segun on 3/4/2018.
 */
public class Secretary extends DeptEmployee {
    private int overTime;

    public Secretary(String name, int salary, String hireDate, int overTime) {
        super(name, salary, hireDate);
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overTime);
    }
}
