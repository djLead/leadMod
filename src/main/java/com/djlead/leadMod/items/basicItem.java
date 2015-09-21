package com.djlead.leadmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/** BasicItem - setup default items class to add to with custom items in MyItems.java
 * Created by Lead on 19-9-2015.
 */



public class BasicItem extends Item {

    public BasicItem(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMisc);

    }
}
