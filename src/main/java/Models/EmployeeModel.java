package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "PRACOWNIK")
@Entity
@Setter
@Getter
public class EmployeeModel {
	@Id
	@Column(name = "ID_PRACOWNIK", nullable = false)
	private Long id;
	
	@Column(name = "IMIE", nullable = false, length = 50)
	private String name;
	
	@Column(name = "NAZWISKO", nullable = false, length = 50)
	private String surname;
	
	@Column(name = "LOGIN", nullable = false, length = 50)
	private String login;
	
	@Column(name = "HASLO", nullable = false, length = 50)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "STANOWISKO_ID_STANOWISKO")
	private PositionModel position;
}