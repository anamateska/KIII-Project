package mk.ukim.finki.kiiiproject.service.impl;

import mk.ukim.finki.kiiiproject.model.Subject;
import mk.ukim.finki.kiiiproject.model.Teacher;
import mk.ukim.finki.kiiiproject.repository.SubjectRepository;
import mk.ukim.finki.kiiiproject.repository.TeacherRepository;
import mk.ukim.finki.kiiiproject.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;
    private final TeacherRepository teacherRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository, TeacherRepository teacherRepository) {
        this.subjectRepository = subjectRepository;
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Subject> findAll() {
        return this.subjectRepository.findAll();
    }

    @Override
    public Optional<Subject> findById(Long id) {
        return this.subjectRepository.findById(id);
    }

    @Override
    public Optional<Subject> save(String name, Integer grade, String type, Teacher teacher) {
        return Optional.of(this.subjectRepository.save(new Subject(name,grade,type,teacher)));
    }

    @Override
    public void deleteById(Long id) {
        this.subjectRepository.deleteById(id);
    }
}
