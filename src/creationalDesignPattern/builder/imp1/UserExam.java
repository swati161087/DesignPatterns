package creationalDesignPattern.builder.imp1;

import java.security.InvalidParameterException;

class Parameter{
    int english;
    int math;
    int science;
    String name;

}
public class UserExam {
    int english;
    int math;
    int science;
    String name;
    UserExam(Parameter user){
        this.english=user.english;
        this.math= user.math;
        this.science=user.science;
        this.name=user.name;
        if(this.english<0 || this.math<0 || this.science<0) {
            throw new InvalidParameterException("marks can not be negative");
        }
        if(this.english+ this.math+this.science>300)
        {
            throw new InvalidParameterException("total marks  can not be more than 300");
        }
    }
}
