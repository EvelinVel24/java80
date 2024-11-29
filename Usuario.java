import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    private String username;
    private String password;
    private String roles; // Separados por comas (e.g., "USER,ADMIN")
}
