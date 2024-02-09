package neuefisched.de;

import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {
    private static final double MIN_GRADE = 2;

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


    public static List<Student> getStudentsWithMinGrade(University university) {

        return university.courses().stream()
                .map(Course::getStudent)
                .filter(student -> student.getGrade() <= MIN_GRADE)
                .toList();
    }


}

