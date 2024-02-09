package neuefisched.de;


import lombok.*;

@With
@Builder
public record Teacher(
        String id,
        String name,
        String subject) {
}

