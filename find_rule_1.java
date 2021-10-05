// 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/67256

class Solution {
    static String answer = "";
    
    public String solution(int[] numbers, String hand) {
        
        geom[] keypad = new geom[]{
                new geom(0,0),new geom(0,1),new geom(0,2),
                new geom(1,0),new geom(1,1),new geom(1,2),
                new geom(2,0),new geom(2,1),new geom(2,2)
        };
        
        Hand left = new Hand("left");
        Hand right = new Hand("right");
        
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            geom target = new geom();
            if(num == 0){
                target = new geom(3,1);
            }else{
                target = new geom(keypad[num-1].x , keypad[num-1].y);
            }
            
            // 왼손
            if(target.y == 0){
                left.moveTo(target);
            }else if(target.y == 2){
                right.moveTo(target);
            }else{      //가운데 번호 일때
                
                int leftCost = getDiff(left.position,target);
                int rightCost = getDiff(right.position,target);
                
                if(leftCost > rightCost){
                    right.moveTo(target);
                }else if( rightCost > leftCost ){
                    left.moveTo(target);
                }else{
                    if(hand.equals("right")){
                        right.moveTo(target);
                    }else{
                        left.moveTo(target);
                    }
                }
            }
        }
        return answer;
    }

    public void println(String str){
        System.out.println(str);
    }
 
    public int getDiff(geom target1, geom target2){
        int diff = 0;
        diff += Math.abs(target1.x - target2.x);
        diff += Math.abs(target1.y - target2.y);
        return diff;
    }
    
    class geom{
        int x;
        int y;
        
        public geom(){
            this.x = 0;
            this.y = 0;
        }
        public geom(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    class Hand{    
        geom position;
        char character;
        
        public Hand(String handType){
            this.position = new geom();
            if(handType.equals("right")){
                this.position.x = 3;
                this.position.y = 2;
                this.character = 'R';
            }else{
                this.position.x = 3;
                this.position.y = 0;
                this.character = 'L';
            }   
        }
        public void moveTo (geom via){
            this.position.x = via.x;
            this.position.y = via.y;
            answer += this.character;
        }
        
    }
}