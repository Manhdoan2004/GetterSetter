package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void input(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // consume newline
			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double averageGrade = scanner.nextDouble();
			scanner.nextLine(); // consume newline

			// Kiểm tra và set dữ liệu cho sinh viên
			Student student = new Student(name, age, address, phoneNumber, averageGrade);
			students[i] = student;
		}
		scanner.close();
	}

	public static void print(Student[] students) {
		System.out.println("\nDanh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].getName());
			System.out.println("Tuổi: " + students[i].getAge());
			System.out.println("Địa chỉ: " + students[i].getAddress());
			System.out.println("Số điện thoại: " + students[i].getPhoneNumber());
			System.out.println("Điểm trung bình: " + students[i].getAverageGrade());
			System.out.println();
		}
	}

	public static void sortByAverageGrade(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1 - i; j++) {
				if (students[j].getAverageGrade() > students[j + 1].getAverageGrade()) {
					// Swap students[j] and students[j + 1]
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		input(students);
		print(students);

		// Sắp xếp sinh viên theo thứ tự điểm trung bình tăng dần
		sortByAverageGrade(students);

		// In danh sách sinh viên sau khi sắp xếp
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình tăng dần:");
		print(students);
	}
}

class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageGrade;

	public Student(String name, int age, String address, String phoneNumber, double averageGrade) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.averageGrade = averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Tuổi phải là số nguyên lớn hơn 0.");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		if (averageGrade >= 0) {
			this.averageGrade = averageGrade;
		} else {
			System.out.println("Điểm trung bình phải là số thực lớn hơn hoặc bằng 0.");
		}
	}

	public static void input(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // consume newline
			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double averageGrade = scanner.nextDouble();
			scanner.nextLine(); // consume newline

			// Kiểm tra và set dữ liệu cho sinh viên
			Student student = new Student(name, age, address, phoneNumber, averageGrade);
			students[i] = student;
		}
		scanner.close();
	}

	public static void print(Student[] students) {
		System.out.println("\nDanh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].getName());
			System.out.println("Tuổi: " + students[i].getAge());
			System.out.println("Địa chỉ: " + students[i].getAddress());
			System.out.println("Số điện thoại: " + students[i].getPhoneNumber());
			System.out.println("Điểm trung bình: " + students[i].getAverageGrade());
			System.out.println();
		}
	}

	public static void sortByAverageGrade(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - 1 - i; j++) {
				if (students[j].getAverageGrade() > students[j + 1].getAverageGrade()) {
					// Swap students[j] and students[j + 1]
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		input(students);
		print(students);

		// Sắp xếp sinh viên theo thứ tự điểm trung bình tăng dần
		sortByAverageGrade(students);

		// In danh sách sinh viên sau khi sắp xếp
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình tăng dần:");
		print(students);
	}
}


