package week1_weekly_salary_calculation;

public class HourlyWageCalculations {

    double weekdaysHourlyWage(int basedSalary){
        return basedSalary/40;
    }

    double weekendHourlyWage(int weekendWorkingHours, double weeklySalary, int workingWeekendBonus, double wageIncreaseRate){
        if(weekendWorkingHours > 0 && weekendWorkingHours <= 10){
            weeklySalary =  weeklySalary + (weekendWorkingHours * wageIncreaseRate);
        }else if (weekendWorkingHours > 10){
            weeklySalary =  weeklySalary + (weekendWorkingHours * wageIncreaseRate) + workingWeekendBonus;
        }
        return weeklySalary;
    }

}
