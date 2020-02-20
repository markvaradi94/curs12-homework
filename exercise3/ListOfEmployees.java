package ro.fasttrackit.curs12.homework.exercise3;

import java.util.*;

public class ListOfEmployees {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public Map<String, Double> employeesNameAndSalary() {
        Map<String, Double> result = new HashMap<>();
        for (Employee employee : this.employeeList) {
            result.put(employee.getName(), employee.getSalary());
        }
        return result;
    }

    public Map<String, Double> employeesWithSalaryHigherThan(double amount) {
        Map<String, Double> employeeNamesAndSalaries = employeesNameAndSalary();
        Map<String, Double> result = new HashMap<>(employeeNamesAndSalaries);
        for (String key : employeeNamesAndSalaries.keySet()) {
            if (employeeNamesAndSalaries.get(key) <= amount) {
                result.remove(key);
            }
        }
        return result;
    }

    public List<String> salariesHigherThan(double amount) {
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : this.employeeList) {
            if (employee.getSalary() > amount) {
                employeeNames.add(employee.getName());
            }
        }
        return employeeNames;
    }

    public Set<String> getCompanies() {
        Set<String> companies = new HashSet<>();
        for (Employee employee : this.employeeList) {
            companies.add(employee.getCompany());
        }
        return companies;
    }

    public Map<String, List<String>> employeesByCompany() {
        Map<String, List<String>> result = new HashMap<>();
        Set<String> companies = getCompanies();
        for (String company : companies) {
            List<String> names = new ArrayList<>();
            for (Employee employee : this.employeeList) {
                if (company.toLowerCase().equals(employee.getCompany().toLowerCase())) {
                    names.add(employee.getName());
                }
                result.put(company, names);
            }
        }
        return result;
    }

    private Map<String, List<Employee>> companiesEmployeesList() {
        Map<String, List<Employee>> result = new HashMap<>();
        Set<String> companies = getCompanies();
        for (String company : companies) {
            List<Employee> employees = new ArrayList<>();
            for (Employee employee : this.employeeList) {
                if (company.toLowerCase().equals(employee.getCompany().toLowerCase())) {
                    employees.add(employee);
                }
                result.put(company, employees);
            }
        }
        return result;
    }

    public Map<String, Double> salariesByCompany() {
        Map<String, List<Employee>> employeesByCompany = companiesEmployeesList();
        Map<String, Double> result = new HashMap<>();
        for (String key : employeesByCompany.keySet()) {
            double sum = 0;
            for (Employee employee : employeesByCompany.get(key)) {
                sum += employee.getSalary();
            }
            result.put(key, sum);
        }
        return result;
    }

    public List<String> employeesAtACompany(String company) {
        Map<String, List<String>> employees = employeesByCompany();
        for (String key : employees.keySet()) {
            if (key.toLowerCase().equals(company.toLowerCase())) {
                return employees.get(key);
            }
        }
        return null;
    }

    public double sumOfAllSalaries() {
        double sum = 0;
        for (Employee employee : this.employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Map<String, Double> highestPayingCompany() {
        Map<String, Double> salariesByCompany = salariesByCompany();
        Map<String, Double> result = new HashMap<>();
        double maxValue = Double.MIN_VALUE;
        String maxKey = "";
        for (String key : salariesByCompany.keySet()) {
            if (salariesByCompany.get(key) > maxValue) {
                maxValue = salariesByCompany.get(key);
                maxKey = key;
            }
        }
        result.put(maxKey, maxValue);
        return result;
    }

    @Override
    public String toString() {
        return "ListOfEmployees{" +
                "employeeList=" + employeeList +
                '}';
    }
}
