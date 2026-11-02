import java.util.*;
import java.util.stream.*;
import java.util.List;
class Teacher{
    int id;
    String name;

    Teacher(int id , String name){
        this.id = id;
        this.name = name;
    }

}
public class TeacherMain {
    public static void main(String[] args) {

        List<Teacher> teachers = Arrays.asList(
                new Teacher(3,"Bulbul"),
                new Teacher(1,"Rahul"),
                new Teacher(2, "Neha"),
                new Teacher(3, "Priya")
        );

        Map<Integer , String> map = teachers.stream().collect(Collectors.toMap(
                e -> e.id,
                e -> e.name,
                (oldValue, newValue) -> oldValue,
                TreeMap::new
        ));

        System.out.println(map);
    }
}
