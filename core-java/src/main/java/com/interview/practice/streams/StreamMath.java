package com.interview.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class StreamMath {

    public static void main(String[] args) {
        var employees = getEmployees();
        Optional<Employee> highestSalary = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary));
        log.info("Emp with Highest Salary across all department: {}, salary:{}",
                highestSalary.get().getName(), highestSalary.get().getSalary());

        Optional<Employee> minSalary = employees.stream()
                .min(Comparator.comparingInt(Employee::getSalary));
        log.info("Emp with Highest Salary across all department: {}, salary:{}",
                minSalary.get().getName(), minSalary.get().getSalary());

        Map<String, List<Employee>> empByDep = employees.stream().collect(Collectors.groupingBy(Employee::getDep,
                Collectors.mapping(emp -> emp, Collectors.toList())));

        Map<String, Optional<Employee>> maxEmp = employees.stream().collect(Collectors.groupingBy(
                Employee::getDep, Collectors.mapping(emp -> emp, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)))
        ));

    }

    private static List<Employee> getEmployees() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setDep("Tech");
        employee.setName("Ray1");
        employee.setSalary(3000);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setDep("Tech");
        employee2.setName("Ray2");
        employee2.setSalary(2000);

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setDep("HR");
        employee3.setName("Ray3");
        employee3.setSalary(2000);

        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setDep("HR");
        employee4.setName("Ray4");
        employee4.setSalary(5000);

        return Arrays.asList(employee2, employee3, employee, employee4);
    }

}
