package io.battlerune;

/**
 * Holds all the connections.
 *
 * @author Daniel
 */
public enum Connection {
	/** The economy (main) world. */
	ECONOMY("ECO", "149.56.25.224"),

	/** The management world - used for private testing by the management team. */
	MANAGEMENT("MGN", "149.56.25.224"),

	/** The development world - used by developers. */
	DEVELOPMENT("DEV", "149.56.25.224");

	/** The connection name. */
	public final String name;

	/** The connection IP address. */
	public final String address;

	/** Constructs a new <code>Connection</code>. */
	Connection(String name, String address) {
		this.name = name;
		this.address = address;
	}
}