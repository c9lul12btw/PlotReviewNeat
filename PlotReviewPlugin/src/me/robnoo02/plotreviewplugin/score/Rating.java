package me.robnoo02.plotreviewplugin.score;

import org.bukkit.OfflinePlayer;

public class Rating {

     private static int getTotalPlotScore() {
         //gets stoc from config;
    	 return 0;
     }

     private static int getAvgScore() {
         //gets avg score from config;
    	 return 0;
     }

     private static int getPlots() {
         //gets num of plots from config;
    	 return 0;
     }

     public static int calculateNewRating(OfflinePlayer player) {
         //int OLD_RATING = getRating(player);
         int TOTAL_STOC = getStoc();
         int PLOTS = getPlots();
         double AVERAGE_SCORE = getAvgScore();

         double STOC_PER_PLOT = TOTAL_STOC / PLOTS;
         double RATING = (TOTAL_STOC * STOC_PER_PLOT) * (AVERAGE_SCORE / 1000);

         return (int) RATING;
     }

     public static void updateConfig(int newRating) {
         //Config.update.Rating(calculateNewRating());
     }
	

}
