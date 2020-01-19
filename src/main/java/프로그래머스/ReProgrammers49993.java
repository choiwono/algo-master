package 프로그래머스;

import java.util.*;

public class ReProgrammers49993 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++) {
            int learningIdx = 0;
            boolean isAble = true;

            for(int j=0; j<skill_trees[i].length(); j++) {
                int skillIdx = skill.indexOf(skill_trees[i].charAt(j));

                if(skillIdx == -1) {
                    continue;
                } else if(skillIdx == learningIdx) {
                    learningIdx++;
                } else {
                    isAble = false;
                    break;
                }
            }
            if(isAble) answer++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillTrees = {"BACDE","CBADF","AECB","BDA"};
        int r = solution(skill,skillTrees);
        //System.out.println(r);
    }
}