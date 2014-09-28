package org.jackey.hilog.common.chart;

import java.math.BigDecimal;

public class ChartUnitCommonVO {
	private String name;
	private BigDecimal[] datas;

	/**
	 * 
	 * @param dateNumber
	 */
	public ChartUnitCommonVO(int dateNumber) {
		this(null, dateNumber);
	}

	public ChartUnitCommonVO(String name, int dateNumber) {
		this.name = name;
		datas = new BigDecimal[dateNumber];
		for (BigDecimal date : datas) {
			date = BigDecimal.ZERO;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal[] getDatas() {
		return datas;
	}

	public void setDatas(BigDecimal[] datas) {
		this.datas = datas;
	}

	

}
