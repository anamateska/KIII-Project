package mk.ukim.finki.kiiiproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer grade;

    private String type;

    @ManyToOne
    private Teacher teacher;

    public Subject(String name, Integer grade, String type, Teacher teacher) {
        this.name = name;
        this.grade = grade;
        this.type = type;
        this.teacher = teacher;
    }
}
