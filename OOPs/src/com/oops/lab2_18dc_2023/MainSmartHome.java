package com.oops.lab2_18dc_2023;

import java.util.Scanner;

public class MainSmartHome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter device name:");
		String deviceType =sc.nextLine();
		
		System.out.print("Enter Voice Command:");
		String command = sc.nextLine();
		
		VoiceAssistantIntegration  vat = new VoiceAssistantIntegration(deviceType);
		vat.executeVoiceCommand(command);
		sc.close();
	}

}
