package creationalDesignPattern.prototype.registry;

public  class Bird implements Clonable<Bird>{
   private String name;
   private int weight;
   private String color;
   Bird(){}
   public Bird(Bird old){
     this.name=old.name;
     this.weight= old.weight;
     this.color=old.color;
   }
    @Override
     public Bird copy(){
       return new Bird(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
