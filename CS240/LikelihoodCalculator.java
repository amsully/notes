import java.util.*;

public class LikelihoodCalculator
{


	static int[][] testValues = 
		{
				{1,	0,	0},
				{1,	1,	1},
				{1,	1,	1},
				{0,	1,	0},
				{0,	1,	1},
				{1,	0,	1},
				{0,	0,	0},
				{1,	0,	0},
				{0,	0,	0},
				{1,	1,  1}
		};

		public static void main(String[] args)
		{

			int probabilityOne = 1;
			int probabilityTwo = 1;

			for(int[] cmf : testValues)
			{
				probabilityOne *= getDoctorOneProbability(cmf);
				probabilityTwo *= getDoctorTwoProbability(cmf);
			}

			System.out.println("Probability ONe: " + probabilityOne);
			System.out.println("Probability Two: " + probabilityTwo);

		}

		public static double getDoctorOneProbability(int[] cmf)
		{

			double probabilityOne = 1;

			if(cmf[0] == 0)
			{
				probabilityOne *= 0;

							if(cmf[1] == 0)
			{

			}
			else
			{
				
			}
			if(cmf[2] == 0)
			{

			}
			else
			{
				
			}
			}
			else
			{

			}


			return 0;
		}

		public static double getDoctorTwoProbability(int[] cmf)
		{
			return 0;
		}
}