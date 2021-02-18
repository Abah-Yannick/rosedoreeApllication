package com.gildedrose;

public class SulfurasUpdater implements Updater {

	@Override
	public void update(Item item) {
		if(item.quality != 80) {
			item.quality = 80;
		}
	}

}
