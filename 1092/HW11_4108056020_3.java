public class HW11_4108056020_3 extends GroupCounting{
	final byte CORE = 5, FREQ = 1<<CORE, TLEN = FREQ-1;
	final Thread[] T = new Thread[TLEN];
	volatile static int nodeN, unionN, UNION[];
	public synchronized int count(final String[] A, final String[] B){
		final int LEN = A.length, END = LEN-1;
		nodeN = unionN = 0; UNION = new int[2000000];
		for(byte ti=0; ti<TLEN; ++ti){ final byte t = ti; T[t] = new Thread(()->{
			for(int i=END-t, a, b, tmp; i>-1; i-=FREQ){
				synchronized(UNION){
					if(UNION[a = Integer.parseInt(A[i])+1] != 0){
						for(tmp = a; UNION[tmp] > -1; tmp = UNION[tmp]);
						for(int j, k = a; k != tmp; j = UNION[k], UNION[k] = tmp, k = j);
						a = tmp;
					}else{ UNION[a] = -1; nodeN++; }
					if(UNION[b = Integer.parseInt(B[i])+1] != 0){
						for(tmp = b; UNION[tmp] > -1; tmp = UNION[tmp]);
						for(int j, k = b; k != tmp; j = UNION[k], UNION[k] = tmp, k = j);
						b = tmp;
					}else{ UNION[b] = -1; nodeN++; }
					if(a == b) continue;
					if(UNION[a] > UNION[b])
					    { UNION[b] += UNION[a]; UNION[a] = b; }
					else{ UNION[a] += UNION[b]; UNION[b] = a; }
					unionN++;
				}
			}
		}); T[t].start();}
		for(int i = END-TLEN, a, b, tmp; i>-1; i-=FREQ){
			synchronized(UNION){
				if(UNION[a = Integer.parseInt(A[i])+1] != 0){
					for(tmp = a; UNION[tmp] > -1; tmp = UNION[tmp]);
					for(int j, k = a; k != tmp; j = UNION[k], UNION[k] = tmp, k = j);
					a = tmp;
				}else{ UNION[a] = -1; nodeN++; }
				if(UNION[b = Integer.parseInt(B[i])+1] != 0){
					for(tmp = b; UNION[tmp] > -1; tmp = UNION[tmp]);
					for(int j, k = b; k != tmp; j = UNION[k], UNION[k] = tmp, k = j);
					b = tmp;
				}else{ UNION[b] = -1; nodeN++; }
				if(a == b) continue;
				if(UNION[a] > UNION[b])
					{ UNION[b] += UNION[a]; UNION[a] = b; }
				else{ UNION[a] += UNION[b]; UNION[b] = a; }
				unionN++;
			}
		}
		try{ for(final Thread t : T) t.join(); }
		catch(InterruptedException __){}
		catch(ThreadDeath __){}
		return nodeN-unionN;
	}
}