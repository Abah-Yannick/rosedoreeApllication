package com.gildedrose.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;

@SpringBootApplication
public class RosedoreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RosedoreeApplication.class, args);
		        System.out.println("######## GILDED ROSE ########");

		        Item[] items = new Item[] {
		                new Item("common product", 10, 20), 
		                new Item("Aged Brie", 2, 0), 
		                new Item("Elixir of the Mongoose", 5, 7), 
		                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
		                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
		                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
		                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
		                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
		                new Item("Conjured", 3, 6) };

		        GildedRose app = new GildedRose(items);

		        int days = 2;
		        if (args.length > 0) {
		            days = Integer.parseInt(args[0]) + 1;
		        }

		        for (int i = 0; i < days; i++) {
		            System.out.println("                ############# DAY " + i + " #############");
		            System.out.println("             NAME                            | SELLIN | QUALITY");
		            for (Item item : items) {
		                //System.out.println(item);
		                System.out.println(String.format("%1$45s", item.name) + "|" + String.format("%1$8s", item.sellIn) +"| " + String.format("%1$8s", item.quality));
		            }
		            System.out.println();
		            app.updateQuality();
		        }
		    }

		}


