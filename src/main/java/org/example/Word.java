package org.example;

public class Word {//
    private int id;
    private int level;
    private String word;
    private String meaning;

    Word() {} // 비어있는 기본형 생성자
    Word(int id, int level, String word, String meaning) { // 멤버변수를 파라메터로 받는 생성자
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        String slevel = "";
        for(int i = 0; i < level; i++) slevel += "*";
        String str = String.format("%-3s", slevel) // 왼쪽정렬
                + String.format("%15s", word + "  " + meaning); // 오른쪽정렬
        return str;
    }

    public String toFileString() {
        return this.level + "|" + this.word + "|" + this.meaning;
    }
}
