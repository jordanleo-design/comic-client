package dev.comic.hud;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;

final class Draw {
    private Draw() {}
    static void rect(GuiGraphics g, int x1, int y1, int x2, int y2, int argb) { g.fill(x1, y1, x2, y2, argb); }
    static void text(GuiGraphics g, Font f, String s, int x, int y, int argb) { g.drawString(f, s, x, y, argb, true); }
}
