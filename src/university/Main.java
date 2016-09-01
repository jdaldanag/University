package university;

public class Main {

    public static void main(String[] args) {
        Student David = new Student("David","123.456");
        Graduate Alan = new Graduate("Alan","812.672");
        Professor John = new Professor("433.212");
        Department Ing = new Department("Ingenieria");
        String birthS = "1995.05.22";
        String birthP = "1972.03.16";
        
        David.setBirthDate(birthS);
        John.setBirthDate(birthP);
        Alan.setBirthDate(birthS);
        David.setDepartment(Ing);
        John.setDepartment(Ing);
        John.setName("Johnathan");
        John.setAdvisee(David);
        Ing.setChairman(John);
        Alan.setDegree("ing. Sistemas");
        Alan.setInstitution("Universidad Nacional");
        
        David.printAll();
        System.out.println("");
        John.printAll();
        System.out.println("");
        Alan.printAll();
    }
    
}
