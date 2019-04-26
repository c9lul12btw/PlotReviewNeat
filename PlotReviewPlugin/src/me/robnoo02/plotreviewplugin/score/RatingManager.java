package me.robnoo02.plotreviewplugin.score;

import org.bukkit.OfflinePlayer;

import me.robnoo02.plotreviewplugin.utils.PlotUtil;

public class RatingManager {
	
	public static double getRating(OfflinePlayer player) {
		return STOCMaths.calcTotalStoc(player.getUniqueId().toString()) * calcStocPerPlot(player) * (STOCMaths.calcAverageScore() / 1000);
	}

	public static double calcRating(OfflinePlayer player) {
		return (STOCMaths.calcTotalStoc(player.getUniqueId().toString()) * calcStocPerPlot(player)) * (STOCMaths.calcAverageScore() / 1000);
	}

}
