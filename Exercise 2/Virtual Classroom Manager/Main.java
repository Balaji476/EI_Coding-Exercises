import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassroomManager cm = ClassroomManager.getInstance();


        
        System.out.println("Virtual Classroom Manager.");
      
        System.out.println("Enter the Command(with correct formate)\ncommands:\nadd_classroom classroomName\nremove_classroom classroomName\nadd_student studentId studentName className\nlist_classrooms\nlist_students className\nschedule_assignment className assignmentName details\nsubmit_assignment studentId className assignmentName\nEnter exit to terminate the program");

        while (true) {
            try {
                System.out.println("Enter the Command(with correct formate)");
            

                String cmd = sc.nextLine().trim();
                if(cmd.equals("exit"))
                break;
                String[] parts = cmd.split("\\s+");
                switch (parts[0]) {
                    case "add_classroom":
                        cm.addClassroom(parts[1]);
                        break;
                    case "remove_classroom":
                        cm.removeClassroom(parts[1]);
                        break;
                    case "add_student":
                        int sid = Integer.parseInt(parts[1]);
                        cm.addStudent(sid, parts[2], parts[3]);
                        break;
                    case "list_classrooms":
                        cm.listClassrooms();
                        break;
                    case "list_students":
                        cm.listStudents(parts[1]);
                        break;
                    case "schedule_assignment":
                        cm.scheduleAssignment(parts[1], parts[2], String.join(" ", Arrays.copyOfRange(parts, 3, parts.length)));
                        break;
                    case "submit_assignment":
                        cm.submitAssignment(Integer.parseInt(parts[1]), parts[2], parts[3]);
                        break;
                    case "status":
                        cm.printState();
                        break;
                    
        
                    default:
                        System.out.println("Unknown command.");
                        System.out.println("Enter the Command(with correct formate)\ncommands:\nadd_classroom classroomName\nremove_classroom classroomName\nadd_student studentId studentName className\nlist_classrooms\nlist_students className\nschedule_assignment className assignmentName details\nsubmit_assignment studentId className assignmentName\nEnter exit to terminate the program");
                }
            } catch (Exception ex) {
                System.err.println("ERROR " + ex.getMessage());
                System.out.println("Failed. Check your command and try again.");
                System.out.println("Enter the Command(with correct formate)\ncommands:\nadd_classroom classroomName\nremove_classroom classroomName\nadd_student studentId studentName className\nlist_classrooms\nlist_students className\nschedule_assignment className assignmentName details\nsubmit_assignment studentId className assignmentName\nEnter exit to terminate the program");
            }
        }

        
        sc.close();
    }

    
        
}
