package empwagecomputation;

//Check Employee is Present or Absent
//- Use ((RANDOM)) for Attendance Check
public class EmployeeAttendance {
    public static void main(String[] args) {

//Constants
            int full_time = 0;

//Computation
            double check = Math.floor(Math.random() * 10) % 2;

            if (check == full_time)
                System.out.println("Employee is present");
            else
                System.out.println("Employee is Absent");

        }
    }

