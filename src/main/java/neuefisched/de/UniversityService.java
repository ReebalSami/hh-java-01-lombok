package neuefisched.de;

import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {

    // function to calculate the average grade of a Course
    public static double calculateAverageGrade(Course course) {
        return course.getStudent().getGrade();
    }


    //function to calculate the average grade of the entire University
    public static double calculateAverageGrade(University university) {
        List<Course> courses = university.courses();
        double totalGrade = courses.stream()
                .mapToDouble(course -> course.getStudent().getGrade())
                .sum();
        return totalGrade / courses.size();
    }
    // function that retrieves all students from a University with a minimum grade of 2/"Good"
    public static List<Student> getStudentsWithMinGrade(University university, int minGrade) {
        return university.courses().stream()
                .map(Course::getStudent)
                .filter(student -> student.getGrade() >= minGrade)
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentsWithMinGrade(University university) {
        int minGrade = 2;
        return university.courses().stream()
                .map(Course::getStudent)
                .filter(student -> student.getGrade() <= minGrade)
                .toList();
    }


}

