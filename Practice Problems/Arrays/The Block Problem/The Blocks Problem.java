import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TheBlockProblem {
	
	public static int [][] piles;
	public static int [] pilesCount;
	
	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
		piles = new int [n][n];
		pilesCount = new int [n];
		

		for(int i=0; i<piles.length; i++) {
			piles[i][0] = i;
		}
		
		String s;

		while(!(s = br.readLine()).equals("quit")) {
			
			StringTokenizer st = new StringTokenizer(s);
			String op1 = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			String op2 = st.nextToken();
			int b = Integer.parseInt(st.nextToken());

			if(a != b && getPileIndex(a) != getPileIndex(b)) {
				if(op1.equals("move")) {
					if (op2.equals("onto")) {
						int aPileIndex = getPileIndex(a);
						restoreBlocks(aPileIndex,a);
						
						int bPileIndex = getPileIndex(b);
						restoreBlocks(bPileIndex,b);
						
						piles[bPileIndex][pilesCount[bPileIndex]++] = a;
						pilesCount[aPileIndex]--;

					} else if(op2.equals("over")){
						int aPileIndex = getPileIndex(a);
						restoreBlocks(aPileIndex,a);
						
						int bPileIndex = getPileIndex(b);
						piles[bPileIndex][pilesCount[bPileIndex]++] = a;
						pilesCount[aPileIndex]--;
					}
				} else if(op1.equals("pile")) {
					if(op2.equals("onto")) {
						int aPileIndex = getPileIndex(a);
						int bPileIndex = getPileIndex(b);
						restoreBlocks(bPileIndex,b);
						
						int aStart = getBlockIndex(aPileIndex,a);

						for (int i = aStart; i<pilesCount[aPileIndex]; i++) {
							piles[bPileIndex][pilesCount[bPileIndex]++] = piles[aPileIndex][i];
						}
						
						pilesCount[aPileIndex] = aStart;
					} else if (op2.equals("over")){
						int aPileIndex = getPileIndex(a);
						int bPileIndex = getPileIndex(b);
						
						int aStart = getBlockIndex(aPileIndex,a);

						for (int i = aStart; i<pilesCount[aPileIndex]; i++) {
							piles[bPileIndex][pilesCount[bPileIndex]++] = piles[aPileIndex][i];
						}
						
						pilesCount[aPileIndex] = aStart;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i=0; i<piles.length; i++) {
			sb.append(i);
			sb.append(":");

			for (int i2=0; i2<pilesCount[i]; i2++) {
				sb.append(" ");
				sb.append(piles[i][i2]);
			}

			sb.append("\n");
		}

		System.out.print(sb.toString());
	}

	public static int getPileIndex (int zz) {
		for (int i=0; i<piles.length; i++) {
			for (int i2=0; i2<pilesCount[i]; i2++) {
				if (piles[i][i2] == zz) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int getBlockIndex (int pileIndex, int block) {
		for (int i=0; i<pilesCount[pileIndex]; i++) {
			if (piles[pileIndex][i] == block) {
				return i;
			}
		}
		return -1;
	}
	
	public static void restoreBlocks (int pileIndex, int block) {
		int start = getBlockIndex(pileIndex,block)+1;
		for (int i=start; i<pilesCount[pileIndex]; i++) {
			int restore=piles[pileIndex][i];
			piles[restore][pilesCount[restore]++] = restore;
		}
		pilesCount[pileIndex] = start;
	}
}