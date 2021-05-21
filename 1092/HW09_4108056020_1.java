public class HW09_4108056020_1 extends LSD {
    final int setGet(final int k) {
        for (SetNode c = set[k&cap]; c != null; c = c.next) {
            if (c.key == k)
                return c.val;
        }
        return 0;
    }

    final Bag adjGet(final int n) {
        for (AdjNode c = adjList[n&adjList_cap]; c != null; c = c.next) {
            if (c.key == n)
                return c.val;
        }
        return null;
    }

    final class SetNode {
        final int key, val;
        final SetNode next;

        SetNode(final int k, final int v) {
            val = v;
            next = set[(key = k)&cap];
        }
    }

    final class AdjNode {
        int degree;
        final int key;
        final Bag val;
        final AdjNode next;

        AdjNode(final int n, final int subnode) {
            (val = new Bag()).add(subnode);
            next = adjList[(key = n)&adjList_cap];
        }
    }

    final class Bag {
        int N, list[];

        Bag() {
            N = -1;
            list = new int[16];
        }

        final void add(final int n) {
            if (++N == list.length) {
                final int[] newList = new int[list.length<<1];
                System.arraycopy(list, 0, newList, 0, N);
                list = newList;
            }
            list[N] = n;
        }
    }

    final static int nextBinaryNumber(int i){
        int n = 31;
        if (i > 65535) { n -= 16; i >>>= 16; }
        if (i >   255) { n -=  8; i >>>=  8; }
        if (i >    15) { n -=  4; i >>>=  4; }
        if (i >     4) { n -=  2; i >>>=  2; }
        return 1 << 32 - n - (i >>> 1);
    }

    int maxDepth, maxDegree, maxDepthNode, maxDegreeNode, adjList_cap, cap, head, tail;
    AdjNode[] adjList; SetNode[] set;

    final public int Distance(final int[][] A) {
        final int LEN = A.length;
        maxDegree = maxDegreeNode = -1; maxDepth = head = tail = 0;
        adjList_cap = nextBinaryNumber((LEN<<1)-1);
        cap = nextBinaryNumber(LEN-1);
        adjList = new AdjNode[adjList_cap--];
        set = new SetNode[cap];
        final int[] queue = new int[cap--];

        boolean put;

        for (final int[] v : A) {
            final int a = v[0], b = v[1];
            put = true;
            for (AdjNode c = adjList[a&adjList_cap]; c != null; c = c.next) {
                if (c.key == a) {
                    if (++c.degree > maxDegree) {
                        maxDegree = c.degree;
                        maxDegreeNode = a;
                    }
                    c.val.add(b);
                    put = false;
                    break;
                }
            }
            if(put) adjList[a&adjList_cap] = new AdjNode(a, b);

            put = true;
            for (AdjNode c = adjList[b&adjList_cap]; c != null; c = c.next) {
                if (c.key == b) {
                    if (++c.degree > maxDegree) {
                        maxDegree = c.degree;
                        maxDegreeNode = b;
                    }
                    c.val.add(a);
                    put = false;
                    break;
                }
            }
            if(put) adjList[b&adjList_cap] = new AdjNode(b, a);
        }

        set[maxDegreeNode&cap] = new SetNode(maxDegreeNode, 1);

        queue[tail] = maxDegreeNode;
        tail = (tail+1)&cap;

        while (head != tail) {
            maxDegreeNode = queue[head];
            head = (head+1)&cap;
            final int self_depth = setGet(maxDegreeNode)+1;
            if (self_depth > maxDepth) {
                maxDepth = self_depth;
                maxDepthNode = maxDegreeNode;
            }

            final Bag arr = adjGet(maxDegreeNode);
            for (int i=0; i <= arr.N;) {
                final int n = arr.list[i++];
                put = true;
                for (SetNode c = set[n&cap]; c != null; c = c.next) {
                    if (c.key == n){
                        put = false;
                        break;
                    }
                }
                if(put){
                    set[n&cap] = new SetNode(n, self_depth);
                    queue[tail] = n;
                    tail = (tail+1)&cap;
                }
            }
        }

        set = new SetNode[cap+1];

        set[maxDepthNode&cap] = new SetNode(maxDepthNode, 1);

        queue[tail] = maxDepthNode;
        tail = (tail+1)&cap;

        while (head != tail) {
            maxDepthNode = queue[head];
            head = (head+1)&cap;
            final int self_depth = setGet(maxDepthNode)+1;
            if (self_depth > maxDepth)
                maxDepth = self_depth;

            final Bag arr = adjGet(maxDepthNode);
            for (int i=0; i <= arr.N;) {
                final int n = arr.list[i++];
                put = true;
                for (SetNode c = set[n&cap]; c != null; c = c.next) {
                    if (c.key == n){
                        put = false;
                        break;
                    }
                }
                if(put){
                    set[n&cap] = new SetNode(n, self_depth);
                    queue[tail] = n;
                    tail = (tail+1)&cap;
                }
            }
        }

        return maxDepth-2;
    }
}