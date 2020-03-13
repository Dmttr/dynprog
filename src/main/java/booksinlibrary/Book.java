package booksinlibrary;

public class Book {
    private int learningTime;
    private int knowledge;

    public Book(int learningTime, int knowledge) {
        this.learningTime = learningTime;
        this.knowledge = knowledge;
    }

    public int getLearningTime() {
        return learningTime;
    }

    public int getKnowledge() {
        return knowledge;
    }
}
