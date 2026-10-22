class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int total = 0;
        int monday = 1;

        for (int week = 0; week < n / 7; week++) {
            for (int day = 0; day < 7; day++) {
                total += monday + day;
            }
            monday++;
        }

        int remaining = n % 7;

        for (int day = 0; day < remaining; day++) {
            total += monday + day;
        }

        return total;
    }
}