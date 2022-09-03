package pk.imbilalbutt.bussiness.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@AllArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "HOME_ADDRESS")
    private String homeAddress;

    @Column(name = "CELL_NUMBER")
    private String cellNumber;

    @Column(name = "CNIC_NUMBER")
    private String cnicNumber;

    @Column(name = "ROLES")
    private String roles;

    @Column(name = "USERNAME", unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "RECONFIRM_PASSWORD")
    private String reconfirmedPassword;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;
    
//    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
//    UserCredentials userCredentials;

    @OneToOne(mappedBy = "user")
    Employee employee;

    public User() {

    }
}
