package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.gildedrose.run.RosedoreeApplication;


@SpringBootTest(classes = RosedoreeApplicationTests.class)
class RosedoreeApplicationTests {

    @Test
	public void lowers_quality_and_sellIn_values_of_every_item_at_the_end_of_each_day() throws Exception {
        Item[] items = new Item[] { new Item("common product", 0, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
	}
    
    @Test
	public void lowers_quality_twice_as_fast_when_past_expiration_date() throws Exception {
        Item[] items = new Item[] { new Item("common product", 0, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(-1, app.items[0].sellIn);		
        assertEquals(8, app.items[0].quality);
	}
    
    @Test
	public void never_lowers_quality_value_below_zero() throws Exception {
        Item[] items = new Item[] { new Item("common product", 0, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
	}
    
    @Test
	public void increases_aged_brie_quality_at_the_end_of_each_day() throws Exception {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
	}

    @Test
	public void never_increases_aged_brie_quality_above_50() throws Exception {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
	}
    
    @Test
	public void never_lowers_sulfuras_quality_and_sellIn_values() throws Exception {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
	}
    
    @Test
	public void increases_passes_quality_at_the_end_of_each_day() throws Exception {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 20, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(19, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
	}
    
    @Test
	public void never_increases_passes_quality_above_50() throws Exception {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 20, 50)};
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(19, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
	}
    
    @Test
	public void increases_passes_quality_twice_as_fast_when_sellIn_value_is_equal_or_less_than_10() throws Exception {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
	}
    
    @Test
	public void increases_passes_quality_thrice_as_fast_when_sellIn_value_is_equal_or_less_than_5() throws Exception {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(4, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
	}
    
    @Test
	public void lowers_passes_quality_to_zero_when_past_expiration_date() throws Exception {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
	}
    
    @Test
	public void lowers_conjured_quality_twice_as_fast() throws Exception {
        Item[] items = new Item[] { new Item("Conjured", 10, 10)};
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
	}
    
    @Test
	public void never_lowers_conjured_quality_below_zero() throws Exception {
        Item[] items = new Item[] {new Item("Conjured", 10, 10)  };
        GildedRose app = new GildedRose(items);
        
        app.updateQuality();
        
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
	}

}
