package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "STANOWISKO")
@Entity
@Getter
@Setter
public class PositionModel {
	@Id
	@Column(name = "ID_STANOWISKO", nullable = false)
	private Long id;
	
	@Column(name = "NAZWA", nullable = false, length = 50)
	private String name;
	
	@Enumerated
	@Column(name = "POZIOM_DOSTEPU", nullable = false)
	private AccessLevelType accessLevel;
	
}