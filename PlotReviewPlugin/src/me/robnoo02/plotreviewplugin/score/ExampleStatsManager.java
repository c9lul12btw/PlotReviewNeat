package me.robnoo02.plotreviewplugin.score;

import me.robnoo02.plotreviewplugin.files.UserDataFile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Created by Mirass on 25/04/2019.
 */

public class ExampleStatsManager {

    public static void update(UserDataFile userFile, int ticketId, HashMap<STOC, String> scores, CommandSender sender) {
        updateTicketInfo(userFile, ticketId, scores, sender);
        updatePlayerInfo();
    }

    private static void updateTicketInfo(UserDataFile userFile, int ticketId, HashMap<STOC, String> scores, CommandSender sender) {
        userFile.setString(ticketId, UserDataFile.TicketDataField.STRUCTURE_SCORE, scores.get(STOC.STRUCTURE));
        userFile.setString(ticketId, UserDataFile.TicketDataField.TERRAIN_SCORE, scores.get(STOC.TERRAIN));
        userFile.setString(ticketId, UserDataFile.TicketDataField.ORGANICS_SCORE, scores.get(STOC.ORGANICS));
        userFile.setString(ticketId, UserDataFile.TicketDataField.COMPOSITION_SCORE, scores.get(STOC.COMPOSITION));
        userFile.setString(ticketId, UserDataFile.TicketDataField.STOC, String.valueOf(STOCMaths.calcAverage(scores, ticketId)));
        userFile.setString(ticketId, UserDataFile.TicketDataField.STAFF, ((Player) sender).getUniqueId().toString());
    }

    private static void updatePlayerInfo() {

    }
}
