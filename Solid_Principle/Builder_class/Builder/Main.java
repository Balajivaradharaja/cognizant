package Solid_Principle.Builder_class.Builder;

public class Main {
    public static void main(String[] args){
    Computer a=new Computer.Builder("Intel i3","16GB").setStorage("556gb").build();
    System.out.println("SPEC OF COMPUTER\n"+a);

    }
}
