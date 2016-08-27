package university;

public class Main {

    public static void main(String[] args) {
        Student David = new Student("David","123.456");
        Professor John = new Professor("433.212");
        Department Ing = new Department("Ingenieria");
        String birthS = "1995.05.22";
        String birthP = "1972.03.16";
        
        David.setBirthDate(birthS);
        John.setBirthDate(birthP);
        David.setDepartment(Ing);
        John.setDepartment(Ing);
        John.setName("Johnathan");
        John.setAdvisee(David);
        Ing.setChairman(John);
        
        David.printAll();
        System.out.println("");
        John.printAll();
    }
    
}
