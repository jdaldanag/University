package university;

public class Graduate extends Student {
    private String degree;
    private String Institution;
    
    public Graduate(String name,String id){
        this.setName(name);
        this.setID(id);
    }
    
    public void setDegree (String degree){
        this.degree = degree;}
    
    public void setInstitution(String institution){
        this.Institution = institution;}
    
    public String getDegree(){
        return this.degree;}
    
    public String getInstitution(){
        return this.Institution;}
    
    public void printAll(){
        super.printAll();
        System.out.println(this.getDegree());
        System.out.println(this.getInstitution());
    }
    
}
