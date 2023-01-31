
/*
Teguh Gumelar
20210040047
Ti21A
PBO Sesi 11
 */
package sesi11;

public class RangeErrorException extends Throwable{

    public RangeErrorException(String s){
        super(s);
    }
    
    public static void main(String[] args){
        int position=1;
        
        try{
            if(position > 0){
                throw new RangeErrorException("Position " + position);
            }
        }
        catch(RangeErrorException e){
            System.out.println("Range error: " + e.getMessage());
        }
        
        System.out.println("This is the last program.");
    }

}