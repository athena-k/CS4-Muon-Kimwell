package q3ex16;

import java.util.*;
/**
 * A Subject contains the name, image file name, units, grade, 
 and the list of subjects.
 * @author MUON
 */
public class Subject {
    private String name, imgFileName;
    private double units, grade;
    private static ArrayList<Subject> subjectList = new ArrayList();
	
    public Subject(String n, String i, double u, double g){
        name = n;
        imgFileName = i;
        units = u;
        grade = g;
        subjectList.add(this);
    }
    public String getName() {
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public double getUnits() {
        return units;
    }
    public void setUnits(double units) {
        units = units;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        grade = grade;
    }
    public static int getListLength() {
        return subjectList.size();
    }
    /**
     * This gets the subject by its index in the subject list.
     * @param index
     * @return
     * @author MUON
     */
    public static Subject getSubjectByIndex(int index){
        return subjectList.get(index);
    }
    public static Subject getElement(int i) throws NullPointerException{
        if(i>-1&&i<subjectList.size()) return subjectList.get(i);
        else throw new NullPointerException();
    }
    public static int getSubjectIndex(Subject s) throws NullPointerException {
        if(subjectList.contains(s)) return subjectList.indexOf(s);
        else throw new NullPointerException();
    }
    public static int getSubjectIndex(String s) throws NullPointerException {
        if(subjectList.contains(searchSubject(s))) return subjectList.indexOf(s);
        else throw new NullPointerException();
    }
    public static Subject searchSubject(String search) throws NullPointerException {
        for(Subject s : subjectList){
            if(s.getName().equalsIgnoreCase(search)) return s;
        }
        throw new NullPointerException();
    }
}
