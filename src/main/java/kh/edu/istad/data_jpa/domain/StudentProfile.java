package kh.edu.istad.data_jpa.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class StudentProfile {
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    private String biography;

    @Column(name = "facebook_link")
    private String facebookLink;

    @Column(name = "github_link")
    private String githubLink;

    private String major;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments = new ArrayList<>();
}
