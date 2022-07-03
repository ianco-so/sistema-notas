package petcc.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @NotNull
    @Column(unique = true)
    private Integer id;

    @NotNull
    private Integer value;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @NotNull
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @NotNull
    private String term;

    @NotNull
    private String year;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getValue() { return value; }
    public void setValue(Integer value) { this.value = value; }

    public Student getAluno() { return student; }
    public void setAluno(Student student) { this.student = student; }

    public Subject getSubject() { return this.subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public String getTerm() { return this.term; }
    public void setTerm(String term) { this.term = term; }

    public String getYear() { return this.year; }
    public void setYear(String ano) { this.year = year; }
}