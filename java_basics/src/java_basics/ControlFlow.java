package java_basics;

import java.sql.SQLOutput;

public class ControlFlow {
    public static void main(String[] args){

        boolean hungry = false;
        if(!hungry){ //Será avaliado if ou else o que estiver dentro de ().
            System.out.println("I'm starving...");
        } else {
            System.out.println("I'm not hungry.");
        }

        int hungerRating = 5;
        if (!(hungerRating == 5)){
            System.out.println("Not Hungry");
        }else {
            System.out.println("I'm starving");
        }

        int favoriteTemp = 25;
        int currentTemp = 10; //temperatura atual
        String opinion;

        if (favoriteTemp == currentTemp){
            if (currentTemp < (favoriteTemp - 30)){ //se a currentTemp for menor que favoritTemp - 30 / (10 < 25 - 30)
                opinion = "Está muito frio";
            } else if (currentTemp < favoriteTemp){ //se currentTemp for menor que favoritTempo = verdadeiro
                opinion = "Está ótimo";
            } else if (currentTemp > currentTemp) {
                opinion = "Está muito quente";
            } else {
                opinion = "Que belo dia!";
                 }
        }
        else {
            opinion = "Nenhuma das alternativas";
        }
        System.out.println(opinion);

        int month = 4;
        String monthString;

        switch (month){
            case 1: monthString = "Janeiro";
                break;
            case 2: monthString = "Fevereiro";
                break;
            case 3: monthString = "Março";
                break;
            case 4: monthString= "Abril";
                break;
            default: monthString = "Nenhum mês";
                break;
        }
        System.out.println(monthString);
    }
}
