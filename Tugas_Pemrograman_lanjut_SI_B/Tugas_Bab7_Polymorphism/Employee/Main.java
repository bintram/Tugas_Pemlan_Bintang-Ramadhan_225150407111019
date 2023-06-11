package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism;

public class Main {
    public static void main(String[] args) {
        // jawaban no 1
        // Employee employee = new Employee(); //terjadi error
        // perbaikan no 1
        // public static void main(String[] args) {
        // Employee employee = new Employee();
        // @Override
        // public double earnings() {
        // return 0;
        // }
        // }
        // System.out.println(employee.earnings());

        // jawaban no 3
        // Employee employee = new Employee("Alexander", "2034211190");
        // @Override
        // public double earnings() {
        // return 0.1;
        // }
        // };
        // System.out.println(employee.getName());
        // System.out.println(employee.getNoKTP());
        // System.out.println(employee.earnings());

        // jawaban no 2
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, 25, 5, 1995);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, 25, 11, 2003);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, 3, 2, 1992);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000,
                .04, 300, 30, 1, 1990);
        // System.out.println("Employees diproses secara terpisah:\n");
        // System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ",
        // salariedEmployee.earnings());
        // System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ",
        // hourlyEmployee.earnings());
        // System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ",
        // commissionEmployee.earnings());
        // System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned",
        // basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        // System.out.println("Employees diproses secara polimorfisme:\n");
        // for (Employee currentEmployee : employees) {
        // System.out.println(currentEmployee);
        // If (currentEmployee instanceof BasePlusCommissionEmployee) {
        // BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee)
        // currentEmployee;
        // employee.setBaseSalary(1.10 * employee.getBaseSalary());
        // System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n",
        // employee.getBaseSalary());
        // }
        // System.out.printf("pendapatan: $%,.2f\n\n",
        // currentEmployee.earnings());
        // }
        // for (int j = 0; j < employees.length; j++){
        // System.out.printf("Employee %d = %s\n", j,
        // employees[j].getClass().getName());
        // }

        // jawaban no 4
        System.out.println(salariedEmployee);
        if (salariedEmployee instanceof SalariedEmployee) {
            SalariedEmployee employee = (SalariedEmployee) salariedEmployee;
            if (employee.getBulan() == 5) {
                employee.setWeeklySalary(4 * employee.getWeeklySalary() + 100000);
                System.out.printf("Bulan ini adalah ulang tahunnya.\n" + "Lahir pada " + employee.getTanggalLahir()
                        + "\n" + "Gaji setelah ditambah 100000: $%.2f\n", employee.getWeeklySalary());
            }
        }
        System.out.printf("Pendapatan: $%.2f\n\n", salariedEmployee.earnings());
    }
}
