package basics;

public class Student {
    // Attributes
    String name;
    int marks1, marks2, marks3;

    // Constructor
    public Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total
    public int totalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    public double percentage() {
        return (totalMarks() / 3.0);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Percentage: " + percentage() + "%");
        System.out.println("---------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 85, 90, 80);
        Student s2 = new Student("Priya", 75, 70, 80);
        Student s3 = new Student("Sneha", 95, 85, 90);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}