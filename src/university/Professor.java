package university;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor {
    private String name, id, address;
    private Date birthDate;
    private Student advisee;
    private Department workFor;
    SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    
    public Professor(){}
    
    public Professor(String id){
        this.id = id;}
    
    public Professor(String name,String id){
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
    
    public void setBirthDate(String dateS){
        Date date = new Date();
        
        try { date=df.parse(dateS);}
        catch (ParseException e) {
            e.printStackTrace();}
    
        this.birthDate = date;}
    
    public void setAdvisee(Student advisee){
        this.advisee = advisee;
        this.advisee.setAdvisor(this);}
    
    public void setDepartment(Department work){
        this.workFor = work;}
    
    public String getName(){
        return this.name;}
    
    public String getID(){
        return this.id;}
    
    public String getAddress(){
        return this.address;}
    
    public Department getDepartment(){
        return this.workFor;}
    
    public String getBirthDate(){
        return this.df.format(birthDate);}
    
    public Student getAdvisee(){
        return this.advisee;}
    
    public void printAll(){
        System.out.println(this.getName());
        System.out.println(this.getID());
        System.out.println(this.getAddress());
        System.out.println(this.getBirthDate());
        System.out.println(this.getAdvisee());
        System.out.println(this.getDepartment());
    }
}
