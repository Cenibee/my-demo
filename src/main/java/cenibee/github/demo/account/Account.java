package cenibee.github.demo.account;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter @Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue
    Long id;

    String email;

}
