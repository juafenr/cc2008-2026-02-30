import java.util.ArrayList;

public class Student
{
    private String name;
    private int id;
    private ArrayList<Activity> activities;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;

        activities = new ArrayList<>();
    }

    public void addActivity(Activity a) {
        activities.add(a);
    }
}