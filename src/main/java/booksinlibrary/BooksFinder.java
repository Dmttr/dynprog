package booksinlibrary;

import java.util.List;

public class BooksFinder {

    public static int findMaxKnowledge(List<Book> books, int totalLearningTime){

        int[][] knowledge = new int[books.size() + 1][totalLearningTime + 1];

        for (int t = 1; t <= totalLearningTime; t++) {
            knowledge[1][t] = books.get(0).getKnowledge();
        }
        for (int i = 1; i <= books.size(); i++) {
            knowledge[i][0] = 0;
        }

        for (int i = 2; i <= books.size(); i++) {
            for (int t = 2; t <= totalLearningTime; t++) {

                int bKnowledge = books.get(i-1).getKnowledge();
                int bTime = books.get(i-1).getLearningTime();

                if (t <= totalLearningTime){
                    knowledge[i][t] = Math.max(
                            bKnowledge + knowledge[i-1][(t-bTime) < 0? 0: t-bTime],
                            knowledge[i-1][t]);
                }else{
                    knowledge[i][t] = knowledge[i-1][(t-bTime) < 0? 0: t-bTime];
                }
            }
        }

        return knowledge[books.size()][totalLearningTime];
    }
}
