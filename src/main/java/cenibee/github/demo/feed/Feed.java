package cenibee.github.demo.feed;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter @Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Feed {

    @Id @GeneratedValue
    Long id;

    String description;

}
