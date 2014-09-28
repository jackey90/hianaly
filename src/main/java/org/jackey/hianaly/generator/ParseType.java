package org.jackey.hianaly.generator;

public enum ParseType {
	PRINT (1,"PRINT",""),
	TIME_COUNT (2,"TIME_COUNT",""),
	NUMBER_COUNT (3,"NUMBER_COUNT",""),
	AVG (4,"AVG",""),
	FIRST (5,"FIRST",""),
	LAST (6,"LAST","");

	private int typeId;
	private String name;
	private String description;

	private ParseType(int typeId, String name, String description) {
		this.typeId = typeId;
		this.name = name;
		this.description = description;
	}
	
	public static ParseType getParseTypeById(int id){
		
		return PRINT;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
