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
    private String id;
    private String name;
    private Teacher teacher;
    private Student student;


    }

