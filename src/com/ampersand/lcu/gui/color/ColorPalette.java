package com.ampersand.lcu.gui.color;

import java.awt.Color;
import java.util.Random;

public final class ColorPalette {

	/*
	 * Attributes
	 */

	// A

	public static final Color ALICE_BLUE = new Color(240, 248, 255);
	public static final Color ANTIQUE_WHITE = new Color(250, 235, 215);
	public static final Color AQUA = new Color(0, 255, 255);
	public static final Color AQUAMARINE = new Color(127, 255, 212);
	public static final Color AZURE = new Color(240, 255, 255);

	// B

	public static final Color BEIGE = new Color(245, 245, 220);
	public static final Color BISQUE = new Color(255, 228, 196);
	public static final Color BLACK = new Color(0, 0, 0);
	public static final Color BLANCHED_ALMOND = new Color(255, 235, 205);
	public static final Color BLUE = new Color(0, 0, 255);
	public static final Color BLUE_VIOLET = new Color(138, 43, 226);
	public static final Color BROWN = new Color(165, 42, 42);
	public static final Color BURLY_WOOD = new Color(222, 184, 135);

	// C

	public static final Color CADET_BLUE = new Color(95, 158, 160);
	public static final Color CHARTREUSE = new Color(127, 255, 0);
	public static final Color CHOCOLATE = new Color(210, 105, 30);
	public static final Color CORAL = new Color(255, 127, 80);
	public static final Color CORNFLOWER_BLUE = new Color(100, 149, 237);
	public static final Color CORNSILK = new Color(255, 248, 220);
	public static final Color CRIMSON = new Color(220, 20, 60);
	public static final Color CYAN = new Color(0, 255, 255);

	// D

	public static final Color DARK_BLUE = new Color(0, 0, 139);
	public static final Color DARK_CYAN = new Color(0, 139, 139);
	public static final Color DARK_GOLDEN_ROD = new Color(184, 134, 11);
	public static final Color DARK_GRAY = new Color(169, 169, 169);
	public static final Color DARK_GREEN = new Color(0, 100, 0);
	public static final Color DARK_KHAKI = new Color(189, 183, 107);
	public static final Color DARK_MAGENTA = new Color(139, 0, 139);
	public static final Color DARK_OLIVE_GREEN = new Color(85, 107, 47);
	public static final Color DARK_ORANGE = new Color(255, 140, 0);
	public static final Color DARK_ORCHID = new Color(153, 50, 204);
	public static final Color DARK_RED = new Color(139, 0, 0);
	public static final Color DARK_SALMON = new Color(233, 150, 122);
	public static final Color DARK_SEA_GREEN = new Color(143, 188, 143);
	public static final Color DARK_SLATE_BLUE = new Color(72, 61, 139);
	public static final Color DARK_SLATE_GRAY = new Color(47, 79, 79);
	public static final Color DARK_TURQUOISE = new Color(0, 206, 209);
	public static final Color DARK_VIOLET = new Color(148, 0, 211);
	public static final Color DEEP_PINK = new Color(255, 20, 147);
	public static final Color DEEP_SKY_BLUE = new Color(0, 191, 255);
	public static final Color DIM_GRAY = new Color(105, 105, 105);
	public static final Color DODGER_BLUE = new Color(30, 144, 255);

	// F

	public static final Color FIRE_BRICK = new Color(178, 34, 34);
	public static final Color FLORAL_WHITE = new Color(255, 250, 240);
	public static final Color FOREST_GREEN = new Color(34, 139, 34);
	public static final Color FUCHSIA = new Color(255, 0, 255);

	// G

	public static final Color GAINSBORO = new Color(220, 220, 220);
	public static final Color GHOST_WHITE = new Color(248, 248, 255);
	public static final Color GOLD = new Color(255, 215, 0);
	public static final Color GOLDEN_ROD = new Color(218, 165, 32);
	public static final Color GRAY = new Color(128, 128, 128);
	public static final Color GREEN = new Color(0, 128, 0);
	public static final Color GREEN_YELLOW = new Color(173, 255, 47);

	// H

	public static final Color HONEY_DEW = new Color(240, 255, 240);
	public static final Color HOT_PINK = new Color(255, 105, 180);

	// I

	public static final Color INDIAN_RED = new Color(205, 92, 92);
	public static final Color INDIGO = new Color(75, 0, 130);
	public static final Color IVORY = new Color(255, 240, 240);

	// K

	public static final Color KHAKI = new Color(240, 230, 140);

	// L

