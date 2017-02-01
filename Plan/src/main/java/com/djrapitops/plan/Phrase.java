package com.djrapitops.plan;

import org.bukkit.ChatColor;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

/**
 *
 * @author Rsl1122
 */
public enum Phrase {
    PREFIX("[Plan] "),
    ENABLED("Player Analytics Enabled."),
    DISABLED("Player Analytics Disabled."),
    SAVE_CACHE("Saving cached data.."),
    ADD_TO_CACHE("Added #1 to Cache."),
    CONFIG_HEADER("Plan Config | More info at https://www.spigotmc.org/wiki/plan-configuration/"),
    DATABASE_TYPE_DOES_NOT_EXIST("That database type doesn't exist."),
    DATABASE_FAILURE_DISABLE("Database initialization has failed, disabling Plan."),
    NOTIFY_EMPTY_IP(ChatColor.YELLOW+""+PREFIX+"IP in server.properties is empty & AlternativeServerIP is not used, incorrect links will be given!"),
    //
    VERSION_NEW_AVAILABLE("New Version (#1) is availible at https://www.spigotmc.org/resources/plan-player-analytics.32536/"),
    VERSION_LATEST("You're running the latest version"),
    VERSION_CHECK_ERROR("Failed to compare versions."),
    VERSION_FAIL("Failed to get newest version number."),
    //
    USERNAME_NOT_VALID(ChatColor.RED + "" + PREFIX + "This Player doesn't exist."),
    USERNAME_NOT_SEEN(ChatColor.RED + "" + PREFIX + "This Player has not played on this server."),
    USERNAME_NOT_KNOWN(ChatColor.RED + "" + PREFIX + "Player not found from the database."),
    //
    COLOR_MAIN(ChatColor.getByChar(getPlugin(Plan.class).getConfig().getString("Customization.Colors.Commands.Main").charAt(1))),
    COLOR_SEC(ChatColor.getByChar(getPlugin(Plan.class).getConfig().getString("Customization.Colors.Commands.Secondary").charAt(1))),
    COLOR_TER(ChatColor.getByChar(getPlugin(Plan.class).getConfig().getString("Customization.Colors.Commands.Highlight").charAt(1))),
    HCOLOR_ACT_ONL(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.ActivityGraph.OnlinePlayers")),
    HCOLOR_ACT_NEW(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.ActivityGraph.NewPlayers")),
    HCOLOR_GMP_0(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.GamemodePie.Survival")),
    HCOLOR_GMP_1(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.GamemodePie.Creative")),
    HCOLOR_GMP_2(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.GamemodePie.Adventure")),
    HCOLOR_GMP_3(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.GamemodePie.Spectator")),
    HCOLOR_ACTP_ACT(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.ActivityPie.Active")),
    HCOLOR_ACTP_BAN(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.ActivityPie.Banned")),
    HCOLOR_ACTP_INA(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.ActivityPie.Inactive")),
    HCOLOR_ACTP_JON(getPlugin(Plan.class).getConfig().getString("Customization.Colors.HTML.ActivityPie.JoinedOnce")),
    //
    ARROWS_RIGHT("»"),
    BALL("•"),
    GRABBING_DATA_MESSAGE(COLOR_TER + "" + ARROWS_RIGHT + COLOR_MAIN + " Fetching data to cache.."),
    //
    DEM_UNKNOWN("Not Known"),
    NOT_IN_TOWN("Not in a town"),
    NOT_IN_FAC("Not in a faction"),
    //
    ANALYSIS("Analysis | "),
    ANALYSIS_START(ANALYSIS + "Beginning analysis of user data.."),
    ANALYSIS_BOOT_NOTIFY(ANALYSIS + "Boot analysis in 30 seconds.."),
    ANALYSIS_BOOT(ANALYSIS + "Starting Boot Analysis.."),
    ANALYSIS_FETCH_PLAYERS(ANALYSIS + "Checking for available players.."),
    ANALYSIS_FETCH_DATA(ANALYSIS + "Fetching Data.."),
    ANALYSIS_FAIL_NO_PLAYERS(ANALYSIS + "Analysis failed, no known players."),
    ANALYSIS_FAIL_NO_DATA(ANALYSIS + "Analysis failed, no data in the database."),
    ANALYSIS_BEGIN_ANALYSIS(ANALYSIS + "Data Fetched, beginning Analysis of data.."),
    ANALYSIS_COMPLETE(ANALYSIS + "Analysis Complete."),
    //
    ERROR_PLANLITE("PlanLite not found, if you're have plugins using PlanAPI v1.6.0 download PlanLite."),
    ERROR_NO_DATA_VIEW(ChatColor.YELLOW + "Webserver disabled but Alternative IP/PlanLite not used, no way to view data!"),
    ERROR_WEBSERVER_OFF_ANALYSIS(ChatColor.YELLOW + "" + PREFIX + "This command can be only used if the webserver is running on this server."),
    ERROR_WEBSERVER_OFF_INSPECT(ChatColor.YELLOW + "" + PREFIX + "This command can be only used if webserver/planlite is enabled on this server."),
    //
    MANAGE_ERROR_INCORRECT_PLUGIN(ChatColor.RED + "" + PREFIX + "Plugin not supported: "),
    MANAGE_ERROR_PLUGIN_NOT_ENABLED(ChatColor.RED + "" + PREFIX + "Plugin is not enabled: "),
    MANAGE_ERROR_INCORRECT_DB(ChatColor.RED + "" + PREFIX + "Incorrect database! (sqlite/mysql accepted): "),
    MANAGE_ERROR_SAME_DB(ChatColor.RED + "" + PREFIX + "Can't move to the same database!"),
    MANAGE_DATABASE_FAILURE(ChatColor.RED + "" + PREFIX + "One of the databases was not initialized properly."),
    MANAGE_DB_CONFIG_REMINDER(ChatColor.YELLOW + "" + PREFIX + "Remember to swap to the new database and reload plugin"),
    MANAGE_ERROR_NO_PLAYERS(ChatColor.RED + "" + PREFIX + "Database has no player data!"),
    MANAGE_MOVE_SUCCESS(ChatColor.GREEN + "" + PREFIX + "All data moved successfully!"),
    MANAGE_CLEAR_SUCCESS(ChatColor.GREEN + "" + PREFIX + "All data cleared successfully!"),
    //
    CMD_FOOTER(COLOR_TER.color() + "" + ARROWS_RIGHT),
    CMD_BALL(COLOR_SEC.color() + " " + Phrase.BALL.toString() + COLOR_MAIN.color()),
    CMD_ANALYZE_HEADER(CMD_FOOTER + "" + COLOR_MAIN.color() + " Player Analytics - Analysis results"),
    CMD_INSPECT_HEADER(CMD_FOOTER + "" + COLOR_MAIN.color() + " Player Analytics - Inspect results: "),
    CMD_SEARCH_HEADER(CMD_FOOTER + "" + COLOR_MAIN.color() + " Player Analytics - Search results for: "),
    CMD_CLICK_ME("Click Me"),
    CMD_LINK(COLOR_SEC.color() + " " + BALL + COLOR_MAIN.color() + " Link: " + COLOR_TER.color()),
    CMD_PASS_PLANLITE(ChatColor.YELLOW + "" + PREFIX + "Passing to PlanLite.."),
    CMD_RESULTS_AVAILABLE(COLOR_SEC.color() + "   Results will be available for " + COLOR_TER.color() + "#1" + COLOR_SEC.color() + " minutes."),
    CMD_NO_RESULTS(CMD_BALL + " No results for " + COLOR_SEC.color() + "#1" + COLOR_MAIN.color() + "."),
    CMD_MATCH(COLOR_SEC.color() + " Matching player: " + COLOR_TER.color()),
    //
    COMMAND_SENDER_NOT_PLAYER(ChatColor.RED + "" + PREFIX + "This command can be only used as a player."),
    COMMAND_REQUIRES_ARGUMENTS(ChatColor.RED + "" + PREFIX + "Command requires arguments."),
    COMMAND_ADD_CONFIRMATION_ARGUMENT(ChatColor.RED + "" + PREFIX + "Add -a to confirm execution!"),
    COMMAND_REQUIRES_ARGUMENTS_ONE(ChatColor.RED + "" + PREFIX + "Command requires one argument."),
    COMMAND_NO_PERMISSION(ChatColor.RED + "" + PREFIX + "You do not have the required permmission.");

    private final String text;
    private final ChatColor color;

    private Phrase(final String text) {
        this.text = text;
        this.color = null;
    }

    private Phrase(final ChatColor color) {
        this.color = color;
        this.text = "";
    }

    @Override
    public String toString() {
        return text;
    }
    
    public String parse(String replace) {
        return text.replaceAll("#1", replace);
    }

    /**
     * @return Color of the COLOR_ENUM
     */
    public ChatColor color() {
        return color;
    }
}
