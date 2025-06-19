package Solid_Principle.Factory_adapter;

public class worddocument extends Document_fac {
    public Document CreateDocument(){
        return new Word();
    }
    
}
