package org.rodrigovelaz.n26.challenge.persistence.entity;

import java.time.LocalDateTime;

public class Transaction {
	
	private Double amount;
	private LocalDateTime date;
	
	public Double getAmount() { return amount; }
	public void setAmount(Double amount) { this.amount = amount; }
	public LocalDateTime getDate() { return date; }
	public void setDate(LocalDateTime date) { this.date = date; }
	
}
