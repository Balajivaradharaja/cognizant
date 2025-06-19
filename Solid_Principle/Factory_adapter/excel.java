package Solid_Principle.Factory_adapter;

public class excel extends Document_fac{
        public Document CreateDocument(){
            return new Excel();
        }
} 