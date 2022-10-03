package FOP.greatlearning.project1;

public class HRDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Hr Department ";
	}

	public String getTodaysWork() {
		return "Fill today\'s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
}
