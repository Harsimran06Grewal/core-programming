public class DistributePen {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        //calculating for pens to be equally distributed
        int distributePens = totalPens / students;

        //calculating remaining pens after equal distribution of pens
        int remainingPens = totalPens % students;

        System.out.println("The Pen Per Student is " + distributePens + " and the remaining pen not distributed is " + remainingPens);
    }
}
