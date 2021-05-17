import java.io.IOException;
import java.util.List;

public class TestWuzzufJobs {
    public void test() throws IOException {
        IO io = new IO();
        List<JobDetails> jobDetails = io.ReadCSVFile("Wuzzuf_Jobs.csv");

        for (JobDetails jobDet : jobDetails) {
            System.out.println(jobDet);
        }
    }
}
