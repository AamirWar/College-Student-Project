class Student{
    private static String InstituteName;
    private int sId;
    private String SName;
    private String Course;
    private double Fee;

    public static void setinstituteName(String InstituteName){
        Student.InstituteName = InstituteName;    
    }
    /*public static getinstituteName(){
        return InstituteName;
    }*/

    public void setsId(int sId){
        this.sId = sId;
    }
    public int getsId(){
        return sId;
    }

    public void setSName(String SName){
        this.SName = SName;
    }
    public String getSName(){
        return SName;
    }

    public void setCourse(String Course){
        this.Course = Course;
    }
    public String getCourse(){
        return Course;
    }

    public void setFee(double Fee){
        this.Fee = Fee;
    }
    public double getFee(){
        return Fee;
    }
    public void learn(){
        System.out.println(SName+ "is learning "+ Course);
    }
    public void display(){
        System.out.println("Institute Name   : "  + InstituteName);
        System.out.println("Student ID       : "  + sId);
        System.out.println("Student Name     : "  + SName);
        System.out.println("Course           : "  + Course);
        System.out.println("Course Fee       : "  + Fee);
    }
}