	public static final Color LAVENDER = new Color(230, 230, 250);
	public static final Color LAVENDER_BLUSH = new Color(255, 240, 245);
	public static final Color LAWN_GREEN = new Color(124, 252, 0);
	public static final Color LEMON_CHIFFON = new Color(255, 250, 205);
	public static final Color LIGHT_BLUE = new Color(173, 216, 230);
	public static final Color LIGHT_CORAL = new Color(240, 128, 128);
	public static final Color LIGHT_CYAN = new Color(224, 255, 255);
	public static final Color LIGHT_GOLDEN_ROD_YELLOW = new Color(250, 250, 210);
	public static final Color LIGHT_GREEN = new Color(144, 238, 144);
	public static final Color LIGHT_GRAY = new Color(211, 211, 211);
	public static final Color LIGHT_PINK = new Color(255, 182, 193);
	public static final Color LIGHT_SALMON = new Color(255, 160, 122);
	public static final Color LIGHT_SEA_GREEN = new Color(32, 178, 170);
	public static final Color LIGHT_SKY_BLUE = new Color(135, 206, 250);
	public static final Color LIGHT_SLATE_GRAY = new Color(119, 136, 153);
	public static final Color LIGHT_STEEL_BLUE = new Color(176, 196, 222);
	public static final Color LIGHT_YELLOW = new Color(255, 255, 224);
	public static final Color LIME = new Color(0, 255, 0);
	public static final Color LIME_GREEN = new Color(50, 205, 50);
	public static final Color LINEN = new Color(250, 240, 230);

	// M

	public static final Color MAGENTA = new Color(255, 0, 255);
	public static final Color MAROON = new Color(128, 0, 0);
	public static final Color MEDIUM_AQUA_MARINE = new Color(102, 205, 170);
	public static final Color MEDIUM_BLUE = new Color(0, 0, 205);
	public static final Color MEDIUM_ORCHID = new Color(186, 85, 211);
	public static final Color MEDIUM_PURPLE = new Color(147, 112, 219);
	public static final Color MEDIUM_SEA_GREEN = new Color(60, 179, 113);
	public static final Color MEDIUM_SLATE_BLUE = new Color(123, 104, 238);
	public static final Color MEDIUM_SPRING_GREEN = new Color(0, 250, 154);
	public static final Color MEDIUM_TURQUOISE = new Color(72, 209, 204);
	public static final Color MEDIUM_VIOLET_RED = new Color(199, 21, 133);
	public static final Color MIDNIGHT_BLUE = new Color(25, 25, 112);
	public static final Color MINT_CREAM = new Color(245, 255, 250);
	public static final Color MISTY_ROSE = new Color(255, 228, 225);
	public static final Color MOCCASSIN = new Color(255, 228, 181);

	// N

	public static final Color NAVAJO_WHITE = new Color(255, 222, 173);
	public static final Color NAVY = new Color(0, 0, 128);

	// O

	public static final Color OLD_LACE = new Color(253, 245, 230);
	public static final Color OLIVE = new Color(128, 128, 0);
	public static final Color OLIVE_DRAB = new Color(107, 142, 35);
	public static final Color ORANGE = new Color(255, 165, 0);
	public static final Color ORANGE_RED = new Color(255, 69, 0);
	public static final Color ORCHID = new Color(218, 112, 214);

	// P

	public static final Color PALE_GOLDEN_ROD = new Color(238, 232, 170);
	public static final Color PALE_GREEN = new Color(152, 251, 152);
	public static final Color PALE_TURQUOISE = new Color(175, 238, 238);
	public static final Color PALE_VIOLET_RED = new Color(219, 112, 147);
	public static final Color PAPAYA_WHIP = new Color(255, 239, 213);
	public static final Color PEACH_PUFF = new Color(255, 218, 185);
	public static final Color PERU = new Color(205, 133, 63);
	public static final Color PINK = new Color(255, 192, 203);
	public static final Color PLUM = new Color(221, 160, 221);
	public static final Color POWDER_BLUE = new Color(176, 224, 230);
	public static final Color PURPLE = new Color(128, 0, 128);

	// R

	public static final Color RED = new Color(255, 0, 0);
	public static final Color ROSY_BROWN = new Color(188, 143, 143);
	public static final Color ROYAL_BLUE = new Color(65, 105, 225);

	// S

