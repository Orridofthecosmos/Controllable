package com.mrcrayfish.controllable.mixin.client.jei;

import mezz.jei.common.gui.elements.GuiIconToggleButton;
import mezz.jei.common.gui.overlay.IngredientGridWithNavigation;
import mezz.jei.common.gui.overlay.IngredientListOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * Author: MrCrayfish
 */
@Pseudo
@Mixin(IngredientListOverlay.class)
public interface IngredientListOverlayMixin
{
    @Accessor(value = "contents", remap = false)
    IngredientGridWithNavigation getContents();

    @Accessor(value = "configButton", remap = false)
    GuiIconToggleButton getConfigButton();
}
