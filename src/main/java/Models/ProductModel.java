package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Table(name = "PRODUKT")
@Entity
@Getter
@Setter
public class ProductModel {
	@Id
	@Column(name = "ID_PRODUKT", nullable = false)
	private Long id;
	
	@Column(name = "NAZWA", nullable = false, length = 50)
	private String name;
	
	@Column(name = "ILOSC", nullable = false)
	private Long amount;
	
	@Column(name = "CENA", nullable = false, precision = 38, scale = 2)
	private BigDecimal price;
	
	@Column(name = "OPIS", nullable = false, length = 4000)
	private String description;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "PRODUKT_KATEGORIA",
			joinColumns = { @JoinColumn(name = "PRODUKT_ID_PRODUKT") },
			inverseJoinColumns = { @JoinColumn(name = "KATEGORIA_ID_KATEGORIA") }
	)
	private List<ProductModel> products = new ArrayList<>();
}