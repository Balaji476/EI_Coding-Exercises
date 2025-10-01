class StudentNotifier implements AssignmentObserver {
    private final Student student;
    public StudentNotifier(Student s)
     { 
        this.student = s; 
    }
    
    @Override
    public void notifyAssignment(String className, Assignment assignment)
     {
        System.out.println("Notifying student " + student.getId() 
            + " about new assignment: " + assignment.getName() + " in " + className);
    }
}