package university;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name, id, address; 
    private Department major;
    private Date birthDate;
    private double gpa;
    private Professor advisor;
    SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    
    public Student(){}
    
    public Student(String id){
        this.id = id;}
    
    public Student(String name,String id){
        this.name = name;
        this.id = id;}
    
    public String toString(){
        return this.name;}
    
    public void setName(String name){
        this.name = name;}
    
    public void setID(String id){
        this.id = id;}
    
    public void setAddress(String address){
        this.address = address;}
    
    public void setGPA(double gpa){
        this.gpa = gpa;}
    
    public void setBirthDate(String dateS){
        Date date = new Date();
        
        try { date=df.parse(dateS);}
        catch (ParseException e) {
            e.printStackTrace();}
    
        this.birthDate = date;}
    
    public void setAdvisor(Professor advisor){
        this.advisor = advisor;}
    
    public void setDepartment(Department major){
        this.major = major;}
    
    public String getName(){
        return this.name;}
    
    public String getID(){
        return this.id;}
    
    public String getAddress(){
        return this.address;}
    
    public Department getDepartment(){
        return this.major;}
    
    public String getBirthDate(){
        return this.df.format(birthDate);}
    
    public Professor getAdvisor(){
        return this.advisor;}
    
    public void printAll(){
        System.out.println(this.getName());
        System.out.println(this.getID());
        System.out.println(this.getAddress());
        System.out.println(this.getBirthDate());
        System.out.println(this.getAdvisor());
        System.out.println(this.getDepartment());
    }
    
}
