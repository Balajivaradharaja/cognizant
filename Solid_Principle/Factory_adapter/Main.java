package Solid_Principle.Factory_adapter;


public class Main {
    public static void main(String[] args){
        Document_fac a=new worddocument();
        Document words=a.CreateDocument();
        words.open();
        Document_fac b=new pdf();
        Document pdfs=b.CreateDocument();
        pdfs.open();
        Document_fac c=new excel();
        Document excels=c.CreateDocument();
        excels.open();
        

    }
    
}
