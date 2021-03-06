package 프로그래머스;

import java.util.*;

public class Programmers49993 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            int learningIdx = 0;
            boolean isAble = true;
            for (char curSkill : skillTree.toCharArray()) {
                int skillIdx = skill.indexOf(curSkill);
                if (skillIdx == -1)
                    continue;
                else if (skillIdx == learningIdx)
                    learningIdx++;
                else {
                    isAble = false;
                    break;
                }
            }
            if (isAble)
                answer++;
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
