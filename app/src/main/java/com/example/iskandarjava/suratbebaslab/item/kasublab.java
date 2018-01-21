package com.example.iskandarjava.suratbebaslab.item;

import com.example.iskandarjava.suratbebaslab.dummy.DummyContent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Iskandar Java on 21/01/2018.
 */

public class kasublab {

    public static final List<DummyContent.DummyItem> ITEMS = new ArrayList<DummyContent.DummyItem>();
    public int in=0;

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyContent.DummyItem> ITEM_MAP = new HashMap<String, DummyContent.DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.

        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyContent.DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyContent.DummyItem createDummyItem(int position) {
        return new DummyContent.DummyItem(String.valueOf(position), "Nama Mahasiswa " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    public static class listKasublab
    {
        public final String id;
        public final String content;
        public final String details;

        public listKasublab(String id, String nama, String details)
        {
            this.id=id;
            content=nama;
            this.details=details;
        }
    }
}
