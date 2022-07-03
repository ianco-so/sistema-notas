package petcc.model;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @NotNull
    private Integer id;

    @CPF
    @Column(unique = true)
    @NotNull
    private String cpf;

    @NotNull
    private String name;

    @Email
    @Column(unique = true)
    private String email;

    private Integer age;

    private Integer phone;

    private String adress;

    private LocalDate brithDate;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getName() { return this.name; }
    public void setNome(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getIdade() { return this.age; }
    public void setIdade(Integer age) { this.age = age; }

    public Integer getTelefone() { return this.phone; }
    public void setTelefone(Integer phone) { this.phone = phone; }

    public String getEndereco() { return this.adress; }
    public void setEndereco(String adress) { this.adress = adress; }

    public LocalDate getDataNascimento() { return this.brithDate; }
    public void setDataNascimento(LocalDate brithDate) { this.brithDate = brithDate; }
}