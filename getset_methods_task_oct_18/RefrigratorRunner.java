class RefrigratorRunner{

	public static void main (String...value){
	
		Refrigrator fridge = new Refrigrator();
		String model=fridge.getModel();
		
		if (model==null){
			System.out.println("0");
		}else
			System.out.println("LG");
		
		System.out.println("The Company is :"+fridge.getCompany());
		System.out.println("Capacity in litres:"+fridge.getCapacityInLitres());
		System.out.println("Is it double door:"+fridge.getDoubleDoor());
		
		
		System.out.println("................Setter Method.............");
		fridge.setModel("GC-B247KQDV.ADSQEBN");
		fridge.setCompany("Samsung");
		fridge.setCapacityInLitres(679);
		fridge.setDoubleDoor(false);
	}
}