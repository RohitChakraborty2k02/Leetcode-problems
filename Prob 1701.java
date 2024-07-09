class Solution {
    public double averageWaitingTime(int[][] customers) {
        double TAT = (customers[0][0] + customers[0][1]) - customers[0][0];
        customers[0][1] = customers[0][0] + customers[0][1];

        for (int i = 1; i < customers.length; i++) {
            double arrival = customers[i][0];
            customers[i][0] = Math.max(customers[i][0], customers[i - 1][1]);
            customers[i][1] = customers[i][0] + customers[i][1];

            TAT += customers[i][1] - arrival;
        }
        return TAT / customers.length;
    }
}