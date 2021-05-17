import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public List<JobDetails> ReadCSVFile(String FileName) throws IOException {
        List<JobDetails> details = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            String line = "";
            String[] attributes;
            JobDetails jd;
            while ((line = br.readLine()) != null) {
                attributes = line.split(",");
                jd = new JobDetails(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5], attributes[6], attributes[7]);
                details.add(jd);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return details;
    }
}
