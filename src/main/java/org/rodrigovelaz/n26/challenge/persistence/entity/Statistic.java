package org.rodrigovelaz.n26.challenge.persistence.entity;

import java.time.LocalDateTime;

public class Statistic {

	private LocalDateTime date;
	private Double sum;
	private Double avg;
	private Double max;
	private Double min;
	private Long count;
	
	public LocalDateTime getDate() { return date; }
	public void setDate(LocalDateTime date) { this.date = date; }
	public Double getSum() {  return sum; }
	public void setSum(Double sum) { this.sum = sum; }
	public Double getAvg() { return avg; }
	public void setAvg(Double avg) { this.avg = avg; }
	public Double getMax() { return max; }
	public void setMax(Double max) { this.max = max; }
	public Double getMin() { return min; }
	public void setMin(Double min) { this.min = min; }
	public Long getCount() { return count; }
	public void setCount(Long count) { this.count = count; }

}
