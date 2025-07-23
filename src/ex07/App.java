package ex07;

import ex07.teacher.HistoryTeacher;
import ex07.teacher.LectureDelegator;
import ex07.teacher.LectureType;
import ex07.teacher.MathTeacher;

// 델리게이트
public class App {
    public static void main(String[] args) {
//        MathTeacher mathTeacher = new MathTeacher();
//        mathTeacher.doLecture();
//
//        HistoryTeacher historyTeacher = new HistoryTeacher();
//        historyTeacher.doLecture();

        LectureDelegator lectureDelegator = new LectureDelegator();

        // 1. 수학
        lectureDelegator.delegate(LectureType.MATH);

        // 2. 역사
        lectureDelegator.delegate(LectureType.HISTORY);
    }
}
