public class HW09_4108056020_1 extends LSD {
    final class SetNode {
        final SetNode NEXT;
        final int K, V;

        SetNode(final int k, final int v) {
            NEXT = set[(K = k)&cap];
            V = v;
        }
    }

    final class AdjNode {
        final AdjNode NEXT;
        final int K;
        int N = 0, list[] = new int[0x10];

        AdjNode(final int k, final int v) {
            NEXT = adj[(K = k)&acap];
            list[0] = v;
        }
    }

    AdjNode[] adj; SetNode[] set; int acap, cap;

    final public int Distance(final int[][] A) {
        int max, maxK, head, tail, i; max = maxK = -1; head = tail = 0;
        final int queue[] = new int[(cap = 1<<32-Integer.numberOfLeadingZeros(A.length-1))], cap = --this.cap;
        adj = new AdjNode[(acap = 1<<32-Integer.numberOfLeadingZeros((A.length<<1)-1))]; final int acap = --this.acap;

        boolean put; AdjNode ant; SetNode snt;

        for (final int[] v : A) {
            final int a = v[0], b = v[1];

            for (put = true, ant = adj[a&acap]; ant != null; ant = ant.NEXT) {
                if (ant.K == a) {
                    final AdjNode AN = ant;
                    if (++AN.N > max) { maxK = a; max = AN.N; }
                    if (AN.N == AN.list.length) {
                        final int[] newList = new int[AN.N<<1];
                        System.arraycopy(AN.list, 0, newList, 0, AN.N);
                        AN.list = newList;
                    }
                    AN.list[AN.N] = b;
                    put = false;
                    break;
                }
            }
            if(put) adj[a&acap] = new AdjNode(a, b);

            for (put = true, ant = adj[b&acap]; ant != null; ant = ant.NEXT) {
                if (ant.K == b) {
                    final AdjNode AN = ant;
                    if (++AN.N > max) { maxK = b; max = AN.N; }
                    if (AN.N == AN.list.length) {
                        final int[] newList = new int[AN.N<<1];
                        System.arraycopy(AN.list, 0, newList, 0, AN.N);
                        AN.list = newList;
                    }
                    AN.list[AN.N] = a;
                    put = false;
                    break;
                }
            }
            if(put) adj[b&acap] = new AdjNode(b, a);
        }

        max = -1;

        (set = new SetNode[cap+1])[maxK&cap] = new SetNode(maxK, 1);

        queue[tail] = maxK; tail = (tail+1)&cap;

        while (head != tail) {
            maxK = queue[head]; head = (head+1)&cap;

            for (i = 1, snt = set[maxK&cap]; snt != null; snt = snt.NEXT)
                if (snt.K == maxK){ i = snt.V + 1; break; }

            final int depth = i;
            if (depth > max) max = depth;

            for (ant = adj[maxK&acap]; ant != null && ant.K != maxK; ant = ant.NEXT);
            final int N = ant.N+1, list[] = ant.list;
            for (i = 0; i < N;) {
                final int K = list[i++];
                for (put = true, snt = set[K&cap]; snt != null; snt = snt.NEXT)
                    if (snt.K == K){ put = false; break; }
                if(put){
                    set[K&cap] = new SetNode(K, depth);
                    queue[tail] = K; tail = (tail+1)&cap;
                }
            }
        }

        (set = new SetNode[cap+1])[maxK&cap] = new SetNode(maxK, 1);

        queue[tail] = maxK;
        tail = (tail+1)&cap;

        while (head != tail) {
            maxK = queue[head]; head = (head+1)&cap;

            for (i = 1, snt = set[maxK&cap]; snt != null; snt = snt.NEXT)
                if (snt.K == maxK){ i = snt.V + 1; break; }

            final int depth = i;
            if (depth > max) max = depth;

            for (ant = adj[maxK&acap]; ant != null && ant.K != maxK; ant = ant.NEXT);
            final int N = ant.N+1, list[] = ant.list;
            for (i = 0; i < N;) {
                final int K = list[i++];
                for (put = true, snt = set[K&cap]; snt != null; snt = snt.NEXT)
                    if (snt.K == K){ put = false; break; }
                if(put){
                    set[K&cap] = new SetNode(K, depth);
                    queue[tail] = K; tail = (tail+1)&cap;
                }
            }
        }

        return max-2;
    }
}