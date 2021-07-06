import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
       String binNum = "";
       for (int i = 0; i < binary.size(); i++) {
          binNum += binary.get(i);
       }
       int binInt = Integer.parseInt(binNum,2);
       return binInt;
    }
}