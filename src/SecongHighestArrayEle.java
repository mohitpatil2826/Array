public class SecongHighestArrayEle {
    public static void main(String[] args) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int [] array = new int [] {1, 2, 3,3 ,8,84, 4,5,7,7};
        for (int i = 0; i < array.length; i++) {
         if (array[i] > highest) {
            secondHighest = highest;
                highest = array[i];
            }
            else if (array[i] > secondHighest)
                 secondHighest = array[i];
              }
        System.out.println(secondHighest);
    }
}
