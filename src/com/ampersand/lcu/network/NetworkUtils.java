package com.ampersand.lcu.network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public final class NetworkUtils {

	/*
	 * Methods
	 */

	public static void listNets() {

		Enumeration<NetworkInterface> nets = null;

		try {

			nets = NetworkInterface.getNetworkInterfaces();

			for (final NetworkInterface netint : Collections.list(nets)) {

				System.out.println("Display name: " + netint.getDisplayName());
				System.out.println("Name: " + netint.getName());

				final Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();

				for (final InetAddress inetAddress : Collections.list(inetAddresses)) {

					System.out.println("IP Address: " + inetAddress.getHostAddress());
				}

				System.out.println("Parent: " + netint.getParent());
				System.out.println("Up? " + netint.isUp());
				System.out.println("Loopback? " + netint.isLoopback());
				System.out.println("PointToPoint? " + netint.isPointToPoint());
				System.out.println("Supports multicast? " + netint.isVirtual());
				System.out.println("Virtual? " + netint.isVirtual());
				System.out.println("Hardware address: " + Arrays.toString(netint.getHardwareAddress()));
				System.out.println("MTU: " + netint.getMTU());

				System.out.println("\n");
			}
		} catch (final SocketException e) {

			e.printStackTrace();
		}
	}
}
