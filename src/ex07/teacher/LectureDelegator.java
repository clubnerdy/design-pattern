package ex07.teacher;

import java.util.ArrayList;
import java.util.List;

public class LectureDelegator {
    private List<Teacher> teachers = new ArrayList<>();

    public LectureDelegator() {
        teachers.add(new HistoryTeacher());
        teachers.add(new MathTeacher());
    }

    // for문이랑 stream 둘 중에서 선택해서 사용하면 됌!
    // 단일 진입점
    public void delegate2(LectureType lectureType) {
        for (Teacher teacher : teachers) {
            if (teacher.equals(lectureType)) {
                teacher.doLecture();
            }
        }
    }

    public void delegate(LectureType lectureType) {
        teachers.stream()
                .filter(teacher -> teacher.isSameLecturer(lectureType))
                .forEach(teacher -> teacher.doLecture());
    }
}
