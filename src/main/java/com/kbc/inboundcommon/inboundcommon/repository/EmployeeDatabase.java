package com.kbc.inboundcommon.inboundcommon.repository;

import com.kbc.inboundcommon.inboundcommon.model.Address;
import com.kbc.inboundcommon.inboundcommon.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class EmployeeDatabase {

    public static List<Employee> getAllEmployees(){
        return Stream.of(new Employee(1,"vaibhav",
                Arrays.asList(new Address("Brussels","Brussels Capitals","Belgium")),
                Arrays.asList("+32-499380286", "+32-9474343032")),
                new Employee(2,"Jonas",
                        Arrays.asList(new Address("Ghent","Ghent Capitals","Belgium")),
                        Arrays.asList("+32-904343443", "+32-937342038")),
                new Employee(3,"Pieter",
                        Arrays.asList(new Address("Leuvan","Leuvan Capitals","Belgium")),
                        Arrays.asList("+32-803743303", "+32-849848393"))).collect(Collectors.toList());
    }
}
