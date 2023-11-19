public class Employee {
    private String nameEmployee;
    private int departament;
    private int salary;
    private int numberId;
    public Employee(String nameEmployee, int departament, int salary) {
        this.nameEmployee = nameEmployee;
        this.departament = departament;
        this.salary = salary;
        numberId = new CounterId().getId();
    }
    public String getNameEmployee() {
        return this.nameEmployee;
    }
    public int getDepartament() {
        return this.departament;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getNumberId() {
        return this.numberId;
    }
    public void  setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartament(int departament) {
        this.departament = departament;
    }
}


