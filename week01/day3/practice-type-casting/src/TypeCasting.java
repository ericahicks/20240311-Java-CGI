public class TypeCasting {

    public static void main(String[] args) {
        // byte
        byte b = 1; // the compiler knows 1 
        b = 127; 
        // b = 128; // Type mismatch: cannot convert from int to byte 
        b = (byte) 128; 

        short sh = 1;
        sh = 32000;
        // sh = 40000; // Type mismatch: cannot convert from int to short
        sh = (short) 40000;

        float f = 1;
        // f = 1.5; // decimals interpreted as doubles
        // Type mismatch: cannot convert from double to float
        f = (float) 1.5;
        f = 1.5f;

        
    }

}
