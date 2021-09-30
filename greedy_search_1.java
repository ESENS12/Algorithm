import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr_answer = new ArrayList<>();

        // 각 학생의 정답 갯수를 저장하는 변수
        int first = 0;
        int second = 0;
        int third = 0;

        for(int i=0; i< answers.length; i++){
            first = (answers[i] == guessAnswer(1,i+1)) ? first+1 : first;
            second = (answers[i] == guessAnswer(2,i+1)) ? second+1 : second;
            third = (answers[i] == guessAnswer(3,i+1)) ? third+1 : third;
        }
        //3명의 점수를 순회하면서 가장 큰값을 찾음
        int max_value = 0;
        if(max_value <= first){
            max_value = first;
            arr_answer.add(1);
        }
        if(max_value <= second){
            max_value = second;
            if(first < second){
                arr_answer.remove(0);
            }
            arr_answer.add(2);
        }
        if(max_value <= third){
            if(second < third){
                arr_answer.remove(0);
            }
            arr_answer.add(3);
        }

        int[] answer = new int[arr_answer.size()];

        for(int i=0; i<arr_answer.size(); i++){
            answer[i] = arr_answer.get(i);
        }

        return answer;
    }
    
    private final int[] sequence = new int[]{3,3,1,1,2,2,4,4,5,5};
    private final int[] sequence_second = new int[]{2,1,2,2,2,3,2,4,2,5};
    private int guessAnswer(int studentNum, int answerNum){
        int guessNum = 1;
        int real_num = answerNum;
        if(answerNum > 10){
            answerNum = answerNum % 10;
            if(answerNum == 0){
                answerNum = 10;
            }
        }
        switch (studentNum){
            case 1:{
                if(answerNum > 5){
                    answerNum = answerNum - 5;
                }
                guessNum  = answerNum;
            }break;

            case 2:{
                guessNum = sequence_second[answerNum-1];
            }break;

            case 3:{
                guessNum = sequence[answerNum-1];
            }break;
        }
        return guessNum;
    }
}