package base.questions;

public class RangeIsOverlap {
    public static void main(String[] args) {
        int[] arr1 = {2,5};
        int[] arr2 = {4,10};

        boolean isOverlap = isOverlap(arr1, arr2);
        System.out.printf("Array is overlap ? %b", isOverlap);
    }

    /**
     *
     * @param firstArr
     * @param secondArr
     *   2-----5
     *      4------10
     * @return true if overlap
     */
    public static boolean isOverlap(int[] firstArr, int[] secondArr) {
        // An overlap occurs if:
        // The first interval starts before the second one ends
        // AND the second interval starts before the first one ends.
        // 2 <= 10 (True) AND 4 <= 5 (True) -> Overlap!
        return (firstArr[0] <= secondArr[1] && secondArr[0] <= firstArr[1]);
    }
}
