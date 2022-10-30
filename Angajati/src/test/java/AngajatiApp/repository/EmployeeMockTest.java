package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.controller.EmployeeController;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static AngajatiApp.controller.DidacticFunction.*;
import static org.junit.jupiter.api.Assertions.*;


class EmployeeMockTest {
    EmployeeRepositoryInterface employeesRepository;
    EmployeeController employeeController;
    EmployeeMock employeeMock;
    private List<Employee> employeeList;
    @BeforeEach
    public void setUp() {
        employeesRepository = new EmployeeMock();
        employeeController = new EmployeeController(employeesRepository);
        employeeMock=new EmployeeMock();
        employeeList=employeeMock.getEmployeeList();
    }

    @Test
    void finalTC_01() {
        Employee employee = new Employee();
        employee.setFirstName("La");
        employee.setLastName("Dorin");
        employee.setCnp("1991141315210");
        employee.setFunction(DidacticFunction.LECTURER);
        employee.setSalary(1500D);
        //int nr = employeesRepository.getEmployeeList().size();
        //EmployeeMock employeeMock=new EmployeeMock();

        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(true, employeeAdded);
    }

    @Test
    void finalTC_02() {
        Employee employee = new Employee();
        employee.setFirstName("");
        employee.setLastName("Sergiu");
        employee.setCnp("1881141315210");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(1800D);
        //int nr = employeesRepository.getEmployeeList().size();
       // employeeController.addEmployee(employee);
        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(false, employeeAdded);
    }

    @Test
    void finalTC_03() {
        Employee employee = new Employee();
        employee.setFirstName("Costache");
        employee.setLastName("Maria3");
        employee.setCnp("2991111015610");
        employee.setFunction(CONFERENTIAR);
        employee.setSalary(-1D);
       /* int nr = employeesRepository.getEmployeeList().size();
        employeeController.addEmployee(employee);
        assertEquals(nr + 1, employeesRepository.getEmployeeList().size());*/
        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(false, employeeAdded);
    }

    @Test
    void finalTC_04() {
        Employee employee = new Employee();
        employee.setFirstName("Ardean");
        employee.setLastName("Sorin");
        employee.setCnp("188114131521");
        employee.setFunction(CONFERENTIAR);
        employee.setSalary(2000D);
        /*int nr = employeesRepository.getEmployeeList().size();
        employeeController.addEmployee(employee);
        assertEquals(nr + 1, employeesRepository.getEmployeeByCriteria().size());*/
        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(false, employeeAdded);
    }

    @Test
    void finalTC_05() {
        Employee employee = new Employee();
        employee.setFirstName("");
        employee.setLastName("Ioana");
        employee.setCnp("2991241315210");
        employee.setFunction(DidacticFunction.LECTURER);
        employee.setSalary(2500D);
        /*int nr = employeesRepository.getEmployeeList().size();
        employeeController.addEmployee(employee);
        assertEquals(nr + 1, employeesRepository.getEmployeeByCriteria().size());*/
        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(false, employeeAdded);
    }

    @Test
    void finalTC_06() {
        Employee employee = new Employee();
        employee.setFirstName("Popescu");
        employee.setLastName("Liviu");
        employee.setCnp("1991141315214");
        employee.setFunction(CONFERENTIAR);
        employee.setSalary(0D);
       /* int nr = employeesRepository.getEmployeeList().size();
        employeeController.addEmployee(employee);
        assertEquals(nr + 1, employeesRepository.getEmployeeByCriteria().size());*/
        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(false, employeeAdded);
    }

    @Test
    void finalTC_07() {
        Employee employee = new Employee();
        employee.setFirstName("Popescu");
        employee.setLastName("Roxana");
        employee.setCnp("2951111015610");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(0D);
      /*  int nr = employeesRepository.getEmployeeList().size();
        employeeController.addEmployee(employee);
        assertEquals(nr + 1, employeesRepository.getEmployeeByCriteria().size());*/
        boolean employeeAdded;
        employeeAdded= employeeMock.addEmployee(employee);
        assertEquals(false, employeeAdded);
    }

    // Lab3 -> modify function test
/*
    @Test
    void modifyEmployeeFunctionValid() {
        Employee employee=new Employee();
        employee.setIdentification(27);
        employee.setFirstName("Radaslavescu");
        employee.setLastName("Constantinc");
        employee.setCnp("234567891234");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(15000D);
        List<Employee> employeeList= employeeMock.getEmployeeList();
        employeeList.add(employee);

        for(int i=0;i<employeeList.size();i++){

            if(employeeList.get(i).getIdentification()==employee.getIdentification()){
                employeeMock.modifyEmployeeFunction(employee,CONFERENTIAR);
            }
        }

        assertEquals(CONFERENTIAR,employee.getFunction());
    }
*/

    @Test
    void modifyEmployeeFunctionIDValid() {
        Employee employee=new Employee();
        employee.setIdentification(27);
        employee.setFirstName("Radaslavescu");
        employee.setLastName("Constantinc");
        employee.setCnp("234567891234");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(15000D);
        List<Employee> employeeList= employeeMock.getEmployeeList();
        employeeList.add(employee);
        employeeMock.modifyEmployeeFunction(employee,CONFERENTIAR);
        // employee.setFunction(CONFERENTIAR);
        assertEquals(CONFERENTIAR,employee.getFunction());
    }
    @Test
    void modifyEmployeeFunctionIDInValid() {
        Employee employee = new Employee();
        employee.setIdentification(28);
        employee.setFirstName("Bogdan");
        employee.setLastName("Vrajitoarea");
        employee.setCnp("134567891234");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(15000D);
        List<Employee> employeeList = employeeMock.getEmployeeList();
        employeeMock.modifyEmployeeFunction(employee, LECTURER);

        assertEquals(ASISTENT, employee.getFunction());
    }
    @Test
    void modifyEmployeeFunctionLungimeInvalida() {
        Employee employee = new Employee();
        employee.setIdentification(28);
        employee.setFirstName("Bogdan");
        employee.setLastName("Vrajitoarea");
        employee.setCnp("134567891234");
        employee.setFunction(DidacticFunction.ASISTENT);
        employee.setSalary(15000D);
        List<Employee> employeeList = employeeMock.getEmployeeList();
       /* employeeList.add(employee);
        for(int i=0;i<employeeList.size();i++){
            employeeList.remove(i);
        }
*/


        employeeMock.modifyEmployeeFunction(employee, LECTURER);
        List<Employee> employeeListAfterModifyEmployee = employeeMock.getEmployeeList();
        assertEquals(ASISTENT, employee.getFunction());
        assertTrue(employeeList.equals(employeeListAfterModifyEmployee));
    }
    @Test
    void modifyEmployeeFunctionNullEmployee() {
        Employee employee=null;
        // employeeList.add(null);

        employeeMock.modifyEmployeeFunction(employee, LECTURER);
        assertThrows(NullPointerException.class,()->employee.getFunction());
        //String newFunction=employee.getFunction().toString();
       // assertEquals(ASISTENT, employee.getFunction());
       // assertEquals("", employee.getFunction());
    }

}