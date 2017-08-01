package com.helloselenium.android.julo.utils;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class EmailConfirmation {

	public static void confirmEmail(String email) {

		String url = "https://api.julofinance.com/api/qa/v1/customer/set_email_verified";

		try {
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

			con.setRequestMethod("PUT");
			con.setRequestProperty("Authorization", "token c560d9f59673f6c53214371e75d71bd12b429527");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Accept", "application/json");
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes("{\"email\"" + ":\"" + email + "\"}");
			wr.flush();
			wr.close();
			int responseCode = con.getResponseCode();
			System.out.println("Sending email confirmation request : " + url);
			System.out.println("Response Code : " + responseCode);
			con.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}