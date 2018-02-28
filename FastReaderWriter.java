import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class FastReaderWriter
	{
		BufferedReader br;
		BufferedWriter bw;
		StringTokenizer st;

		public FastReaderWriter()
		{
			br = new BufferedReader(new
					InputStreamReader(System.in));
            bw = new BufferedWriter(new
                    OutputStreamWriter(System.out));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}

	 	void write(String value) {
			try
			{
				bw.write(value);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		void writeln(String value) {
		    try
			{
				bw.write(value);
				bw.newLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		void close(){
			try
			{
				br.close();
		    		bw.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	public static void main(String[] args)
	{
		FastReaderWriter s=new FastReaderWriter();
		int n = s.nextInt();
		int k = s.nextInt();
		s.writeln(n+ "");
		s.write(k+"");
		s.close();
	}
}
