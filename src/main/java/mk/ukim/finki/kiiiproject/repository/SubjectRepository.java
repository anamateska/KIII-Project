package mk.ukim.finki.kiiiproject.repository;

import mk.ukim.finki.kiiiproject.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
