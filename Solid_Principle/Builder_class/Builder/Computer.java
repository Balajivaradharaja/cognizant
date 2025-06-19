package Solid_Principle.Builder_class.Builder;

public class Computer {
    private String Cpu;
    private String Ram;
    private String  Storage;
    private Computer (Builder builder){
            this.Cpu=builder.Cpu;
            this.Ram=builder.Ram;
            this.Storage=builder.Storage;
    }
 public String getcpu(){return Cpu;}
 public String getRam(){return Ram;}
 public String getStorage(){return Storage;}



@Override
public String toString(){
    return "Computer[Cpu="+ Cpu +", Ram ="+Ram+",Storage="+Storage+"]";
}
public static  class Builder{
    private String Cpu;
    private String Ram;
    private String  Storage;
    public   Builder(String Cpu,String Ram){
        this.Cpu=Cpu;
        this.Ram=Ram;
    }
    public Builder setStorage(String Storage){
            this.Storage=Storage;
            return this;
    }
    public Computer build(){
        return new Computer(this);
    }
}

}