package src;

public class exercise1{
    public static void main (String args[]){

        int table[][]=new int[10][10];
        int row=1,column=1;

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                table[i][j]=row*column;
                column=column+1;
            }
            row=row+1;
            column=1;
        }

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                System.out.println((i+1)+ "*"+ (j+1) + "=" + table[i][j]);
            }
            System.out.println("_____________________________");
        }
    }
}
