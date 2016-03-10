package com.ampersand.lcu.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class RuntimeUtils {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public static void cancelShutdown() {

		try {

			Runtime.getRuntime().exec("shutdown -a");
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	// ----------------------------------------------------[ F
	// ]----------------------------------------------------//

	public static void forceShutdown() {

		try {

			Runtime.getRuntime().exec("shutdown -f");
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	// ----------------------------------------------------[ I
	// ]----------------------------------------------------//

	public static boolean is32Bit() {

		return System.getProperty("os.arch").contains("32");
	}

	public static boolean is64Bit() {

		return System.getProperty("os.arch").contains("64");
	}

	public static boolean isLinux() {

		return System.getProperty("os.name").startsWith("Linux");
	}

	public static boolean isLinux32() {

		return isLinux() && is32Bit();
	}

	public static boolean isLinux64() {

		return isLinux() && is64Bit();
	}

	public static boolean isMac() {

		return System.getProperty("os.name").startsWith("Mac");
	}

	public static boolean isMac32() {

		return isMac() && is32Bit();
	}

	public static boolean isMac64() {

		return isMac() && is64Bit();
	}

	public static boolean isWindows() {

		return System.getProperty("os.name").startsWith("Windows");
	}

	public static boolean isWindows32() {

		return isWindows() && is32Bit();
	}

	public static boolean isWindows64() {

		return isWindows() && is64Bit();
	}

	// ----------------------------------------------------[ L
	// ]----------------------------------------------------//

	public static void launch(String command) {

		try {

			final Runtime runtime = Runtime.getRuntime();
			final Process process = runtime.exec(command);
			final BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;

			while ((line = input.readLine()) != null) {

				System.out.println(line);
			}

			if (process.waitFor() != 0) {

				System.out.println("<!> An error has occurred!");
			}
		} catch (final InterruptedException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	public static void logOff() {

		try {

			Runtime.getRuntime().exec("shutdown -l");
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	public static void reboot() {

		try {

			Runtime.getRuntime().exec("shutdown -r");
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	public static void reboot(int delay) {

		try {

			Runtime.getRuntime().exec("shutdown -r -t " + delay);
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	public static void shutdown() {

		try {

			Runtime.getRuntime().exec("shutdown -s");
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	public static void shutdown(int delay) {

		try {

			Runtime.getRuntime().exec("shutdown -s -t " + delay);
		} catch (final IOException e) {

			System.err.println(e);
		}
	}
}