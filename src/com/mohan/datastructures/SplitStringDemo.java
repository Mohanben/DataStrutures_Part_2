package com.mohan.datastructures;

public class SplitStringDemo {

	public static void main(String[] args) {
		String name = "fm://10907,876";
		// broadcastradio://program/AMFM_FREQUENCY/87700
		String gooleUri = createUri(name);
		String aptiveUri = recreateAptiveUri(gooleUri);
		System.err.println("Google Uri ==== " + gooleUri);
		System.err.println("aptiveUri ==== " + aptiveUri);
	}

	private static String recreateAptiveUri(String uri) {
		// broadcastradio://program/FM/10907
		String mUri = uri.substring(25);
		// System.out.println(mUri);
		String[] mBandFm = mUri.split("/");
		String mBandName = mBandFm[0].toLowerCase();
		// System.out.println(mBandName);
		String aptiveUri = mBandName + "://" + mBandFm[1];
		// System.out.println(aptiveUri);
		return aptiveUri;
	}

	private static String createUri(String name) {
		String URI_CONSTANT = "broadcastradio://program/FM/";
		String mSplit = name.substring(5);
		// System.out.println(mSplit);
		String[] string = mSplit.split(",");
		// System.err.println(string[0]);
		String mGoogleUri = URI_CONSTANT + string[0];
		// System.out.println("Goole Uri === " + mGoogleUri);
		return mGoogleUri;
	}

}
