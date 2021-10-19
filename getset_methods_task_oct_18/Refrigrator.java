class Refrigrator{
	String model;
	String company;
	int capacityInLitres;
	boolean doubleDoor;
	
	String getModel(){
		return "INTELLIFRESH INV CNV 278 3S";
	}
	String	getCompany (){
		return "Whirlpool";
	}
	int getCapacityInLitres(){
		return 265;
	}
    boolean getDoubleDoor(){
		return true;
	}
	
	void setModel (String model){
		this.model= model;
		System.out.println("Refrigrator model" + model);
	}
	void setCompany(String company){
		this.company=company;
		System.out.println("Refrigrator company" + company);
	}
	void setCapacityInLitres(int capacityInLitres){
		this.capacityInLitres=capacityInLitres;
		System.out.println("Refrigrator capacity InLitres" +capacityInLitres);
	}
	void setDoubleDoor(boolean doubleDoor){
		this.doubleDoor=doubleDoor;
		System.out.println("Refrigrator doubleDoor" +doubleDoor);
	}
}