	public static final Color SADDLE_BROWN = new Color(139, 69, 19);
	public static final Color SALMON = new Color(250, 128, 114);
	public static final Color SANDY_BROWN = new Color(244, 164, 96);
	public static final Color SEA_GREEN = new Color(46, 139, 87);
	public static final Color SEA_SHELL = new Color(255, 245, 238);
	public static final Color SIENNA = new Color(160, 82, 45);
	public static final Color SILVER = new Color(192, 192, 192);
	public static final Color SKY_BLUE = new Color(135, 206, 235);
	public static final Color SLATE_BLUE = new Color(106, 90, 205);
	public static final Color SLATE_GRAY = new Color(112, 128, 144);
	public static final Color SNOW = new Color(255, 250, 250);
	public static final Color SPRING_GREEN = new Color(0, 255, 127);
	public static final Color STEEL_BLUE = new Color(70, 138, 180);

	// T

	public static final Color TAN = new Color(210, 180, 140);
	public static final Color TEAL = new Color(0, 128, 128);
	public static final Color THISTLE = new Color(216, 191, 216);
	public static final Color TOMATO = new Color(253, 99, 71);
	public static final Color TURQUOISE = new Color(64, 224, 208);

	// V

	public static final Color VIOLET = new Color(238, 130, 238);

	// W

	public static final Color WHEAT = new Color(245, 222, 179);
	public static final Color WHITE = new Color(255, 255, 255);
	public static final Color WHITE_SMOKE = new Color(245, 245, 245);

	// Y

	public static final Color YELLOW = new Color(255, 255, 0);
	public static final Color YELLOW_GREEN = new Color(154, 205, 50);

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ B
	// ]----------------------------------------------------//

	public static Color blend(Color first_color, Color second_color) {

		return ColorPalette.blend(first_color, second_color, 0.5);
	}

	public static Color blend(Color first_color, Color second_color, double ratio) {

		final float r = (float) ratio;
		final float ir = (float) 1.0 - r;

		final float first_color_rgb[] = new float[3];
		final float second_color_rgb[] = new float[3];

		first_color.getColorComponents(first_color_rgb);
		second_color.getColorComponents(second_color_rgb);

		final Color result_color = new Color(first_color_rgb[0] * r + second_color_rgb[0] * ir,
				first_color_rgb[1] * r + second_color_rgb[1] * ir, first_color_rgb[2] * r + second_color_rgb[2] * ir);

		return result_color;
	}

	// ----------------------------------------------------[ D
	// ]----------------------------------------------------//

	public static Color darken(Color color, double rate) {

		int red = (int) Math.round(color.getRed() * (1.0 - rate));
		int green = (int) Math.round(color.getGreen() * (1.0 - rate));
		int blue = (int) Math.round(color.getBlue() * (1.0 - rate));

		if (red < 0) {
			red = 0;
		} else if (red > 255) {
			red = 255;
		}
		if (green < 0) {
			green = 0;
		} else if (green > 255) {
			green = 255;
		}
		if (blue < 0) {
			blue = 0;
		} else if (blue > 255) {
			blue = 255;
		}

		final int alpha = color.getAlpha();

		return new Color(red, green, blue, alpha);
	}

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	public static Color get(int rgb) {

		return new Color(rgb);
	}

	public static Color get(int r, int g, int b) {

		return new Color(r, g, b);
	}

	public static Color get(String hex) {

		return Color.decode(hex);
	}

	public static Color[] getDefaults() {

		final Color[] defaults = {

				ORANGE_RED, DODGER_BLUE, SLATE_GRAY, SPRING_GREEN, SANDY_BROWN, BLACK, ORANGE, ORCHID, YELLOW,
				DEEP_PINK };

		return defaults;
	}

	public static double getDistance(Color first_color, Color second_color) {

		final int red = second_color.getRed() - first_color.getRed();
		final int green = second_color.getGreen() - first_color.getGreen();
		final int blue = second_color.getBlue() - first_color.getBlue();

		return Math.sqrt(Math.pow(red, 2) + Math.pow(green, 2) + Math.pow(blue, 2));
	}

