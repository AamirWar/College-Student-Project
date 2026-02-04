class College {
    public static void main(String[] args) {
        Student.setinstituteName("Naresh i Technologies");
        
        Student s1 = new Student();
        s1.setsId(101);
        s1.setSName("Aamir");
        s1.setCourse("Core Java");
        s1.setFee(3500);

        System.err.println("Displaying s1 object values");
        s1.display();
		
		Student s2 = new Student();
		s2.setsId(102);
		s2.setSName("John");
		s2.setCourse("Python");
		s2.setFee(2500);
		
		System.out.println("\nDisplaying s2 object values");
		s2.display();
		
		s1.setCourse(s1.getCourse()+", Oracle");
		s1.setFee(s1.getFee()+2500);
		System.out.println("\nDisplaying updated s1 object values");
		s1.display();
        
        s2.setCourse(s2.getCourse()+", Mongo DB");
        s2.setFee(s2.getFee()+3000);
        System.out.println("\nDisplaying updated s2 object values");
        s2.display();
    }    
}