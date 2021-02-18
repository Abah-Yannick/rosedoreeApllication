package com.gildedrose;

import static java.util.Arrays.asList;

public class GildedRose {
    public Item[] items;
    Item item;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) { 
//        	item = items[i];
//        	UpdaterFactory.updaterFor(item).update(item);
//        } 
        
        asList(items).forEach(item -> UpdaterFactory.updaterFor(item).update(item));
    }
}