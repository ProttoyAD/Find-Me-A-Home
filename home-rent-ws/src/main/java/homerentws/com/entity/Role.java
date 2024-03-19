package homerentws.com.entity;

import homerentws.com.enums.userRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "role")
@AllArgsConstructor
@NoArgsConstructor
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int roleId;

  @Enumerated(EnumType.STRING)
  private userRole userRole;

  @ManyToMany(mappedBy="roles")
  private List<User> users;


}
