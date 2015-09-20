package com.djlead.leadmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Lead on 19-9-2015.
 */
public class basicItem extends Item {

    public basicItem (String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMisc);

    }
}
