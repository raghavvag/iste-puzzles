import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class code2 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
        ArrayList<Integer> leftList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("   ");
                if (parts.length > 1) {
                    
                    int key = Integer.parseInt(parts[0]);
                    leftList.add(key);

                   
                    int number = Integer.parseInt(parts[1]);
                    numberFrequency.put(number, numberFrequency.getOrDefault(number, 0) + 1);
                }
            }
        }

        int sum = 0;
        for (int num : leftList) {
            if (numberFrequency.containsKey(num)) {
                sum += num * numberFrequency.get(num);
            }
        }

        System.out.println(sum);
    }
}
