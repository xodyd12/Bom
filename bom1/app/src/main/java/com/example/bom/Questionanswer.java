package com.example.bom;

public class Questionanswer {

    public String mQuestions[] = {
            "건반 '도' 다음엔 무엇 일까요? ",
            "건반 '레' 다음엔 무엇 일까요? ",
            "건반 '미' 다음엔 무엇 일까요? ",
            "건반 '파' 다음엔 무엇 일까요?",
            "건반 '솔' 다음엔 무엇 일까요? ",
            "건반 '라' 다음엔 무엇 일까요?",
            "건반 '시' 다음엔 무엇 일까요? ",
            "코드 '도,미,솔' 은 무슨 코드 일까요?",
            "코드 '레,파#,라' 는 무슨 코드 일까요?",
            "코드 '미,솔#,시' 는 무슨 코드 일까요?",
            "코드 '파,라,도' 는 무슨 코드 일까요?",
            "코드 '솔,시,레' 는 무슨 코드 일까요?",
            "코드 '라,도#,미' 는 무슨 코드 일까요?",
            "코드 '시,도#,파#' 는 무슨 코드 일까요?",
            "코드 '도,미♭,솔' 는 무슨 코드 일까요?",
            "코드 '레,파,라' 는 무슨 코드 일까요?",
            "코드 '미,솔,시' 는 무슨 코드 일까요?",
            "코드 '파,라♭,도' 는 무슨 코드 일까요?",
    };

    private String mChoices[][] = {
            {"레","파","시","미"},
            {"미","파","레","도"},
            {"미","파","라","시"},
            {"미","파","라","솔"},
            {"미","파","라","시"},
            {"도","파","라","시"},
            {"도","파","라","시"},
            {"C","F","A","G"},
            {"C","G","D","A"},
            {"E","G","B","F"},
            {"A","G","B","F"},
            {"D","G","B","C"},
            {"A","G","C","F"},
            {"A","B","D","C"},
            {"Am","Gm","Cm","Fm"},
            {"Cm","Gm","Dm","Am"},
            {"Em","Gm","Bm","Fm"},
            {"Am","Gm","Bm","Fm"},





    };

    private String mCorrectAnswers[] = {
            "레",
            "미",
            "파",
            "솔",
            "라",
            "시",
            "도",
            "C",
            "D",
            "E",
            "F",
            "G",
            "A",
            "B",
            "Cm",
            "Dm",
            "Em",
            "Fm"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return  question;
    };

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return  choice;
    };

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return  choice;
    };

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return  choice;
    };

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return  choice;
    };

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }}
