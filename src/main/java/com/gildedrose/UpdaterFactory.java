package com.gildedrose;

public class UpdaterFactory {
	
	public static Updater updaterFor(Item currentItem) {
		
		if (isAgedBrie(currentItem)) {
			return new AgedBrieUpdater();
		}
		else if(isSulfuras(currentItem)) {
			return new SulfurasUpdater();
		}
		else if(isBackstagePasses(currentItem)) {
			return new BackstagePassesUpdater();
		}
		else if(isConjured(currentItem)) {
			return new ConjuredUpdater();
		}
		else {
			return new CommonUpdater();    			
		}
	}

	private static boolean isAgedBrie(Item currentItem) {
		return currentItem.name.equals("Aged Brie");
	}

	private static boolean isBackstagePasses(Item currentItem) {
		return currentItem.name.equals(("Backstage passes to a TAFKAL80ETC concert"));
	}

	private static boolean isSulfuras(Item currentItem) {
		return currentItem.name.equals("Sulfuras, Hand of Ragnaros");
	}

	private static boolean isConjured(Item currentItem) {
		return currentItem.name.equals("Conjured");
	}


}
