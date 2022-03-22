
    int[] unf;

    public int find(int v){
        if(v==unf[v]){
            return v;
        }else{
            return unf[v]= find(unf[v]);
        }
    }
    
    public void union(int a , int b){
        int fa = find(a);
        int fb = find(b);
        if(fa!=fb) unf[fa] = fb;
    }

    public int solution(int n, int m) {
        int result = 0;
        unf = new int[n+1];
        for(int i=0; i<=n; i++){
            unf[i] = i;
        }
        union(1,2);
        union(2,3);
        union(3,4);
        union(1,5);
        union(6,7);
        union(7,8);
        union(8,9);
        //3 8 이 친구인가?

        int fa = find(3);
        int fb = find(8);
        Log.e(TAG,"fa  : " + fa + ", fb : " + fb);

        return result;
    }