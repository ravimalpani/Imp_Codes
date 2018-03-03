import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class FactorialOfBigNumber {
    
    public static int factorialOfBigNumber(int arr[],int value, int m) {
        
        int temp = 0;
        for(int i = 0; i < m; i++) {
            int newValue = arr[i] * value + temp;
            arr[i] = newValue % 10;
            temp = newValue/10;
        }
        if(temp > 0) {
            while(temp > 0) {
                arr[m++] = temp%10;
                temp = temp / 10;
            }
        }
        return m;
    }
    
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        int arr[] = new int[200];
        arr[0] = 1;
        int m = 1;
        for(int i = 1; i <= T; i++) {
            m = factorialOfBigNumber(arr,i,m);
        }
        for(int i = m-1; i >= 0; i--) {
            bw.write(arr[i]+"");
        }
        bw.newLine();
        br.close();
        bw.close();
        
    }
}
