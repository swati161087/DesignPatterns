package creationalDesignPattern.builder.imp2;

import java.security.InvalidParameterException;


public class UserExam {
    int english;
    int math;
    int science;
    String name;
     UserExam(){}
    public static UserExamBuilder getUserExamBuilder(){
        /* outside world such as main method does not know about UserExam builder class so, we need to create
         a method which will return UserExamBuilder object.*/
    return new UserExamBuilder();
    }
    static class UserExamBuilder{
        // inner class has to be static so that to access object of this class we donot required object of outerclass.
        private int english;
        private int math;
        private int science;
        private String name;

        public UserExamBuilder setEnglish(int english) {
            this.english = english;
            return(this); // returining the same object on which the method is applied.
        }

        public UserExamBuilder setMath(int math) {
            this.math = math;
            return(this);
        }

        public UserExamBuilder setScience(int science) {
            this.science = science;
            return(this);
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return(this);
        }

        public UserExam build(){
            // validating parameter of user exam before creating User Exam Object.
            if(english<0 || math<0 || science<0) {
                throw new InvalidParameterException("marks can not be negative");
            }
            if(english+ math+science>300)
            {
                throw new InvalidParameterException("total marks  can not be more than 300");
            }
            if(name.startsWith("0"))
            {
                throw new InvalidParameterException("name cannot starts with 0");
            }
            // create userexam object.
            // now userexambuilder class can access to the private variables of userexam since it is not inside userExam.
            UserExam ue=new UserExam();
            ue.english=this.english;
            ue.math=this.math;
            ue.science=this.science;
            ue.name=this.name;
            return ue;
        }
    }
}
