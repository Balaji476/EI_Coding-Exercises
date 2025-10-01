import java.util.*;
class Classroom {
    private final String name;
    private final Map<Integer, Student> students = new HashMap<>();
    private final List<Assignment> assignments = new ArrayList<>();
    private final List<AssignmentObserver> observers = new ArrayList<>();
    public Classroom(String name)
     { this.name = name;
     }
    public String getName() 
    {
         return name;
     }
    
    public void addStudent(Student student) 
    {
        students.put(student.getId(), student);
        observers.add(new StudentNotifier(student));
    }
    public void removeStudent(int studentId) 
    { 
        students.remove(studentId); 
    }
    public Collection<Student> getStudents() 
    {
         return students.values(); 
    }
    public void addAssignment(Assignment assignment) 
    {
        assignments.add(assignment);
       for (AssignmentObserver obs : observers)
     {
        obs.notifyAssignment(name, assignment);
     }
    }
    public List<Assignment> getAssignments()
     { 
        return assignments; }

    public Student getStudent(int id)
     { 
        return students.get(id); }
}
