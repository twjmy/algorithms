public class HW09_4108056020_1 extends LSD {
    final class SetNode {
        final SetNode NEXT; final int K, V;
        SetNode(final SetNode next, final int k, final int v) {
            NEXT = next; K = k; V = v;
        }
    }
    final class AdjNode {
        final AdjNode NEXT; final int K; int N = 0, A[] = new int[0x10];
        AdjNode(final AdjNode next, final int k, final int v) {
            NEXT = next; K = k; A[0] = v;
        }
    }
    final public int Distance(final int[][] iA) {
        int i, max = -1, maxK = -1, head = 0, tail = 0;
        final int END = (1<<32-Integer.numberOfLeadingZeros(iA.length-1))-1, queue[] = new int[END+1],
                AEND = (1<<32-Integer.numberOfLeadingZeros(iA.length<<1))-1;
        final AdjNode[] ADJ = new AdjNode[AEND+1]; AdjNode ant; boolean put;
        for (final int[] n : iA) {
            final int a = n[0], b = n[1];
            for (put = true, ant = ADJ[a&AEND]; ant != null; ant = ant.NEXT) {
                if (ant.K == a) {
                    final AdjNode AN = ant;
                    if (++AN.N > max) { maxK = a; max = AN.N; }
                    if (AN.N == AN.A.length) {
                        final int[] newList = new int[AN.N<<1];
                        System.arraycopy(AN.A, 0, newList, 0, AN.N);
                        AN.A = newList;
                    }
                    AN.A[AN.N] = b;
                    put = false; break;
                }
            }
            if(put) ADJ[a&AEND] = new AdjNode(ADJ[a&AEND], a, b);
            for (put = true, ant = ADJ[b&AEND]; ant != null; ant = ant.NEXT) {
                if (ant.K == b) {
                    final AdjNode AN = ant;
                    if (++AN.N > max) { maxK = b; max = AN.N; }
                    if (AN.N == AN.A.length) {
                        final int[] newList = new int[AN.N<<1];
                        System.arraycopy(AN.A, 0, newList, 0, AN.N);
                        AN.A = newList;
                    }
                    AN.A[AN.N] = a;
                    put = false; break;
                }
            }
            if(put) ADJ[b&AEND] = new AdjNode(ADJ[b&AEND], b, a);
        }
        max = -1; SetNode snt;
       {final SetNode SET[] = new SetNode[END+1];
        SET[maxK&END] = new SetNode(SET[maxK&END], maxK, 1);
        queue[tail] = maxK; tail = (tail+1)&END;
        while (head != tail) {
            maxK = queue[head]; head = (head+1)&END;
            for (i = 1, snt = SET[maxK&END]; snt != null; snt = snt.NEXT)
                if (snt.K == maxK){ i = snt.V + 1; break; }
            final int depth = i;
            if (depth > max) max = depth;
            for (ant = ADJ[maxK&AEND]; ant != null && ant.K != maxK; ant = ant.NEXT);
            final int N = ant.N+1, A[] = ant.A;
            for (i = 0; i < N;) {
                final int K = A[i++];
                for (put = true, snt = SET[K&END]; snt != null; snt = snt.NEXT)
                    if (snt.K == K){ put = false; break; }
                if(put){
                    SET[K&END] = new SetNode(SET[K&END], K, depth);
                    queue[tail] = K; tail = (tail+1)&END;
                }
            }
        }}
        final SetNode SET[] = new SetNode[END+1];
        SET[maxK&END] = new SetNode(SET[maxK&END], maxK, 1);
        queue[tail] = maxK; tail = (tail+1)&END;
        while (head != tail) {
            maxK = queue[head]; head = (head+1)&END;
            for (i = 1, snt = SET[maxK&END]; snt != null; snt = snt.NEXT)
                if (snt.K == maxK){ i = snt.V + 1; break; }
            final int depth = i;
            if (depth > max) max = depth;
            for (ant = ADJ[maxK&AEND]; ant != null && ant.K != maxK; ant = ant.NEXT);
            final int N = ant.N+1, A[] = ant.A;
            for (i = 0; i < N;) {
                final int K = A[i++];
                for (put = true, snt = SET[K&END]; snt != null; snt = snt.NEXT)
                    if (snt.K == K){ put = false; break; }
                if(put){
                    SET[K&END] = new SetNode(SET[K&END], K, depth);
                    queue[tail] = K; tail = (tail+1)&END;
                }
            }
        }
        return max-2;
    }
}