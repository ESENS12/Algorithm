
// 최소비용 신장 부분 트리
    class Edge implements Comparable<Edge>{
        public int v1;
        public int v2;
        public int cost;
        Edge(int v1, int v2, int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge edge) {
            return this.cost - edge.cost;
        }
    }
    int[] unf;
    public int find(int v){
        if(v == unf[v]){
            return v;
        }
        return unf[v] = find(unf[v]);
    }
    /***
     * 1 2 12
     * 1 9 25
     * 2 3 10
     * 2 8 17
     * 2 9 8
     * 3 4 18
     * 3 7 55
     * 4 5 44
     * 5 6 60
     * 5 7 38
     * 7 8 35
     * 8 9 15
     * */
    public void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public int solution(int n, int m) {
        int result = 0;
        unf = new int[n+1];
        for(int i=0; i<n; i++){
            unf[i]=i;
        }
        ArrayList<Edge> arr = new ArrayList<>();
        arr.add(new Edge(1,2,12));
        arr.add(new Edge(1,9,25));
        arr.add(new Edge(2,3,10));
        arr.add(new Edge(2,8,17));
        arr.add(new Edge(2,9,8));
        arr.add(new Edge(3,4,18));
        arr.add(new Edge(3,7,55));
        arr.add(new Edge(4,5,44));
        arr.add(new Edge(5,6,60));
        arr.add(new Edge(5,7,38));
        arr.add(new Edge(7,8,35));
        arr.add(new Edge(8,9,15));

        Collections.sort(arr);

        for(Edge edge : arr){
            int fv1 = find(edge.v1);
            int fv2 = find(edge.v2);
            if(fv1 != fv2){
                result += edge.cost;
                union(fv1,fv2);
            }
        }
        return result;
    }