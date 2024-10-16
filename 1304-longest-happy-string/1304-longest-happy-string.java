class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> heap = new PriorityQueue<>((x, y) -> y.count - x.count);
        if(a > 0)
            heap.add(new Pair('a', a));
        if(b > 0)
            heap.add(new Pair('b', b));
        if(c > 0)
            heap.add(new Pair('c', c));

        StringBuilder res = new StringBuilder();

        while(!heap.isEmpty()){
            Pair frst = heap.poll();
            int n = res.length();
            if( n >= 2 && res.charAt(n-1) == frst.ch && res.charAt(n-2) == frst.ch){
                if(heap.isEmpty())
                    break;
                Pair sec = heap.poll();
                res.append(sec.ch);
                sec.count--;
                if(sec.count > 0)
                    heap.add(sec);
                heap.add(frst);
            }
            else{
                res.append(frst.ch);
                frst.count--;
                if(frst.count > 0)
                    heap.add(frst);
            }
        }

        return res.toString();
    }

    private static class Pair{
        char ch;
        int count;
        Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
}