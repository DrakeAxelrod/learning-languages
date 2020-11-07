public class AnovaCalc {

    private AnovaCalc(){}

    private double calcSum(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum;
    }

    private double calcMean(double[] arr, String message) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        if (!message.isEmpty() || !message.isBlank()) System.out.println(message + sum/arr.length);
        return sum / arr.length;
    }

    private double SSR(double[] arr, double grandMean) {
        double mean = calcMean(arr, "");
        double sum = arr.length*(Math.pow((mean-grandMean), 2));
        return sum;
    }

    private double SSE(double[] arr, double mean) {
        double[] arr2 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Math.pow((arr[i]-mean), 2);
            //System.out.println(" >> here: " + (i+1) + " : " +arr2[i]);
        }
        double sum = calcSum(arr2);
        //System.out.println(" >> Sum of arr: " + sum);
        return sum;
    }

    private double MSR(double num, double dom) {
        System.out.println("MSR: " + num/dom);
        return num/dom;
    }

    private double MSE(double num, double dom) {
        System.out.println("MSE: " + num/dom);
        return num/dom;
    }

    private double calcF(double msr, double mse) {
        System.out.println("F-Value: " + msr/mse);
        return msr/mse;
    }

    public static void main(String[] args) {
        AnovaCalc anova = new AnovaCalc();

        double dft = 1.0; // DFt = k-1 <--- Between Groups
        double dfe = 14.0; // DFe = N-k <--- Within Groups

        // ...........................Replace with your arrays..........//
        double[] a1 = {6.2, 5.8, 5.7, 6.3, 5.9, 6.1, 6.2, 5.7};
        double[] a2 = {6.3, 5.7, 5.9, 6.4, 5.8, 6.2, 6.3, 5.5};

        //........................Add your arrays to the methods below..//
        // means, sse, ssr

        double[] means = {anova.calcMean(a1, "Mean: "), anova.calcMean(a2, "Mean: ")};

        double grandMean = anova.calcMean(means, "Grand Mean: ");

        double[] ssr = { // For calculating SSR (meanX - grandMean)^2 // SSR is SSB
                anova.SSR(a1, grandMean),
                anova.SSR(a2, grandMean)
        };
        double c1 = anova.calcSum(ssr);

        double[] sse = { // For calculating SSE (xij - meanXj)^2 // SSE is SSW
                anova.SSE(a1, means[0]),
                anova.SSE(a2, means[1])
        };
        double c2 = anova.calcSum(sse);

        System.out.println("SSR: " + c1);
        System.out.println("SSE: " + c2);
        double msr = anova.MSR(c1, dft);
        double mse = anova.MSE(c2, dfe);
        anova.calcF(msr, mse);
        //SS =  Sum of Squares
        //MS = Mean Square
    }
}
