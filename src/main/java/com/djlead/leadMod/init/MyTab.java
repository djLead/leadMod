package com.djlead.leadmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/** Creative Tab Creation
 * Created by Lead on 22-9-2015.
 */
public class MyTab extends CreativeTabs {

    public MyTab(String label) {
        super(label);
        this.setBackgroundImageName("leadmod.png");
    }

    // set tab icon
    @Override
    public Item getTabIconItem() {
        return MyItems.item_ring;
    }

}
