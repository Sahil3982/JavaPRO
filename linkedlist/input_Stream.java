import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.lang.String;
import java.util.*;

public class input_Stream {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            int byteValue;
            while ((byteValue = inputStream.read()) != -1) {
                // Process the byte data
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
