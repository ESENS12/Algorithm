public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String,HashMap<Integer,Integer>> hm = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            HashMap<Integer,Integer> idx_hm = new HashMap<>();
            idx_hm.put(i,plays[i]);
            int finalI = i;
            int value = plays[finalI];

            hm.compute(genres[i],(k, v) ->{
                if(v == null){
                    return idx_hm;
                }else{
                    v.put(finalI,value);
                    v = sortByValue(v);
                    return v;
                }
            });
        }
        ArrayList<Integer> result = new ArrayList<>();
        hm.forEach((k,v)->{

            int tot = 0;
            Iterator<Integer> iter = v.values().iterator();
            Iterator<Integer> key_iter = v.keySet().iterator();

            for(int i=0; i<v.size(); i++){
                tot += iter.next();
                if(i<2){
                    result.add(key_iter.next());
                }
            }
        });
        answer = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }



    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }