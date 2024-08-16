public class BillingCalculator {

    public static void main(String[] args) {
        // Initial airtime loaded by the subscriber in UGX
        double initialAirtime = 10000.0;
        
        // Percentage charged by the telecom company on loaded airtime
        double chargePercentage = 10.0 / 100.0;
        
        // Cost per second of making a call in UGX
        int costPerSecond = 200;
        
        // Duration of the call in seconds (5 minutes = 300 seconds)
        int callDurationSeconds = 5 * 60;
        
        // Calculate the amount charged by the telecom company on loading airtime
        double airtimeCharge = initialAirtime * chargePercentage;
        
        // Calculate the remaining balance after the loading charge is applied
        double balanceAfterLoading = initialAirtime - airtimeCharge;
        
        // Calculate the total cost of the call
        int callCost = costPerSecond * callDurationSeconds;
        
        // Calculate the remaining balance after making the call
        double finalBalance = balanceAfterLoading - callCost;
        
        // Output the final balance of the subscriber
        System.out.println("Final balance after loading UGX 10,000 and making a 5-minute call: UGX " + finalBalance);
    }
}
