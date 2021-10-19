class StringMethod{

		public static void main (String...power){
			
		String company = new String("Xworkz");
		String location = new String("BTM");
		String course = new String(" full Stack ");
		String courseFee = new String("25k");
		String founder = new String ("OMKAR");
		String hr = new String ("Akashara AP");
		String trainer = new String ("Vinay");
		String subject = new String("JAVA,WEB,SQL,JDBC,SPRING");
		String batch = new String ("July");
		String frontEnd = new String("Nikunj");
	
      	char cm = company.charAt(3);
		System.out.println("CharAT method: "+cm);
		
		boolean loc = location.contains("Rajajinagar");
		System.out.println("contains method: " + loc);
			
		//boolean location1 = location.contains("BTM");
		//System.out.println(location1);
		
		String upperCase = course.toUpperCase();
		System.out.println("toUpperCase method: " + upperCase);
		
		String lowerCase = founder.toLowerCase();
		System.out.println("toLowerCase method: " + lowerCase);
		
		boolean equals = courseFee.contentEquals("25k");
		System.out.println("contentEquals method: " + equals);
		
		String concating = course.concat("develpoment");
		System.out.println("concatmethod: " + concating);
		
		String replaceing = batch.replace('l','u');
		System.out.println("replace method: " + replaceing);
		
		String deleting=subject.substring(5);
		System.out.println("substring method-JAVA,WEB,SQL,JDBC,SPRING it delete the java,: " +deleting);
		
		String triming=frontEnd.trim();
		System.out.println("trim method: " +triming);
		
		boolean end= trainer.endsWith("y");
		System.out.println("endsWith method: " +end);
		
		int len=hr.length();
		System.out.println("length method: " +len);
		
		boolean startingletter= batch.startsWith("J");
		System.out.println("startingletter method: " +startingletter); 
		
		boolean empty=location.isEmpty();
		System.out.println("empty method: " +empty); 
		
		boolean matching= frontEnd.matches("Nikunj");
		System.out.println("frontEnd method: " +matching);
		
		int count=hr.codePointCount(0,2);
		System.out.println("codePointCount method: " +count);
		
		//int code=trainer.codePointBefore(5);
		//System.out.println("codePointBefore method: " +code);
		
		//int codePoint=founder.codePointAt(3);
		//System.out.println("codePointAt method: " +codePoint);
	}
}