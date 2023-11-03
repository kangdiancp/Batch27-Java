package com.bootcamp.day06.part06;

import java.util.List;

public interface HRInterface {
    public List<Employee> initListEmps();
    public List<Employee> initListEmps(final Employee... emps);
    public void printEmps(List<Employee> listEmps);
    public double totalGrossSalary();
}
