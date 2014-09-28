package org.jackey.hianaly.common.chart;

public enum ChartType {

	/**
	 * line
	 */
	CHART_TYPE_LINE("line"),
	/**
	 * column
	 */
	CHART_TYPE_COLUMN("column"),
	/**
	 * pie
	 */
	CHART_TYPE_PIE("pie");
	
	private String type;

	public String getType() {
		return type;
	}

	private ChartType(String type) {
		this.type = type;
	}
	
}
