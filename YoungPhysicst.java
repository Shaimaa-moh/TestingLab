package LabAss1;
public class YoungPhysicst {
    public boolean correct_sum(int n, int a[][]) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] >= -100 && a[i][j] <= 100) {
                        sum1 = sum1 + a[i][0];
                        sum2 = sum2 + a[i][1];
                        sum3 = sum3 + a[i][2];
                    } else {
                        System.out.println("incorrect range of coordinates");
                        return false;
                    }
                }
            }
                if (sum1 == 0 && sum2 == 0 && sum3 == 0) {
                    System.out.println("Yes");
                    return true;
                }
                else {
                    System.out.println("NO");
                    return false;
                }
            }
        else {
            System.out.println("out of range of n");
            return false;
        }
    }
}

