package com.fyfeng.android.tools.codec;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {/**
	 * Used to build output as Hex
	 */
	private static final char[] DIGITS_LOWER = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	/**
	 * Used to build output as Hex
	 */
	private static final char[] DIGITS_UPPER = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static final String MD5 = "MD5";
	public static final Charset UTF_8 = Charset.forName("UTF-8");
	private static final int STREAM_BUFFER_LENGTH = 1024;

	public static String md5Hex(byte[] data) {
		return encodeHexString(md5(data));
	}

	public static String encodeHexString(byte[] data) {
		return new String(encodeHex(data));
	}

	public static char[] encodeHex(byte[] data) {
		return encodeHex(data, true);
	}

	private static char[] encodeHex(byte[] data, boolean toLowerCase) {
		return encodeHex(data, toLowerCase ? DIGITS_LOWER : DIGITS_UPPER);
	}

	private static char[] encodeHex(byte[] data, char[] toDigits) {
		int l = data.length;
		char[] out = new char[l << 1];
		// two characters form the hex value.
		for (int i = 0, j = 0; i < l; i++) {
			out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
			out[j++] = toDigits[0x0F & data[i]];
		}
		return out;
	}

	public static String md5Hex(String data) {
		return encodeHexString(md5(data));
	}

	public static byte[] md5(byte[] data) {
		return getMd5Digest().digest(data);
	}

	public static byte[] md5(String data) {
		return md5(getBytesUtf8(data));
	}

	private static MessageDigest getMd5Digest() {
		try {
			return MessageDigest.getInstance(MD5);
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException(e);
		}
	}

	private static byte[] getBytesUtf8(String string) {

		if (string == null) {
			return null;
		}
		try {
			return string.getBytes(UTF_8.name());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String md5Hex(InputStream data) throws IOException {

		return new String(encodeHex(digest(getMd5Digest(), data)));
	}

	private static byte[] digest(MessageDigest digest, InputStream data)
			throws IOException {
		byte[] buffer = new byte[STREAM_BUFFER_LENGTH];
		int read = data.read(buffer, 0, STREAM_BUFFER_LENGTH);

		while (read > -1) {
			digest.update(buffer, 0, read);
			read = data.read(buffer, 0, STREAM_BUFFER_LENGTH);
		}

		return digest.digest();
	}}
