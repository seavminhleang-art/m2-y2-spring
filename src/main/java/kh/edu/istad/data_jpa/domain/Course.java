package kh.edu.istad.data_jpa.domain;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "count_rating")
    private Integer countRating;

    @Column(name = "created_at", columnDefinition = "timestamp(6)")
    private LocalDateTime createdAt;

    private String description;

    @Column(name = "discount_percent")
    private Float discountPercent;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_published")
    private Boolean isPublished;

    private String keyword;

    private String level;

    @Column(name = "price", precision = 38, scale = 2)
    private BigDecimal price;

    private String slug;

    @Column(name = "star_rating")
    private Float starRating;

    private String thumbnail;

    private String title;

    @Column(name = "total_hours")
    private Float totalHours;

    @Column(name = "updated_at", columnDefinition = "timestamp(6)")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;

    @OneToMany(mappedBy = "course")
    private List<Video> videos = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments = new ArrayList<>();
}