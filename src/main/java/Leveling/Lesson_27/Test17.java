package Leveling.Lesson_27;

public class Test17 {
    //Создание собственного исключения
    //При написании кода, можно создавать свои собственные исключения. В зависимости от необходимости, создаются исключения,
    // которые наследуются от классов Exception или RuntimeException
    void marafon (int temperaturaVozduxa, int tempBega) throws PodvernutNoguException{
        if (tempBega > 12){
            throw new PodvernutNoguException("Temp bega bil sliwkom visokim: "+ tempBega);
        }
        if (temperaturaVozduxa > 32){
            throw new SveloMishcuException();
        }
        System.out.println("Vi probejali marafon");
    }

    public static void main(String[] args) {
        Test17 t = new Test17();
        try {
            t.marafon(20, 13);
        }
        catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("V lubom sluchae vi poluchite gramotu!!!");
        }
    }
}


class PodvernutNoguException extends Exception{
    PodvernutNoguException (String message){
    super(message);}
    PodvernutNoguException(){}
}

class SveloMishcuException extends RuntimeException{
    SveloMishcuException (String message){
        super(message);}
    SveloMishcuException(){}
}
