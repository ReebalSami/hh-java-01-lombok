package neuefisched.de;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.Optional;

@AllArgsConstructor
@Value
@Builder
public class Course {
    String id;
    String name;
    Teacher teacher;
    Student student;


    }

