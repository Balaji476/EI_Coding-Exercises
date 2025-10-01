import java.util.*;
public class ClassroomManager {
    private final Map<String, Classroom> classrooms = new HashMap<>();
    private final Map<Integer, Student> students = new HashMap<>();
    private static ClassroomManager instance = null;
//Singleton design pattern

    private ClassroomManager() 
    {}
    public static ClassroomManager getInstance()
     {
        if (instance == null) instance = new ClassroomManager();
        return instance;
    }


// Add classroom

    public void addClassroom(String className) 
    {
        if (classrooms.containsKey(className)) 
        {
            System.out.println("Classroom " + className + " already exists.");
            return;
        }
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom " + className + " has been created.");
    }

    // Remove classroom

    public void removeClassroom(String className)
     {
        if (!classrooms.containsKey(className))
         {
            System.out.println("Classroom " + className + " does not exist.");
            return;
        }
        classrooms.remove(className);
        System.out.println("Classroom " + className + " has been removed.");
    }

    // Add student

    public void addStudent(int id, String studentName, String className)
     {
        Classroom classroom = classrooms.get(className);
        if (classroom == null)
         {
            System.out.println("No such classroom: " + className);
            return;
        }
        students.putIfAbsent(id, new Student(studentName, id));
        Student student = students.get(id);
        classroom.addStudent(student);
        student.enroll(className);
        System.out.println("Student " + id + " has been enrolled in " + className + ".");
    }

// List classrooms

    public void listClassrooms() 
    {
        if (classrooms.isEmpty()) System.out.println("No classrooms.");
        else 
        {
            for (String key : classrooms.keySet())
                {System.out.println("Classroom: " + key);}
        }
    }

    // List students

    public void listStudents(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("No such classroom: " + className);
            return;
        }
        System.out.println("Students in " + className + ":");
        System.out.println("Id\t"+"StudentName");
        for (Student s : classroom.getStudents())
           { System.out.println(s.getId() + "\t"+" (" + s.getName() + ")");
    }
    }

    // Schedule assignment

    public void scheduleAssignment(String className, String assName, String details)
     {
        Classroom classroom = classrooms.get(className);
        if (classroom == null) {
            System.out.println("No such classroom: " + className);
            return;
        }
        classroom.addAssignment(new Assignment(assName, details));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    // Submit assignment

    public void submitAssignment(int studentId, String className, String assName) {
        Classroom classroom = classrooms.get(className);
        if (classroom == null)
         {
            System.out.println("No such classroom: " + className);
            return;
        }
        Student student = students.get(studentId);
        if (student == null || !student.isEnrolled(className)) 
        {
            System.out.println("Student " + studentId + " not enrolled in " + className);
            return;
        }
        for (Assignment a : classroom.getAssignments()) {
            if (a.getName().equals(assName))
             {
                student.submitAssignment(className, assName);
                System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
                return;
            }
        }
        System.out.println("Assignment not found in class.");
    }

    // Show details of all classrooms

    public void printState() 
    {
        System.out.println("Total classrooms: " + classrooms.size());
        System.out.println("Total students: " + students.size());
        int assCount = 0;
        for (Classroom c : classrooms.values()) assCount += c.getAssignments().size();
        System.out.println("Total assignments: " + assCount);
    }
}

