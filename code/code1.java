import java.io.*;
import java.util.*;
class code1{
    public static void main (String[] args) throws IOException{
        BufferedReader r=new BufferedReader(new FileReader("code.txt"));
        String line;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        while((line = r.readLine()) != null){

        
        String[] numbers = line.split("   ");
        arr1.add(Integer.parseInt(numbers[0]));
        arr2.add(Integer.parseInt(numbers[1]));
    }
    r.close();
    Collections.sort(arr1);
    Collections.sort(arr2);
    int sum = 0;
    for (int i = 0; i < arr1.size(); i++) {
        sum += Math.abs(arr1.get(i) - arr2.get(i));
    }
    System.out.println(sum);


    }
}