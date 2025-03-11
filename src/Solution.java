/*
* File: App.java
* Author: Cipola Ákos
* Copyright: 2025, Cipola Ákos
* Group: IN
* Date: 2025-03-11
* Github: https://github.com/Ak0s445/
* Licenc: MIT
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public ArrayList<Employee> fileReader() {
        File file = new File("laktatkft.txt");
        ArrayList<Employee> employeeList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file, "utf-8")) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                Employee employee = new Employee();
                employee.name = parts[0];
                employee.city = parts[1];
                employee.address = parts[2];
                employee.birthDate = parts[3];
                employee.salary = Integer.parseInt(parts[4]);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található");
            e.getMessage();
        }
        return employeeList;
    }

    public void countOlderThan30(ArrayList<Employee> employeeList) {
        int count = 0;
        for (Employee emp : employeeList) {
            String[] birthParts = emp.birthDate.split("-");
            int birthYear = Integer.parseInt(birthParts[0]);
            if (2025 - birthYear > 30) {
                count++;
            }
        }
        System.out.println("30 évnél idősebb dolgozók száma: " + count);
    }

    public void averageSalaryInBudapest(ArrayList<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (Employee emp : employeeList) {
            if (emp.city.equals("Budapest")) {
                sum += emp.salary;
                count++;
            }
        }
        if (count > 0) {
            System.out.println(" A budapesti dolgozok átlagbére: " + (sum / count));
        } else {
            System.out.println("nincs pesti dolgozó.");
        }
    }
}


