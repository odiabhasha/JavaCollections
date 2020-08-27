package com.app.sorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class StudentComparator implements Comparator<Student> {

    private int sortType = SORT_DEFAULT;

    public static final int SORT_DATE_ASCENDING = 1;
    public static final int SORT_DATE_DESCENDING = 2;
    public static final int SORT_GRADE_ASCENDING = 3;
    public static final int SORT_GRADE_DESCENDING = 4;
    public static final int SORT_DEFAULT = SORT_DATE_ASCENDING;

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public StudentComparator(int sortType){
        this.sortType = sortType;
    }

    @Override
    public int compare(Student student1, Student student2) {
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = sdf.parse(student1.getDate());
            d2 = sdf.parse(student2.getDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(sortType == SORT_DATE_ASCENDING)
        {
            return (d1.getTime() > d2.getTime() ? 1 : -1);
        }
        else if(sortType == SORT_DATE_DESCENDING)
        {
            return (d1.getTime() > d2.getTime() ? -1 : 1);
        }
        else if(sortType == SORT_GRADE_ASCENDING)
        {
            return student1.getGrade() - student2.getGrade();
        }
        else if(sortType == SORT_GRADE_DESCENDING)
        {
            return student2.getGrade() - student1.getGrade();
        }
        else
            return 0;
    }
}
