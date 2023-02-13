package com.exercicexp;

public class Exercicexp2 {

	
	private String name;
	private String lastname;
	private String email;
	private int age;
	
	
	
	public Exercicexp2() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public Exercicexp2(String name, String lastname, String email, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
	}



	


	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getLastname() {
		return lastname;
	}





	public void setLastname(String lastname) {
		this.lastname = lastname;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}


	


	@Override
	public String toString() {
		return "Exercicexp2 [name=" + name + ", lastname=" + lastname + ", email=" + email + ", age=" + age + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercicexp2 person1 = new Exercicexp2("dion", "fiacre", "armeldion@gmail.com", 14);
		System.out.println(person1.toString());
	}

}
