package sem2hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class task1 {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new FileReader("json.txt"));
        String str, temp;
        StringBuilder tempStr = new StringBuilder();
        int count = 0;
        str = br.readLine();
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        String [] tempArr = new String[count];
        System.out.printf("str = %s", str);
        System.out.println();
        temp = str.replace("{", "")
        .replace("}", "")
        .replace(":", ", ")
        .replace("\"", "")
        .replace(" ", "");
        System.out.println(temp);
        tempArr = temp.split(",");
        System.out.println(Arrays.toString(tempArr));
        tempStr.append("Select ").append("* ").append("from ").append("students ").append("where ");
        for (int i = 1; i < tempArr.length ; i+=2) {
            if (tempArr[i].equals("null")) {
                i += 2;
            }else{
                tempStr.append("'").append(tempArr[i - 1]).append("=").append(tempArr[i]).append("'");
            }
            if (i < tempArr.length / 2) {
                tempStr.append(" and ");
            }
        }
        System.out.println();
        System.out.println(tempStr);
    }
}