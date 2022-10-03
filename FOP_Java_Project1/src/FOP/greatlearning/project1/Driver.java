package FOP.greatlearning.project1;

public class Driver {
	public static void main(String[] args) {

		SuperDepartment tech = new TechDepartment();
		SuperDepartment hr = new HRDepartment();
		SuperDepartment admin = new AdminDepartment();
		
		//Printing Admin Department details
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+ '\n');
		
		//Printing HR Department details
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(((HRDepartment) hr).doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday() + '\n');
		
		//Printing Tech Department details
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(((TechDepartment) tech).getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
