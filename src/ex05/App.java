package ex05;

import ex05.teacher.*;

public class App {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        Teacher pt = new PythonTeacher();
        Teacher htt = new HtmlTeacher();

        jt.수업시작();
        pt.수업시작();
        htt.수업시작();
    }
}
