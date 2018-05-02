package william.chamberlain.utils;

/**
 * Created by will on 23/07/17.
 */

public class StringUtil {

    public static String toString(float[] a, int numToConvert) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i<numToConvert ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
        return b.toString();
    }

    public static String toStringByRows(float[] a, int numPerRow) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if(0== i%numPerRow) {
                b.append("\n");
            }
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    public static void main(String[] args) {
        float[] someRot = {1,2,3,4,5,6,7,8,9};
        System.out.println(toStringByRows(someRot,3));
    }

}
