package creationalDesignPattern.builder.imp1;

public class Main {
    public static void main(String[] args) {
        Parameter u=new Parameter();
        u.name="swati";
        u.english=23;
        u.math=45;
        UserExam ue=new UserExam(u);
    }
}
