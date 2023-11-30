import java.util.Objects;
import java.util.StringJoiner;

public class C extends B{




    private String name;
    private String type;
    private int age;

    public C(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }


//    @Override
//    public String toString() {
//        return new StringJoiner(", ", C.class.getSimpleName() + "[", "]")
//                .add("name='" + name + "'")
//                .add("type='" + type + "'")
//                .add("age=" + age)
//                .toString();
//    }





}
