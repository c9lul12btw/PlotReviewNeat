package me.robnoo02.plotreviewplugin.score;

import me.robnoo02.plotreviewplugin.files.UserDataFile;;

/**
 * Created by Mirass on 25/04/2019.
 */

public class ScoreManager {

    public static void update(UserDataFile userFile) {
        int totalPlotScore = Integer.parseInt(userFile.getString(UserDataFile.PlayerInfoField.TOTAL_STOC));
        userFile.setString(UserDataFile.PlayerInfoField.TOTAL_STOC, getNewTotalPlotScore(totalPlotScore));
        totalPlotScore = Integer.parseInt(getNewTotalPlotScore(totalPlotScore));

        int numberOfSubmissions = Integer.parseInt(userFile.getString(UserDataFile.PlayerInfoField.NUMBER_OF_SUBMISSIONS));

        double averageScore = Double.parseDouble(userFile.getString(UserDataFile.PlayerInfoField.AVERAGE_STOC));
        userFile.setString(UserDataFile.PlayerInfoField.AVERAGE_STOC, getNewAverageScore(averageScore));
        averageScore = Double.parseDouble(getNewAverageScore(averageScore));

        userFile.setString(UserDataFile.PlayerInfoField.RATING, getNewRating(totalPlotScore, numberOfSubmissions, averageScore));
    }

    public static String getNewTotalPlotScore(int currentScore) {
        return Integer.toString(currentScore + );
    }

    public static String getNewAverageScore(double currentAverage) {

        return "";
    }

    public static String getNewRating(int totalPlotScore, int plots, double averageScore) {

        return "";
    }
}
