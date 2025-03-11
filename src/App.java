/*
* File: App.java
* Author: Cipola Ákos
* Copyright: 2025, Cipola Ákos
* Group: IN
* Date: 2025-03-11
* Github: https://github.com/Ak0s445/
* Licenc: MIT
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Cipola Ákos, SZOFT IN, 2025-03-11");
        Solution solution = new Solution();
        ArrayList<Employee> employeeList = solution.fileReader();
        solution.countOlderThan30(employeeList);
        solution.averageSalaryInBudapest(employeeList);
    }
}
