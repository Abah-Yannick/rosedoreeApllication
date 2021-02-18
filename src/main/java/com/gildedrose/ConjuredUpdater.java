package com.gildedrose;

public class ConjuredUpdater implements Updater {

	@Override
	public void update(Item item) {
		item.quality -= 2;
		if(item.quality < 0) {
			item.quality = 0;
		}
		item.sellIn--;
	}

}
