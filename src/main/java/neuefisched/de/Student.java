package neuefisched.de;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {
    String id;
    String name;
    String address;
    double grade;
}
