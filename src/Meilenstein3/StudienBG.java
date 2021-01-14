package Meilenstein3;

public class StudienBG {

    private String Semester;
    private int SemesterJahr;


    public  StudienBG(String semester, int semesterJahr) {
        Semester = semester;
        SemesterJahr = semesterJahr;

    }





    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public int getSemesterJahr() {
        return SemesterJahr;
    }

    public void setSemesterJahr(int semesterJahr) {
        SemesterJahr = semesterJahr;
    }
}

