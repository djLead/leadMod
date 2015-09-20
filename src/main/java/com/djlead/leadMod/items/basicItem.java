package com.djlead.leadmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/** basicItem - setup default items class to add to with custom items in myItems.java
 * Created by Lead on 19-9-2015.
 */
public class basicItem extends Item {

    public basicItem (String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMisc);

    }
}
