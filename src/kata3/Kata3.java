package kata3;

/**
 * @author NassrEML
 */

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.incremet("gmail.com");
        histogram.incremet("google.com");
        histogram.incremet("yahoo.com");
        histogram.incremet("google.com");
        histogram.incremet("google.com");
        histogram.incremet("gmail.com");
        histogram.incremet("yahoo.com");
        histogram.incremet("gmail.com");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
