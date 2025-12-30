package OOP;

class StudentCourse_23 {
    String name,id;
    String [] courseRegistered;
    int regcoursecount;
    public StudentCourse_23(String name,String id){
        this.name=name;
        this.id=id;
        courseRegistered=new String[10];

        regcoursecount=0;

    }
    boolean enrollCourse(String course)
    {
        for(int i=0;i<regcoursecount;i++){
            if(courseRegistered[i].equalsIgnoreCase(course)){
                return false;

            }
        }
            if(regcoursecount<courseRegistered.length){
                courseRegistered[regcoursecount]=course;
                regcoursecount++;
                return true;
            }
        return false;
        
    }
    
}
class CourseManagement{
    static String[] allCourse=new String[10];
    static int totalcourse=0;
    static boolean enrollStudentincourse(StudentCourse_23 stu, String course){
        boolean isNewCourse = true;
        for(int i=0;i<totalcourse;i++){
            if(allCourse[i].equalsIgnoreCase(course)){
                isNewCourse = false;
                break;
            }
        }
        if(isNewCourse && allCourse.length>totalcourse){
            allCourse[totalcourse] = course;
            totalcourse++;
        }
         return stu.enrollCourse(course);

    }
}
public class Main{
    public static void main(String[] args) {
        StudentCourse_23 s1=new StudentCourse_23("sai", "M8");
        StudentCourse_23 s2=new StudentCourse_23("abhi", "M4");
        StudentCourse_23 s3=new StudentCourse_23("baa", "q1");
        StudentCourse_23 s4=new StudentCourse_23("sai", "M8");
        System.out.println(CourseManagement.enrollStudentincourse(s1, "M-1"));
        System.out.println(CourseManagement.enrollStudentincourse(s2, "C Language"));
        System.out.println(CourseManagement.enrollStudentincourse(s3, "C Language"));
        System.out.println(CourseManagement.enrollStudentincourse(s4, "M-1"));

        
    }
}

