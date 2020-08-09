package prob1;

import emps.Employee;

public class Store {
    private Employee[] emps = new Employee[20];
    private int numEmps;

    public Store() {
        numEmps = 0;
    }

    public void addEmployee(Employee e) {
        if (numEmps< emps.length) {
            emps[numEmps++] = e;
        }
    }

    public Employee getEmployee(int i) {
        if (i >= 0 && i < numEmps) {
            return emps[i];
        }
        return null;
    }

    public Employee getEmployeeWithName(String findName) {
        for (int i = 0; i <= numEmps; i++) {
            if ((i >= 0 && i < numEmps) && emps[i].getName().equals(findName))

                return emps[i];

        }
        return null;
    }

    public int getNumEmployees() {
        return numEmps;
    }

    public double getTotalHours() {
        double totHours = 0.0;
        for (int i = 0;i<numEmps; i++) {
            totHours += emps[i].getTotalHours();
        }
        return totHours;
    }

    public double getTotalPay() {
        double sum = 0.0;
        for (int i = 0; i < numEmps; i++) {
            sum += emps[i].getPay();
        }
        return sum;
    }

    public Employee removeEmployee(int i) {
        if (i >= 0 && i < numEmps) {
            Employee returnEmp = emps[i];
            for (int j = i + 1; j < numEmps; j++) {
                emps[j - 1] = emps[j];
            }
            numEmps--;
            return returnEmp;
        }
        return null;
    }

    @Override 
    public String toString() {
        String msg = "Payroll report" + "\n"+ String.format("Num Employees:%d, total hrs: %.2f, total pay: %,.2f", getNumEmployees(), getTotalHours(), getTotalPay());
        for(int i = 0; i < numEmps; i++)
        {
        	msg += emps[i].toString();
        }
        
        return msg;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee e = new Employee("Will", 22.33);
    }

}

