package petcc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    private String time;
    private String classroom;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Teacher getTeacher() { return this.teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }

    public String getTime() { return this.time; }
    public void setTime(String time) { this.time = time; }

    public String getClassroom() { return this.classroom; }
    public void setClassroom(String classroom) { this.classroom = classroom; }

}
