public String solution(String str, String target){
    String res = "";
    int [][] answer = new int[][]{{2,7},{1,3},{1,2},{2,5},{3,6}};
    ArrayList<Point> points = new ArrayList<>();
    for(int i=0; i<answer.length; i++){
        points.add(new Point(answer[i][0],answer[i][1]));
    }
    Collections.sort(points);
    points.forEach(it -> System.out.println("x : " + it.x + ", y : " +it.y));
    return res;
}


class Point implements Comparable<Point>{
    public int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        // 오름차순의 경우 음수, 내림차순의 경우 양수로 리턴 하도록
        if(this.x == point.x) return this.y - point.y;
        else return this.x - point.x;
    }
}