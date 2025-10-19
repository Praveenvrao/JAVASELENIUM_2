package DAY5;

import DAY4.Loops_Reversenumber;
public class MAINMethod_EmpStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpMain_Class emp1 = new EmpMain_Class();
		emp1.empid = 333;
		emp1.empname = "MARK";
		emp1.empsal = 44333;
		emp1.location = "HYD";
		emp1.Display();
		
		Student_Main_class emp2 = new Student_Main_class();
		emp2.schoolname = "DPS";
		emp2.ID = 44;
		emp2.name = "MOHITH";
		emp2.StudentDisplay();
		
		Loops_Reversenumber loopsobject = new Loops_Reversenumber();
		
		loopsobject.main(args);
	}

}
