package mk.ukim.finki.kiiiproject.repository;

import mk.ukim.finki.kiiiproject.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
