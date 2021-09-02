package com.kbc.inboundcommon.inboundcommon.controller;

import com.kbc.inboundcommon.inboundcommon.model.Address;
import com.kbc.inboundcommon.inboundcommon.model.Employee;
import com.kbc.inboundcommon.inboundcommon.repository.EmployeeDatabase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
  //today we understand flatmap and map function of java 8 stream

    List<Employee> employees= EmployeeDatabase.getAllEmployees();

   @GetMapping("/name")
    public List<String> getEmployeeName(){
       return employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());
   }

    @GetMapping("/all")
    public List<Employee> allEmployees(){
        return employees;
    }

    @GetMapping("/address")
    public List<Address> getAllEmployeeAddress(){
        return employees.stream().flatMap(employee -> employee.getAddress().stream()).collect(Collectors.toList());
    }

    @GetMapping("/filter/{name}")
    public List<Address> filteredAddressNames(@PathVariable String name){
       return employees.stream().filter(employee -> employee.getName().equalsIgnoreCase(name)).flatMap(employee -> employee.getAddress().stream()).collect(Collectors.toList());
    }
    @GetMapping("/map")
    public Map<String,List<Address>> getAddressName(){
       return employees.stream().collect(Collectors.toMap(employee ->
               employee.getName(),emp->emp.getAddress()));
    }

}
