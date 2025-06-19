package Solid_Principle.Factory_adapter;

public class pdf extends Document_fac{
    public Document CreateDocument(){
        return new Pdf();
    }
}