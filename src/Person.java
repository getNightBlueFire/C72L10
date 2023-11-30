import java.util.Objects;

public class Person implements Cloneable{
    private int age;
    private int salary;
    private String name;

    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person(int age, int salary, String name, Cat cat) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.cat = cat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (salary != person.salary) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(cat, person.cat);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 73 * result + salary;
        result = 7 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cat != null ? cat.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Object test =  ;
        //clone.setCat(this.cat);
        Object clone = super.clone();
        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", name='").append(name).append('\'');
        sb.append(", cat=").append(cat);
        sb.append('}');
        return sb.toString();
    }
}
