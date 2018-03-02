import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class ModPow {

	public static long modPow(long x, long y, long mod) {
		long res = 1;
		x = x % mod;
		while(y > 0) {
			if(y % 2 != 0) {
				res = (res * x) % mod;
			}
			y = y >> 1;
			x = (x * x) % mod;
			}
		return res;
		}

	public static long pow(long x, long y) {
		long res = 1;
		while(y > 0) {
			if(y % 2 != 0) {
				res = (res * x);
			}
			y = y >> 1;
			x = (x * x);
			}
		return res;
		}
			
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        	String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
		int mod = Integer.parseInt(st.nextToken());
		long pow = pow(x,y);
		long modP = modPow(x,y,mod);
		bw.write(pow + "");
		bw.newLine();
		bw.write(modP + "");
		bw.close();
		br.close();
	}
}
