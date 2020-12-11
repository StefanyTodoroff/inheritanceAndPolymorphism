package edu.smg;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person(
				"Stefy",
				"zhk. Boyana",
				"0884741713",
				"stefy.tod@gmail.com");
		Student student = new Student(
				"Iva",
				"zhk. Drujba",
				" 0886425647",
				"iva.576@abv.bg",
				Student.JUNIOR);
		Employee employee = new Employee(
				"Mira",
				"zhk. Hladilnika",
				"0883259339",
				"mira.zik@yahoo.com",
				"smg",
				750.0);
		Staff staff = new Staff(
				"Elena",
				"zhk. Hadji Dimitar",
				"0883259344",
				"elena.pop@yahoo.com",
				"Flame",
				900.0,
				"director");
		
		Faculty faculty = new Faculty(
				"Emi",
				"zhk. Oborishte",
				"0883252155",
				"emili.pop@yahoo.com",
				"35 school",
				930.0,
				"11:00 - 18:00",
				"Master of philosophy");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(staff.toString());
		System.out.println(faculty.toString());
				

	}

}
