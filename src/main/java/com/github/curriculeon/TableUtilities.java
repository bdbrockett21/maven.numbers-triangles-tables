package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return(getMultiplicationTable(5));
    }

    public static String getLargeMultiplicationTable() {
        return(getMultiplicationTable(5));
    }


    public static String getMultiplicationTable(int tableSize) {
        String table ="";
        int size=tableSize;
        int row = 1;
        while(row<=size){
            int count =1;
            int num;
            while(count<-size){
                num = count*row;
                if(num<10){
                    table+= (" "+num+" |");
                }else if(num<100){
                    table+= (" "+num+" |");
                }
                else{
                    table += (" "+num+" |");
                }
                count++;
            }
            table+="\n";
            row+=1;
        }
        return table;
    }
}
