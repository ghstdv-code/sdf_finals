package Activity7;

public class Student {
    private int Id;
    private CollegeCourse[] Courses = new CollegeCourse[5];

    public void SetId(int id){
        this.Id = id;
    }

    public int GetId(){
        return this.Id;
    }

    public CollegeCourse GetCourse(int index){
        return Courses[index];
    }

    public void SetCourse(CollegeCourse course, int index){
        Courses[index] = course;
    }


}
