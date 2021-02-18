package com.gildedrose;

public class BackstagePassesUpdater implements Updater {

	@Override
	public void update(Item item) {
		if(isAfterEvent(item)) {
			item.quality = 0;
		}
		else if(item.quality < 50) {
			Integer qualityIncrease = qualityIncreaseBy(item.sellIn);
			item.quality += qualityIncrease;
		}
		item.sellIn--;
	}

	private Integer qualityIncreaseBy(Integer remainingDays) {
		if(remainingDays <= 5) {
			return 3;
		}
		else if (remainingDays <= 10) {
			return 2;
		}
		else {
			return 1;
		}
	}

	private boolean isAfterEvent(Item item) {
		return item.sellIn <= 0;
	}

}
