package org.jackey.hianaly.common.chart;

import java.util.List;

public class ChartModel {

	/** 
     * 报表在页面上显示的宽度 
     */  
    private int chartWidth;  
    /** 
     * 报表在页面上显示的高度 
     */  
    private int chartHight;  
    /** 
     * 报表标题
     */  
    private String chartTitle;
    /** 
     * 报表副标题
     */  
    private String chartSubTitle; 
    /** 
     * 横坐标标题
     */  
    private String xTitle;
    /** 
     * 横坐标所需列 名称
     */  
    private List<String> categories;  
    /** 
     * 纵坐标标题
     */  
    private String yTitle;  
    /** 
     * 系列
     */  
    private List<ChartSeries> series; 
    /** 
     * 报表类型 
     */  
    private String chartType;
    
    
	
	public ChartModel(int chartWidth, int chartHight, String chartTitle,
			String chartSubTitle, String xTitle, List<String> categories,
			String yTitle, List<ChartSeries> series, ChartType chartType) {
		this.chartWidth = chartWidth;
		this.chartHight = chartHight;
		this.chartTitle = chartTitle;
		this.chartSubTitle = chartSubTitle;
		this.xTitle = xTitle;
		this.categories = categories;
		this.yTitle = yTitle;
		this.series = series;
		this.chartType = chartType.getType();
	}

	public ChartModel() {
	}

	public int getChartWidth() {
		return chartWidth;
	}


	public void setChartWidth(int chartWidth) {
		this.chartWidth = chartWidth;
	}


	public int getChartHight() {
		return chartHight;
	}


	public void setChartHight(int chartHight) {
		this.chartHight = chartHight;
	}


	public String getChartTitle() {
		return chartTitle;
	}


	public void setChartTitle(String chartTitle) {
		this.chartTitle = chartTitle;
	}


	public String getChartSubTitle() {
		return chartSubTitle;
	}


	public void setChartSubTitle(String chartSubTitle) {
		this.chartSubTitle = chartSubTitle;
	}


	public String getxTitle() {
		return xTitle;
	}


	public void setxTitle(String xTitle) {
		this.xTitle = xTitle;
	}


	public String getyTitle() {
		return yTitle;
	}


	public void setyTitle(String yTitle) {
		this.yTitle = yTitle;
	}


	public String getChartType() {
		return chartType;
	}


	public void setChartType(ChartType chartType) {
		this.chartType = chartType.getType();
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public List<ChartSeries> getSeries() {
		return series;
	}

	public void setSeries(List<ChartSeries> series) {
		this.series = series;
	}
    
}
