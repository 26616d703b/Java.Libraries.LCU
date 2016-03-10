package com.ampersand.lcu.gui.image;

import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.ShortLookupTable;

import javax.imageio.ImageIO;

import com.ampersand.lcu.gui.color.ColorPalette;

public final class ImageProcessingUtils {

	/*
	 * Attributes
	 */

	// COMPOSITES

	public static final int BRIGHTEN_COMPOSITE = 0;

	public static final int DARKEN_COMPOSITE = 1;

	// FILTERS

	public static final int BLUR_FILTER = 2;

	public static final int CONTRAST_INCREASE_FILTER = 3;
	public static final int CONTRAST_DECREASE_FILTER = 4;

	public static final int EDGE_DETECT_FILTER = 5;

	public static final int GRAYSCALE_FILTER = 6;

	public static final int INVERT_FILTER = 7;

	public static final int SHARPEN_FILTER = 8;

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ A
	// ]----------------------------------------------------//

	public static BufferedImage applyComposite(BufferedImage original, int composite_type) {

		BufferedImage result = null;

		switch (composite_type) {

		case BRIGHTEN_COMPOSITE:

			result = ImageProcessingUtils.brighten(original);

			break;

		case DARKEN_COMPOSITE:

			result = ImageProcessingUtils.darken(original);

			break;

		default:
			break;
		}

		return result;
	}

	public static BufferedImage applyFilter(BufferedImage original, int filter_type) {

		BufferedImage result = null;

		switch (filter_type) {

		case BLUR_FILTER:

			result = ImageProcessingUtils.blur(original);

			break;

		case CONTRAST_DECREASE_FILTER:

			result = ImageProcessingUtils.decreaseContrast(original);

			break;

		case CONTRAST_INCREASE_FILTER:

			result = ImageProcessingUtils.increaseContrast(original);

			break;

		case EDGE_DETECT_FILTER:

			result = ImageProcessingUtils.edgeDetect(original);

			break;

		case GRAYSCALE_FILTER:

			result = ImageProcessingUtils.grayscale(original);

			break;

		case INVERT_FILTER:

			result = ImageProcessingUtils.invert(original);

			break;

		case SHARPEN_FILTER:

			result = ImageProcessingUtils.sharpen(original);

			break;

		default:
			break;
		}

		return result;
	}

	// ----------------------------------------------------[ B
	// ]----------------------------------------------------//

	public static BufferedImage blur(BufferedImage original) {

		final float data[] = { 0.0625f, 0.125f, 0.0625f, 0.125f, 0.25f, 0.125f, 0.0625f, 0.125f, 0.0625f };

		final Kernel kernel = new Kernel(3, 3, data);
		final ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);

