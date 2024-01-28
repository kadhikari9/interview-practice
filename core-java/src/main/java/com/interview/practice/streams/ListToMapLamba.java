package com.interview.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class ListToMapLamba {

    public static void main(String[] args) {
        var empList = getEmployees();

        groupByDepartment(empList);

        groupBySalary(empList);
    }

    private static void groupBySalary(List<Employee> employeesList) {

        Map<Integer, List<Employee>> grpBySalary = employeesList.stream().collect(
                Collectors.groupingBy(
                        Employee::getSalary,
                        Collectors.mapping(emp -> emp, Collectors.toList())
                )
        );

        for (Integer salary : grpBySalary.keySet()) {
            log.info("Employee having salary:{} ", salary);
            grpBySalary.get(salary).forEach(employee -> {
                log.info("Emp Id:{}, name:{}", employee.getId(), employee.getName());
            });
        }
    }

    private static void groupByDepartment(List<Employee> empList) {
        Map<String, List<Employee>> groupByDep = empList.stream().collect(Collectors.groupingBy(
                Employee::getDep,
                Collectors.mapping(emp -> emp, Collectors.toList())
        ));

        log.info("Tech emp size: {}", groupByDep.get("Tech").size());
        log.info("HR emp size: {}", groupByDep.get("HR").size());

        Map<String, Optional<Employee>> maxSalaryEmp = empList.stream().collect(Collectors.groupingBy(
                Employee::getDep,
                Collectors.mapping(emp -> emp, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)))
        ));

        Employee techMax = maxSalaryEmp.get("Tech").get();
        Employee hrMax = maxSalaryEmp.get("HR").get();

        log.info("Max Salary Emp on Tech: {}, name:{}", techMax.getId(), techMax.getName());

        log.info("Max Salary Emp on HR: {} name:{}", hrMax.getId(), hrMax.getName());
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