	public static Color[] getPredefined() {

		final Color[] predefined = {

				// A

				ALICE_BLUE, ANTIQUE_WHITE, AQUA, AQUAMARINE, AZURE,

				// B

				BEIGE, BISQUE, BLACK, BLANCHED_ALMOND, BLUE, BLUE_VIOLET, BROWN, BURLY_WOOD,

				// C

				CADET_BLUE, CHARTREUSE, CHOCOLATE, CORAL, CORNFLOWER_BLUE, CORNSILK, CRIMSON, CYAN,

				// D

				DARK_BLUE, DARK_CYAN, DARK_GOLDEN_ROD, DARK_GRAY, DARK_GREEN, DARK_KHAKI, DARK_MAGENTA,
				DARK_OLIVE_GREEN, DARK_ORANGE, DARK_ORCHID, DARK_RED, DARK_SALMON, DARK_SEA_GREEN, DARK_SLATE_BLUE,
				DARK_SLATE_GRAY, DARK_TURQUOISE, DARK_VIOLET, DEEP_PINK, DEEP_SKY_BLUE, DIM_GRAY, DODGER_BLUE,

				// F

				FIRE_BRICK, FLORAL_WHITE, FOREST_GREEN, FUCHSIA,

				// G

				GAINSBORO, GHOST_WHITE, GOLD, GOLDEN_ROD, GRAY, GREEN, GREEN_YELLOW,

				// H

				HONEY_DEW, HOT_PINK,

				// I

				INDIAN_RED, INDIGO, IVORY,

				// K

				KHAKI,

				// L

				LAVENDER, LAVENDER_BLUSH, LAWN_GREEN, LEMON_CHIFFON, LIGHT_BLUE, LIGHT_CORAL, LIGHT_CYAN,
				LIGHT_GOLDEN_ROD_YELLOW, LIGHT_GREEN, LIGHT_GRAY, LIGHT_PINK, LIGHT_SALMON, LIGHT_SEA_GREEN,
				LIGHT_SKY_BLUE, LIGHT_SLATE_GRAY, LIGHT_STEEL_BLUE, LIGHT_YELLOW, LIME, LIME_GREEN, LINEN,

				// M

				MAGENTA, MAROON, MEDIUM_AQUA_MARINE, MEDIUM_BLUE, MEDIUM_ORCHID, MEDIUM_PURPLE, MEDIUM_SEA_GREEN,
				MEDIUM_SLATE_BLUE, MEDIUM_SPRING_GREEN, MEDIUM_TURQUOISE, MEDIUM_VIOLET_RED, MIDNIGHT_BLUE, MINT_CREAM,
				MISTY_ROSE, MOCCASSIN,

				// N

				NAVAJO_WHITE, NAVY,

				// O

				OLD_LACE, OLIVE, OLIVE_DRAB, ORANGE, ORANGE_RED, ORCHID,

				// P

				PALE_GOLDEN_ROD, PALE_GREEN, PALE_TURQUOISE, PALE_VIOLET_RED, PAPAYA_WHIP, PEACH_PUFF, PERU, PINK, PLUM,
				POWDER_BLUE, PURPLE,

				// R

				RED, ROSY_BROWN, ROYAL_BLUE,

				// S

				SADDLE_BROWN, SALMON, SANDY_BROWN, SEA_GREEN, SEA_SHELL, SIENNA, SILVER, SKY_BLUE, SLATE_BLUE,
				SLATE_GRAY, SNOW, SPRING_GREEN, STEEL_BLUE,

				// T

				TAN, TEAL, THISTLE, TOMATO, TURQUOISE,

				// V

				VIOLET,

				// W

				WHEAT, WHITE, WHITE_SMOKE,

				// Y

				YELLOW, YELLOW_GREEN };

		return predefined;
	}

	public static Color getRandom() {

		final Random random = new Random();

		return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	}

	public static Color getRandomPredefined() {

		final Random random = new Random();

		final Color[] predefined_colors = ColorPalette.getPredefined();

		return predefined_colors[random.nextInt(predefined_colors.length)];
	}

	// ----------------------------------------------------[ I
	// ]----------------------------------------------------//

	public static boolean isDark(Color color) {

		return ColorPalette.getDistance(color, Color.BLACK) < ColorPalette.getDistance(color, Color.WHITE);
	}

	// ----------------------------------------------------[ L
	// ]----------------------------------------------------//

	public static Color light(Color color, double rate) {

		int red = (int) Math.round(color.getRed() * (1.0 + rate));
		int green = (int) Math.round(color.getGreen() * (1.0 + rate));
		int blue = (int) Math.round(color.getBlue() * (1.0 + rate));

		if (red < 0) {
			red = 0;
		} else if (red > 255) {
			red = 255;
		}
		if (green < 0) {
			green = 0;
		} else if (green > 255) {
			green = 255;
		}
		if (blue < 0) {
			blue = 0;
		} else if (blue > 255) {
			blue = 255;
		}

		final int alpha = color.getAlpha();

		return new Color(red, green, blue, alpha);
	}

	// ----------------------------------------------------[ T
	// ]----------------------------------------------------//

	public static String toHex(Color color) {

		return Integer.toHexString(color.getRGB());
	}
}
