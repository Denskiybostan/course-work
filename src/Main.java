import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[3];
        employeeList [0] = new Employee("Nikolaev Nikolay Nikolaevish", 1, 10000);
        employeeList [1]= new Employee("Petrov Petr Petrovich", 2, 12000);
        employeeList[2] = new Employee("Vasiliev Vasiliy Vasilievich", 3, 13000);
        Scanner id = new Scanner(System.in);
        System.out.println("1.Получить список всех сотрудников.\n" + "2.Посчитать сумму затрат на зарплаты в месяц.\n" +"3.Найти сотрудника с минимальной зарплатой" + "4.Найти сотрудника с максимальной зарплатой.\n" + "5.Подсчитать среднее количество зарплат.\n" + "6.Получить Ф.И.О. всех сотрудников");
        int number = id.nextInt();
        while (number !=7);
        if (number == 1) {
            for (int i = 0; i < employeeList.length; i++) {
                System.out.println("ID " +  employeeList[i].getNumberId() + "ФИО сотрудника " + employeeList[i].getNameEmployee() + "Отдел " + employeeList[i].getDepartament() + "зарплата сотрудника " + employeeList[i].getSalary());
            }
            int newNumber = id.nextInt();
            if (number == 2) {
                int sum = 0;
                for (int i = 0; i < employeeList.length; i++) {
                    sum += employeeList[i].getSalary();
                }
                System.out.println("Сумма затрат на зарплаты " + sum);
                newNumber = id.nextInt();
                number = newNumber;
            }
                if (number == 3) {
                    int min = employeeList[0].getSalary();
                    for (int i = 0; i < employeeList.length; i++) {
                        if (min > employeeList[0].getSalary()) {
                            min = employeeList[0].getSalary();
                            System.out.println("Сотрудник с минимальной зарплатой " + min);
                        }
                        newNumber = id.nextInt();
                        number = newNumber;
                    }
                    if (number == 4) {
                        int max = employeeList[2].getSalary();
                        for (int i = 0; i < employeeList.length; i++) {
                            if (max < employeeList[2].getSalary()) {
                                max = employeeList[2].getSalary();
                                System.out.println("Сотрудник с максимальной зарплатой " + max);
                            }
                            newNumber = id.nextInt();
                            number = newNumber;
                        }
                        if (number == 5) {
                            int averageSalary;
                            int addition = 0;
                            for (int i = 0; i < employeeList.length; i++) {
                                addition += employeeList[i].getSalary();
                                }
                            averageSalary = addition / 3;
                            System.out.println("Среднее ЗП " + averageSalary);
                            newNumber = id.nextInt();
                            number = newNumber;
                            }

                        if (number == 6) {
                            String sumName = " ";
                            for (int i = 0; i < employeeList.length; i++) {
                                sumName += employeeList[i].getNameEmployee();
                            }
                            System.out.println("Ф.И.О. всех сотрудников " + sumName);
                        } else {
                            System.out.println("Ошибка");
                        }



                    }

                }
            }
            }
        }



