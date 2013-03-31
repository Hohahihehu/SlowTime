package com.gildorym.slowtime;

import org.bukkit.plugin.java.JavaPlugin;

public class SlowTime extends JavaPlugin {
	
	public void onEnable() {
		this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {

			@Override
			public void run() {
				SlowTime.this.getServer().getWorlds().get(0).setFullTime((long) (SlowTime.this.getServer().getWorlds().get(0).getFullTime() - 100L + (100L * 0.25D)));
			}
			
		}, 100L, 100L);
	}

}
