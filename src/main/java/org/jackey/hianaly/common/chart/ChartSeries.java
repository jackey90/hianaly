package org.jackey.hianaly.common.chart;

import java.math.BigDecimal;
import java.util.List;

public class ChartSeries {
	
	private String name;
	private List<BigDecimal> data;
	
	public ChartSeries() {
	}

	public ChartSeries(String name, List<BigDecimal> data) {
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BigDecimal> getData() {
		return data;
	}

	public void setData(List<BigDecimal> data) {
		this.data = data;
	}
	
	
}
