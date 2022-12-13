package Activity7;

public class CollegeCourse {
    private String CourseId;
    private float CreditsHours;
    private char LetterGrade;

    CollegeCourse(){}

    public void SetCourseId(String id){
        this.CourseId = id;
    }

    public void SetCreditHours(float hours){
        this.CreditsHours = hours;
    }

    public void SetLetterGrade(char grade){
        this.LetterGrade = grade;
    }

    public String GetCourseId(){
        return CourseId;
    }

    public float GetCreditHours(){
        return this.CreditsHours;
    }

    public char GetLetterGrade(){
        return this.LetterGrade;
    }
}
