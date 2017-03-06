import java.util.ArrayList;

/*
 * Created by bigbilii on 2016/12/22.
 */
public class RotateFunction {
    private int maxRotateFunction(int[] A) {
        int length = A.length;
        if(length == 0) {
            return 0;
        }
        int[] f = new int[length];
        ArrayList<Integer> a = new ArrayList<>();

        for (int i : A)
            a.add(A[i]);

        for (int i = 0; i < length; i++) {
            f[i] = RotateFunction.fun(a,length);
            a.add(0,a.get(a.size() - 1));
            a.remove(a.size() - 1);
        }

        return RotateFunction.max(f,length);
    }

    private static int max(int[] f,int length) {
        int max = f[0];
        for (int i = 1; i < length; i++) {
            if (f[i] > max) {
                max = f[i];
            }
        }
        return max;
    }
    
    private static int fun(ArrayList<Integer> x,int length) {
        int num = 0;
        for (int i = 0; i < length; i ++) {
            num += (i * x.get(i));
        }
        return num;
    }


}
