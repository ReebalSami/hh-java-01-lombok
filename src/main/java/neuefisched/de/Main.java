package neuefisched.de;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("548", "Reebal", "Hamburg", 2);
        Student student2 = new Student("549", "Sophia", "Paris", 3);
        Student student3 = new Student("550", "Mateo", "Barcelona", 6);
        Student student4 = new Student("551", "Elena", "Rome", 4);
        Student student5 = new Student("552", "Sebastian", "Berlin", 3);
        Student student6 = new Student("553", "Ava", "London", 1);
        Student student7 = new Student("554", "Gabriel", "Vienna", 2);
        Student student8 = new Student("555", "Isabella", "Prague", 3);
        Student student9 = new Student("556", "Luca", "Athens", 5);
        Student student10 = new Student("557", "Anya", "Amsterdam", 2);

        System.out.println(student1);

        Student student11 = Student.builder()
                .id("001")
                .name("John")
                .address("New York")
                .grade(10)
                .build();
        System.out.println(student11);


        Teacher teacher1 = new Teacher("T001", "Mr. Johnson", "Mathematics");
        Teacher teacher2 = new Teacher("T002", "Mrs. Anderson", "English");
        Teacher teacher3 = new Teacher("T003", "Mr. Garcia", "Science");
        Teacher teacher4 = new Teacher("T004", "Miss Smith", "History");
        Teacher teacher5 = new Teacher("T005", "Dr. Martinez", "Physics");
        Teacher teacher6 = new Teacher("T006", "Ms. Davis", "Chemistry");
        Teacher teacher7 = new Teacher("T007", "Prof. Thompson", "Computer Science");
        Teacher teacher8 = new Teacher("T008", "Mrs. Wilson", "Biology");
        Teacher teacher9 = new Teacher("T009", "Mr. Robinson", "Geography");
        Teacher teacher10 = new Teacher("T010", "Dr. Lee", "Economics");

        Teacher teacher11 = Teacher.builder()
                .id("T001")
                .name("Mr. Johnson")
                //.subject("Mathematics")
                .build();

        System.out.println(teacher11);

        Teacher teacher12 = teacher11.withSubject("Physics");


        System.out.println(teacher12);



        Course mathCourse = new Course("C001", "Mathematics", teacher1, student1);
        Course englishCourse = new Course("C002", "English", teacher2, student2);
        Course scienceCourse = new Course("C003", "Science", teacher3, student3);
        Course historyCourse = new Course("C004", "History", teacher4, student4);
        Course physicsCourse = new Course("C005", "Physics", teacher5, student5);
        Course chemistryCourse = new Course("C006", "Chemistry", teacher6, student6);
        Course computerScienceCourse = new Course("C007", "Computer Science", teacher7, student7);
        Course biologyCourse = new Course("C008", "Biology", teacher8, student8);
        Course geographyCourse = new Course("C009", "Geography", teacher9, student9);
        Course economicsCourse = new Course("C010", "Economics", teacher10, student10);

        System.out.println(mathCourse);


        Course mathCourse2 = Course.builder()
                .id("C001")
                .name("Mathematics")
                .teacher(teacher11)
                .student(student11)
                .build();

        System.out.println(mathCourse2);


        //  average grade of a Course
        double averageGradeMathCourse = UniversityService.calculateAverageGrade(mathCourse);
        System.out.println("Average grade of " + mathCourse.getTeacher().subject() + "  Course: " + averageGradeMathCourse);

    University university1 = University.builder()
            .id("U001")
            .name("University of Science and Technology")
            .courses(List.of(mathCourse, englishCourse, scienceCourse, historyCourse, physicsCourse,
                    chemistryCourse, computerScienceCourse, biologyCourse, geographyCourse, economicsCourse))
            .build();


        double averageGradeUniversity = UniversityService.calculateAverageGrade(university1);
        System.out.println("Average grade of the University: " + averageGradeUniversity);




        // students with a minimum grade of 2
        List<Student> studentsWithMinGrade = UniversityService.getStudentsWithMinGrade(university1);


        System.out.println("Students with a minimum grade of 2 \"Good\" at " + university1.name() + " :");
        studentsWithMinGrade.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }


}