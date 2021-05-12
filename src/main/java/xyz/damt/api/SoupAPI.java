package xyz.damt.api;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.damt.Soup;
import xyz.damt.profiles.Profile;

import java.util.UUID;

public class SoupAPI {

    private final Soup soup;

    public SoupAPI() {
        this.soup = JavaPlugin.getPlugin(Soup.class);
    }

    public int getKills(UUID uuid) {
        return soup.getProfileHandler().getProfileByUUID(uuid).getKills();
    }

    public int getDeaths(UUID uuid) {
        return soup.getProfileHandler().getProfileByUUID(uuid).getDeaths();
    }

    public int getCoins(UUID uuid) {
        return soup.getProfileHandler().getProfileByUUID(uuid).getCoins();
    }

    public int getSoupsUsed(UUID uuid) {
        return soup.getProfileHandler().getProfileByUUID(uuid).getSoupsUsed();
    }

    public Profile getProfile(UUID uuid) {
        return soup.getProfileHandler().getProfileByUUID(uuid);
    }

}
