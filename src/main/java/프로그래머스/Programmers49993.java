package 프로그래머스;

import java.util.*;

public class Programmers49993 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){
            boolean flag = false;
            String[] skills = skill_trees[i].split("");
            int cnt = 0;
            for(int j=0; j<skill_trees.length; j++){
                if(cnt < skill.indexOf(skills[j])){
                    flag = false;
                    break;
                } else if(cnt == skill.indexOf(skills[j])){
                    cnt++;
                }
            }
            if(flag){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillTrees = {"BACDE","CBADF","AECB","BDA"};
        int r = solution(skill,skillTrees);
        System.out.println(r);
    }
}
