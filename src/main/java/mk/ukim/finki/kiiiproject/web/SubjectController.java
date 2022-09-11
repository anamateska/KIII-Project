package mk.ukim.finki.kiiiproject.web;

import mk.ukim.finki.kiiiproject.model.Subject;
import mk.ukim.finki.kiiiproject.model.Teacher;
import mk.ukim.finki.kiiiproject.repository.TeacherRepository;
import mk.ukim.finki.kiiiproject.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class SubjectController {

    private final SubjectService subjectService;
    private final TeacherRepository teacherRepository;

    public SubjectController(SubjectService subjectService, TeacherRepository teacherRepository) {
        this.subjectService = subjectService;
        this.teacherRepository = teacherRepository;
    }

    @GetMapping
    public String getSubjectPage(Model model) {
        List<Subject> subjects = this.subjectService.findAll();
        model.addAttribute("subjects", subjects);
        return "subjectsList";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        this.subjectService.deleteById(id);
        return "redirect:/subjects";
    }

    @GetMapping("/add-form")
    public String addSubjectPage(Model model) {
        List<Teacher> teachers = this.teacherRepository.findAll();
        model.addAttribute("teachers", teachers);
        return "addSubject";
    }

    @PostMapping("/add")
    public String saveSubject(@RequestParam String name,
                              @RequestParam Integer grade,
                              @RequestParam String type,
                              @RequestParam Teacher teacher){
        this.subjectService.save(name, grade, type, teacher);
        return "redirect:/subjects";
    }

}
