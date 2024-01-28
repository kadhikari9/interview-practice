package com.interview.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ListToMapExample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setDep("Tech");
        employee.setName("Ray1");
        employee.setSalary(1000);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setDep("Tech");
        employee2.setName("Ray2");
        employee2.setSalary(2000);

        Employee employee3 = new Employee();
        employee3.setId(2);
        employee3.setDep("HR");
        employee3.setName("Ray3");
        employee3.setSalary(2000);

        var empList = Arrays.asList(employee2, employee3, employee);
        Map<String, List<Employee>> computeMap = new HashMap<>();
        empList.forEach(val ->
                computeMap.computeIfAbsent(val.getDep(), value -> new ArrayList<>()).add(val));

        log.info("Tech emp size: {}", computeMap.get("Tech").size());
        log.info("HR emp size: {}", computeMap.get("HR").size());

    }
}