		return convolve.filter(original, null);
	}

	public static BufferedImage brighten(BufferedImage original) {

		return ImageProcessingUtils.brighten(original, 0.05);
	}

	public static BufferedImage brighten(BufferedImage original, double rate) {

		final short brighten[] = new short[256];

		for (int i = 0; i < 256; i++) {

			short pixel_value = (short) (i + i * 10);

			if (pixel_value < 0) {

				pixel_value = 0;
			} else if (pixel_value > 255) {

				pixel_value = 255;
			}

			brighten[i] = pixel_value;
		}

		final LookupTable lookupTable = new ShortLookupTable(0, brighten);
		final LookupOp lookup_op = new LookupOp(lookupTable, null);

		return lookup_op.filter(original, original);
	}

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public static BufferedImage createScreenCapture() {

		Robot robot = null;

		try {

			robot = new Robot();
		} catch (final AWTException e) {

			e.printStackTrace();
		}

		final BufferedImage screen_capture = robot
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		screen_capture.flush();

		return screen_capture;
	}

	// ----------------------------------------------------[ D
	// ]----------------------------------------------------//

	public static BufferedImage darken(BufferedImage original) {

		return ImageProcessingUtils.darken(original, 0.05);
	}

	public static BufferedImage darken(BufferedImage original, double rate) {

		final short brighten[] = new short[256];

		for (int i = 0; i < 256; i++) {

			short pixel_value = (short) (i - i * rate);

			if (pixel_value < 0) {

				pixel_value = 0;
			} else if (pixel_value > 255) {

				pixel_value = 255;
			}

			brighten[i] = pixel_value;
		}

		final LookupTable lookupTable = new ShortLookupTable(0, brighten);
		final LookupOp lookup_op = new LookupOp(lookupTable, null);

		return lookup_op.filter(original, original);
	}

	public static BufferedImage decreaseContrast(BufferedImage original) {

		return ImageProcessingUtils.decreaseContrast(original, 1.2);
	}

	private static BufferedImage decreaseContrast(BufferedImage original, double ratio) {

		final short brighten[] = new short[256];

		for (int i = 0; i < 256; i++) {

			short pixel_value = (short) (i / ratio);

			if (pixel_value < 0) {

				pixel_value = 0;
			} else if (pixel_value > 255) {

				pixel_value = 255;
			}

			brighten[i] = pixel_value;
		}

		final LookupTable lookup_table = new ShortLookupTable(0, brighten);
		final LookupOp lookup_op = new LookupOp(lookup_table, null);

		return lookup_op.filter(original, original);
	}

	// ----------------------------------------------------[ E
	// ]----------------------------------------------------//

	public static BufferedImage edgeDetect(BufferedImage original) {

		final float data[] = { 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f };

		final Kernel kernel = new Kernel(3, 3, data);
		final ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);

		return convolve.filter(original, null);
	}

	// ----------------------------------------------------[ F
	// ]----------------------------------------------------//

	public static BufferedImage flip(BufferedImage original) {

		return ImageProcessingUtils.rotate(original, 180);
	}

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	public static String[] getSupportedFormatNames() {

		return ImageIO.getReaderFormatNames();
	}

	public static BufferedImage grayscale(BufferedImage original) {

		final ColorConvertOp colorConvert = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);

		return colorConvert.filter(original, null);
	}

	// ----------------------------------------------------[ I
	// ]----------------------------------------------------//

	public static BufferedImage increaseContrast(BufferedImage original) {

		return ImageProcessingUtils.increaseContrast(original, 1.2);
	}

	private static BufferedImage increaseContrast(BufferedImage original, double ratio) {

		final short brighten[] = new short[256];

		for (int i = 0; i < 256; i++) {

			short pixel_value = (short) (i * ratio);

			if (pixel_value < 0) {

				pixel_value = 0;
			} else if (pixel_value > 255) {

				pixel_value = 255;
			}

			brighten[i] = pixel_value;
		}

		final LookupTable lookup_table = new ShortLookupTable(0, brighten);
		final LookupOp lookup_op = new LookupOp(lookup_table, null);

		return lookup_op.filter(original, original);
	}

	public static BufferedImage invert(BufferedImage original) {

		final byte reverse[] = new byte[256];

		for (int i = 0; i < 256; i++) {

			reverse[i] = (byte) (255 - i);
		}

		final LookupTable lookup_table = new ByteLookupTable(0, reverse);
		final LookupOp lookup_op = new LookupOp(lookup_table, null);

		return lookup_op.filter(original, original);
	}

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	// PLAIN

	public static BufferedImage resize(Image original, int width, int height, int type) {

		final BufferedImage resized = new BufferedImage(width, height, type);
		final Graphics2D graphics = resized.createGraphics();
		graphics.drawImage(original, 0, 0, width, height, null);
		graphics.dispose();

		return resized;
	}

	public static BufferedImage resize(BufferedImage original, int width, int height, int type) {

		final BufferedImage resized = new BufferedImage(width, height, type);
		final Graphics2D graphics = resized.createGraphics();
		graphics.drawImage(original, 0, 0, width, height, null);
		graphics.dispose();

		return resized;
	}

	// BORDER

	public static BufferedImage resizeWithBorder(Image original, int width, int height, int type) {

		final BufferedImage resized = new BufferedImage(width, height, type);
		final Graphics2D graphics = resized.createGraphics();
		graphics.drawImage(original, 0, 0, width, height, null);
		graphics.setColor(ColorPalette.BLACK);
		graphics.setStroke(new BasicStroke(2));
		graphics.drawRect(0, 0, width - 1, height - 1);
		graphics.dispose();

		return resized;
	}

	public static BufferedImage resizeWithBorder(BufferedImage original, int width, int height, int type) {

		final BufferedImage resized = new BufferedImage(width, height, type);
		final Graphics2D graphics = resized.createGraphics();
		graphics.drawImage(original, 0, 0, width, height, null);
		graphics.setColor(ColorPalette.BLACK);
		graphics.setStroke(new BasicStroke(2));
		graphics.drawRect(0, 0, width - 1, height - 1);
		graphics.dispose();

		return resized;
	}

	// HINT

	public static BufferedImage resizeWithHint(Image original, int width, int height, int type) {

		final BufferedImage resized = new BufferedImage(width, height, type);
		final Graphics2D graphics = resized.createGraphics();
		graphics.drawImage(original, 0, 0, width, height, null);
		graphics.dispose();
		graphics.setComposite(AlphaComposite.Src);
		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		return resized;
	}

	public static BufferedImage resizeWithHint(BufferedImage original, int width, int height, int type) {

		final BufferedImage resized = new BufferedImage(width, height, type);
		final Graphics2D graphics = resized.createGraphics();
		graphics.drawImage(original, 0, 0, width, height, null);
		graphics.dispose();
		graphics.setComposite(AlphaComposite.Src);
		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		return resized;
	}

	public static BufferedImage rotate(BufferedImage original, int angle) {

		final AffineTransform at = new AffineTransform();
		at.rotate(angle * Math.PI / 180.0, original.getWidth() / 2, original.getHeight() / 2);

		final BufferedImageOp bio = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);

		return bio.filter(original, null);
	}

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	public static BufferedImage sharpen(BufferedImage original) {

		final float data[] = { -1.0f, -1.0f, -1.0f, -1.0f, 9.0f, -1.0f, -1.0f, -1.0f, -1.0f };

		final Kernel kernel = new Kernel(3, 3, data);
		final ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);

		return convolve.filter(original, null);
	}

	// ----------------------------------------------------[ T
	// ]----------------------------------------------------//

	public static BufferedImage translucent(BufferedImage original, double alpha) {

		final BufferedImage result = new BufferedImage(original.getWidth(), original.getHeight(),
				Transparency.TRANSLUCENT);

		final Graphics2D g = result.createGraphics();
		g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) alpha));
		g.drawImage(original, null, 0, 0);
		g.dispose();

		return result;
	}
}
