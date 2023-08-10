package ss08_clean_code_and_refactoring.exercise;

import java.util.Scanner;

public class TennissGame {
    private static final int SCORE_LOVE = 0;
    private static final int SCORE_FIFTEEN = 1;
    private static final int SCORE_THIRTY = 2;
    private static final int SCORE_FORTY = 3;

    private static final String SCORE_LOVE_TEXT = "Love";
    private static final String SCORE_FIFTEEN_TEXT = "Fifteen";
    private static final String SCORE_THIRTY_TEXT = "Thirty";
    private static final String SCORE_FORTY_TEXT = "Forty";
    private static final String SCORE_ALL_TEXT = "-All";
    private static final String SCORE_DEUCE = "Deuce";
    private static final String SCORE_ADVANTAGE = "Advantage ";
    private static final String SCORE_WIN = "Win for ";

    // Phương thức 1: Quy điểm người chơi thành chữ
    private static String getPlayerScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return SCORE_LOVE_TEXT;
            case SCORE_FIFTEEN:
                return SCORE_FIFTEEN_TEXT;
            case SCORE_THIRTY:
                return SCORE_THIRTY_TEXT;
            case SCORE_FORTY:
                return SCORE_FORTY_TEXT;
            default:
                return "";
        }
    }

    // Phương thức 2: Tính điểm chung cuộc
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";

        if (player1Score == player2Score) {
            switch (player1Score) {
                case SCORE_LOVE:
                    score = SCORE_LOVE_TEXT + SCORE_ALL_TEXT;
                    break;
                case SCORE_FIFTEEN:
                    score = SCORE_FIFTEEN_TEXT + SCORE_ALL_TEXT;
                    break;
                case SCORE_THIRTY:
                    score = SCORE_THIRTY_TEXT + SCORE_ALL_TEXT;
                    break;
                case SCORE_FORTY:
                    score = SCORE_FORTY_TEXT + SCORE_ALL_TEXT;
                    break;
                default:
                    score = SCORE_DEUCE;
                    break;
            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int scoreDifference = player1Score - player2Score;
            if (scoreDifference == 1) {
                score = SCORE_ADVANTAGE + player1Name;
            } else if (scoreDifference == -1) {
                score = SCORE_ADVANTAGE + player2Name;
            } else if (scoreDifference >= 2) {
                score = SCORE_WIN + player1Name;
            } else {
                score = SCORE_WIN + player2Name;
            }
        } else {
            score = getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
        }

        return score;
    }


    public static void main(String[] args) {
        // Nhập vào thông tin người chơi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên người chơi 1:");
        String player1Name = scanner.nextLine();
        System.out.println("Nhập tên người chơi 2:");
        String player2Name = scanner.nextLine();
        System.out.println("Điểm người chơi 1:");
        int player1Score = Integer.parseInt(scanner.nextLine());
        System.out.println("Điểm người chơi 2:");
        int player2Score = Integer.parseInt(scanner.nextLine());

        // In ra quy điểm số thành chữ cho từng người chơi
        System.out.println("Người 1: " + getPlayerScore(player1Score));
        System.out.println("Người 2: " + getPlayerScore(player2Score));

        // Tìm người thắng cuộc hoặc lợi thế
        String score = getScore(player1Name, player2Name, player1Score, player2Score);
        System.out.println(score);
    }
}
