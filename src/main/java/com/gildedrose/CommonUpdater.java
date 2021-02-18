package com.gildedrose;

public class CommonUpdater implements Updater {

	@Override
	public void update(Item item) {

		if(isQualityPositive(item)) {
			item.quality--;
			if(isExpirationDatePass(item)) {
				item.quality--;
			}
		}

		item.sellIn--;

	}

	private boolean isQualityPositive(Item item) {
		return item.quality > 0;
	}
	private boolean isExpirationDatePass(Item item) {
		return item.sellIn <= 0;
	}



}
