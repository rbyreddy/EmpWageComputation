package empwagecomputation;
//Daily Employee Wage
//Assume per is 20
//Full day hour is 8

public class DailyEmpWage {
    public static void main(String[] args) {

//Constants
        int FUll_TIME = 0;
        int EMP_RATE_PER_HOUR = 20;

//  variables
        int empHrs = 0;
        int empWage = 0;

// Computation
        double check = Math.floor(Math.random() * 10) % 2;

        if (check == FUll_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("EMP WAGE: " +empWage);

    }
}

