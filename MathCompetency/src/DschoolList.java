public class DschoolList {
    package mathcompetencysurvey;
import java.util.ArrayList;
    public class DSchoolList {
        ArrayList<School>schools = new ArrayList<>();

        public void addSchool(DSchoolList sc){
            school.add(sc);
        }

        public void display(){
            for(int i = 0; i< schools.size(); i++){
                System.out.println("School: " +schools.get(i).getName());
            }
        }

        public static void main(String[] args){
            DSchoolList dsl = new DSchoolList();
            dsl.display(new DSchoolList());


            School sc = new School();
            sc.setName("St Patrick");
            dsl.addSchool(sc);

            School sc2 = new School();
            sc2.setName("Woodsville");
            dsl.addSchool(sc2);

            dsl.display();
        }
    }

}
