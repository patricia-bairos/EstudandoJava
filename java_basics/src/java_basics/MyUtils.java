package java_basics;

public class MyUtils {
    public static String printSomeJunk(String argumentos){
//      System.out.println("Teste com String " + argumentos);
        return argumentos;
    }
    public static int printSomeJunk(int argumentos){
//      System.out.println("Teste com int " + argumentos);
        return argumentos;
    }
    public static int sum2Numbers(int firstArg, int secondArg){
        int result = firstArg+100+secondArg+100;
        return result;
    }
    public static int add10(int someArgument){ //métodos void não podem retornar um valor
        int result = someArgument+10;
        return result;
    }
}
