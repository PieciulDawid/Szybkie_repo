package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "KLIENT")
@Entity
@Getter
@Setter
public class ClientModel {
	@Id
	@Column(name = "ID_KLIENT", nullable = false)
	private Long id;
	
	@Column(name = "NAZWA_FIRMY", nullable = false, length = 50)
	private String companyName;
	
	@Column(name = "NIP", nullable = false)
	private Long nip;
	
	@Column(name = "EMAIL", nullable = false, length = 50)
	private String emailAddress;
	
	@Column(name = "TELEFON", nullable = false)
	private Long phoneNumber;
	
	@Column(name = "ADRES", nullable = false, length = 100)
	private String adress;
	
}