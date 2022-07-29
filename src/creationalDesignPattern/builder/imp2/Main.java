package creationalDesignPattern.builder.imp2;

public class Main {
    public static void main(String[] args) {
        // Method Chaining
        UserExam u=UserExam.getUserExamBuilder()
                                            .setEnglish(45)
                                            .setMath(78)
                                            .setScience(56)
                                            .setName("kskdf")
                                            .build();

    }
}
