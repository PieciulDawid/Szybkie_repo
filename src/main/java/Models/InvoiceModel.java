package Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "FAKTURA", indexes = {@Index(name = "FAKTURA__IDX", columnList = "ZAMOWIENIE_ID_ZAMOWIENIE", unique = true)})
@Entity
@Getter
@Setter
public class InvoiceModel {
	@Id
	@Column(name = "ID_FAKTURA", nullable = false)
	private Long id;
	
	@Lob
	@Column(name = "DANE_FAKTURY")
	private String invoiceData;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "ZAMOWIENIE_ID_ZAMOWIENIE", nullable = false)
	private OrderModel order;
	
}