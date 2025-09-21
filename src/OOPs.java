public class OOPs {
    static class Employee {
        int salary;
        String name;


        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println("Employee info ");
          Employee employee = new Employee();
          employee.setName("Kushagra");
          employee.salary = 100000;
        System.out.print("The name of Employee - ");
        System.out.println(employee.getName());
        System.out.print("Employee Salary - ");
        System.out.println(employee.getSalary());
          Employee employee1 = new Employee();
          employee1.setName("Divyansh");
          employee1.salary = 70000;
        System.out.print("The name of the Employee - ");
        System.out.println(employee1.getName());
        System.out.print("Employee Salary - ");
        System.out.println(employee1.getSalary());


    }
}
