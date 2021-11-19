import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name="Author")
public class AuthorEntity {

    @Id
    @Column(name="AuthorId")
    private String authorID;

    @Column(name="lname")
    private String lName;

    @Column(name="fname")
    private String fName;
}
