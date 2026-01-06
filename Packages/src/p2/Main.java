package p2;

import java.util.Scanner;
import p1.Student;

public class Main {




	static Student createStudent(Scanner sc)

	{

		System.out.println("Enter name : ");

		String name = sc.nextLine();

		System.out.println("Enter Rollnumber : ");

		String roll = sc.nextLine();

		System.out.println("Enter Email : ");

		String email = sc.nextLine();

		System.out.println("Enter mobile : ");

		long mob = Long.parseLong(sc.nextLine());




		return new Student(name, roll, email, mob);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of Students : ");

		Student [] students = new Student[Integer.parseInt(sc.nextLine())];

		for(int i=0;i<students.length;i++)

		{

			students[i] = createStudent(sc);

		}

		System.out.println("1.update 2. delete 3. retrieve");

		switch(sc.nextInt())

		{

		case 1:

			System.out.println("Enter roll : ");

			updateStudent(findStudent(sc.nextLine(), students),sc);

			break;

		case 2:

			System.out.println("Enter roll : ");

			Student delStudent = findStudent(sc.nextLine(), students);

			for(int i=0;i<students.length;i++)

			{

				if(students[i]==delStudent)

				{

					students[i] = null;

					break;

				}

			}

			break;

		case 3:

			//all students

			for(Student temp : students)

			{

				System.out.println(temp.toString());

			}

			System.out.println("Enter roll : ");

			//specific Student

			Student cur = findStudent(sc.nextLine(), students);

			if(cur!=null)

			System.out.println(cur.toString());

			break;

		}

	}

	static void updateStudent(Student currStudent,Scanner sc)

	{

		System.out.println("Enter new Name : ");

		currStudent.setName(sc.nextLine());

	}

	static Student findStudent(String roll,Student [] students)

	{

		for(Student curr : students)

		{

			if(curr.getRollnum().equals(roll))

			{

				return curr;

			}

		}

		return null;

	}

}






    














































































































