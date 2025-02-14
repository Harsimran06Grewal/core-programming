public class Profit {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        //calculating profit
        int profit = sellingPrice - costPrice;

        //calculating loss
        int loss = costPrice - sellingPrice;

        //calculating profit percentage
        float profitPercentage = (float) profit / costPrice * 100;

        //calculating loss percentage
        float lossPercentage = (float) loss / sellingPrice * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);

    }
}
