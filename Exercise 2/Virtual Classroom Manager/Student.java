import java.util.*;
class Student {
    private final String name;
    private final int id;
    private final Set<String> classNames = new HashSet<>();
    private final Map<String, Set<String>> submissions = new HashMap<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName()
     { return name; }
     
    public int getId() 
    { return id; }

    public void enroll(String className)
     { classNames.add(className);
     }

    public boolean isEnrolled(String className) 
    {
         return classNames.contains(className); 
     }

    public void submitAssignment(String className, String assignmentName) 
    {
        submissions.putIfAbsent(className, new HashSet<>());
        submissions.get(className).add(assignmentName);
    }

 
}
