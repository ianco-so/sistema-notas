package petcc.model;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @NotNull
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    @CPF
    private String cpf;

    @Column(unique = true)
    @Email
    private String email;

    private String phone;

    private String adress;

    private String brithDate;

    public Integer getId() { return this.id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getCpf() { return this.cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return this.phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAdress() { return this.adress; }
    public void setAdress(String adress) { this.adress = adress; }

    public String getBrithDate() { return this.brithDate; }
    public void setBrithDate(String brithDate) { this.brithDate = brithDate; }
}
