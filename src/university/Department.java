package university;

public class Department {
    private String name;
    private Professor chairman;
    
    public Department(){}
    
    public Department(String name){
        this.name = name;}
    
    public String toString(){
        return this.name;}
    
    public void setName(String name){
        this.name = name;}
    
    public void setChairman(Professor chairman){
        this.chairman = chairman;}
    
    public String getName(){
        return this.name;}
    
    public Professor getChairman(){
        return this.chairman;
    }
    
}
