class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }

}
public class CustomException {
    static void checkAge(int age)  throws InvalidAgeException{
        if(age> 18){
            throw new InvalidAgeException("age must be greater than 10=8+");

        }
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(17);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    
}
