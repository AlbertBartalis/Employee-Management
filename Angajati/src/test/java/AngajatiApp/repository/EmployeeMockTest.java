package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.controller.EmployeeController;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EmployeeMockTest {
    EmployeeRepositoryInterface employeesRepository;
    EmployeeController employeeController;
    EmployeeMock employeeMock;

    @BeforeEach
    public void setUp() {
        employeesRepository = new EmployeeMock();
        employeeController = new EmployeeController(employeesRepository);
        employeeMock=new EmployeeMock();
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
        employee.setFunction(DidacticFunction.CONFERENTIAR);
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
        employee.setFunction(DidacticFunction.CONFERENTIAR);
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
        employee.setFunction(DidacticFunction.CONFERENTIAR);
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
}