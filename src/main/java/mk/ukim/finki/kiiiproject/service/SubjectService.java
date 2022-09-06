package mk.ukim.finki.kiiiproject.service;

import mk.ukim.finki.kiiiproject.model.Subject;
import mk.ukim.finki.kiiiproject.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    List<Subject> findAll();
    Optional<Subject> findById(Long id);
    Optional<Subject> save(String name, Integer grade, String type, Teacher teacher);
    void deleteById(Long id);

}
