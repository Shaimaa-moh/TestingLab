package LabAss1;
public class Watermelon {
    public boolean getEven(int n) {
        if (n >= 1 && n <= 100) {
            if (n > 2 && n % 2 == 0) {
            System.out.println("Yes it is correct division");
                return true;
            } else
            {
                System.out.println("NO it isnot correct division");
                return false;
            }
        } else {
            System.out.println("weight should be between 1 and 100");
            return false;
        }
    }
}


