package java_basics;

public class LearningArrays {
    public static void main (String[]args){
        int values;
        values = 1; //Essa é uma variável apontada para um único ponto de dados

        int [] values1 = new int[100];
        /*
        Estou dizendo que values1 é uma variável do tipo array inteiro "int [] values1"
        Portanto, uma matriz permite armazenar vários elementos [100], ou seja, essa matriz poderá armazenar 100 elementos
        */
        values1[0] = 1;
        values1[99] = 100;
        /*
        A primeira posição do índice começa em 0, até os 100 - 1 = 99, ou seja, são 99 índices
        Não é possível armazenar elementos de outros tipos de dados como "String" por exemplo. Esta é uma matriz de números inteiros
        */

        System.out.println(values1[99]);

        String [] words = new String[] {"Meu", "Nome", "é","Teste"};
        //Qual é a posição do terceiro slot "é"?
        System.out.println(words[3]);

    }
}
