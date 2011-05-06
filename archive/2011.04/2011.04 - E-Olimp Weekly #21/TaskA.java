package April2011.EOlympWeekly21;

import net.egork.utils.Solver;
import net.egork.utils.io.InputReader;

import java.io.PrintWriter;

public class TaskA implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		char[] number = in.readString().toCharArray();
		int startIndex = number[0] == '-' ? 1 : 0;
		for (int i = startIndex; i < number.length; i++)
			out.println(number[i]);
	}
}
