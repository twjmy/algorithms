public class HW09_4108056020_1 extends LSD {
    final class AdjNode {
        int dist;
        final int key;
        final Bag val;
        final AdjNode next;

        AdjNode(final int n, final int subnode) {
            val = new Bag(subnode);
            next = adjList[(key = n)&adjList_cap];
        }
    }

    final class SetNode {
        final int key, val;
        final SetNode next;

        SetNode(final int k, final int v) {
            val = v;
            next = set[(key = k)&cap];
        }
    }

    final class Bag {
        int N = -1, list[];

        Bag(int n) { list = new int[16]; add(n); }

        final void add(final int n) {
            if (++N == list.length) {
                final int[] newList = new int[list.length<<1];
                System.arraycopy(list, 0, newList, 0, N);
                list = newList;
            }
            list[N] = n;
        }
    }

    int maxDepth, maxDegree, maxDepthNode, maxDegreeNode, adjList_cap, cap, head, tail;
    AdjNode[] adjList; SetNode[] set;

    final public int Distance(final int[][] A) {
        final int LEN = A.length;
        maxDegree = maxDegreeNode = -1; maxDepth = head = tail = 0;

        int self_deptht = 31; adjList_cap = (LEN<<1)-1;
        if (adjList_cap >= 1 << 16 ) { self_deptht -= 16; adjList_cap >>>= 16; }
        if (adjList_cap >= 1 <<  8 ) { self_deptht -=  8; adjList_cap >>>=  8; }
        if (adjList_cap >= 1 <<  4 ) { self_deptht -=  4; adjList_cap >>>=  4; }
        if (adjList_cap >= 1 <<  2 ) { self_deptht -=  2; adjList_cap >>>=  2; }
        adjList_cap = 1 << 32 - self_deptht - (adjList_cap >>> 1);

        self_deptht = 31; cap = LEN-1;
        if (cap >= 1 << 16 ) { self_deptht -= 16; cap >>>= 16; }
        if (cap >= 1 <<  8 ) { self_deptht -=  8; cap >>>=  8; }
        if (cap >= 1 <<  4 ) { self_deptht -=  4; cap >>>=  4; }
        if (cap >= 1 <<  2 ) { self_deptht -=  2; cap >>>=  2; }
        cap = 1 << 32 - self_deptht - (cap >>> 1);

        adjList = new AdjNode[adjList_cap--];
        set = new SetNode[cap];
        final int[] queue = new int[cap--];

        boolean put; AdjNode ant; SetNode snt; Bag bagt;

        for (final int[] i : A) {
            final int a = i[0], b = i[1];
            put = true;
            for (ant = adjList[a&adjList_cap]; ant != null; ant = ant.next) {
                if (ant.key == a) {
                    if (++ant.dist > maxDegree) {
                        maxDegree = ant.dist;
                        maxDegreeNode = a;
                    }
                    ant.val.add(b);
                    put = false;
                    break;
                }
            }
            if(put) adjList[a&adjList_cap] = new AdjNode(a, b);

            put = true;
            for (ant = adjList[b&adjList_cap]; ant != null; ant = ant.next) {
                if (ant.key == b) {
                    if (++ant.dist > maxDegree) {
                        maxDegree = ant.dist;
                        maxDegreeNode = b;
                    }
                    ant.val.add(a);
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

            self_deptht = 1;
            for (snt = set[maxDegreeNode&cap]; snt != null; snt = snt.next) {
                if (snt.key == maxDegreeNode){
                    self_deptht = snt.val + 1;
                    break;
                }
            }
            final int self_depth = self_deptht;
            if (self_depth > maxDepth) {
                maxDepth = self_depth;
                maxDepthNode = maxDegreeNode;
            }

            bagt = null;
            for (ant = adjList[maxDegreeNode&adjList_cap]; ant != null; ant = ant.next) {
                if (ant.key == maxDegreeNode){
                    bagt = ant.val;
                    break;
                }
            }
            final Bag bag = bagt;
            for (int i = 0; i <= bag.N;) {
                final int n = bag.list[i++];
                put = true;
                for (snt = set[n&cap]; snt != null; snt = snt.next) {
                    if (snt.key == n){
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

            self_deptht = 1;
            for (snt = set[maxDepthNode&cap]; snt != null; snt = snt.next) {
                if (snt.key == maxDepthNode){
                    self_deptht = snt.val + 1;
                    break;
                }
            }
            final int self_depth = self_deptht;
            if (self_depth > maxDepth)
                maxDepth = self_depth;

            bagt = null;
            for (ant = adjList[maxDepthNode&adjList_cap]; ant != null; ant = ant.next) {
                if (ant.key == maxDepthNode){
                    bagt = ant.val;
                    break;
                }
            }
            final Bag bag = bagt;
            for (int i = 0; i <= bag.N;) {
                final int n = bag.list[i++];
                put = true;
                for (snt = set[n&cap]; snt != null; snt = snt.next) {
                    if (snt.key == n){
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