package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] original = {-3,2,6,-11};
        int [] cumulative = new int[original.length];
        for (int index = 0; index<= original.length-1; index++)
        {
            int sum = 0;
            for(int tracker = index; tracker>=0; tracker--)
            {
                sum = sum + original[tracker];
            }
            cumulative[index] = sum;
        }
        for(int element: cumulative)
        {
            System.out.print(element +  " ");
        }
    }
}
