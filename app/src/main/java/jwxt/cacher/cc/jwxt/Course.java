package jwxt.cacher.cc.jwxt;

/**
 * Created by xhaiben on 2016/8/20.
 */
public class Course {
    private String courseName;
    private String classRoom;
    private String teacherName;
    private int day; //周日到周六 0-6
    private int beginLesson; //开始节数
    private int endLesson; //结束节数
    private int beginWeek; //开始周数
    private int endWeek; //节数周数
    private int courseType; //1单周，2双周

    public Course(){

    }

    public Course(String courseName) {
        this.courseName=courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getBeginLesson() {
        return beginLesson;
    }

    public void setBeginLesson(int beginLesson) {
        this.beginLesson = beginLesson;
    }

    public int getEndLesson() {
        return endLesson;
    }

    public void setEndLesson(int endLesson) {
        this.endLesson = endLesson;
    }

    public int getBeginWeek() {
        return beginWeek;
    }

    public void setBeginWeek(int beginWeek) {
        this.beginWeek = beginWeek;
    }

    public int getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(int endWeek) {
        this.endWeek = endWeek;
    }

    public int getCourseType() {
        return courseType;
    }

    public void setCourseType(int courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return courseName+","+classRoom+","+day+","
                +teacherName+","+beginLesson+","+endLesson+","+beginWeek+","+endWeek+","+courseType;
    }
}
