package com.formation;

// run prog with 2 args
// just dealing with args and type of data
// without exceptions
public class SimpleCalculator {

    public static void main (String[] args){
        if (args[0].contains(".")||args[1].contains(".")){
            double firstFigure = Double.parseDouble(args[0]);
            double secondFigure = Double.parseDouble(args[1]);
            System.out.println(firstFigure+secondFigure);
        }
        else
        {
            int firstFigure = Integer.parseInt(args[0]);
            int secondFigure = Integer.parseInt(args[1]);
            System.out.println(firstFigure+secondFigure);

        }


    }

}
