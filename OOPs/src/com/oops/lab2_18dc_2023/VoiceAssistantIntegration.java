package com.oops.lab2_18dc_2023;

public class VoiceAssistantIntegration extends SmartHomeDevice
{
   
	public  VoiceAssistantIntegration(String type)
	{
		super(type);
	}
	
	public void executeVoiceCommand(String command)
	{
		if(command.equals("turn on"))
		{
			turnOn();
		}
		else if(command.equals("turn off"))
		{
			turnOff();
		}
		else if(command.equals("dim"))
		{
			System.out.println("Adjusting brightness...");
		}
		else if(command.equals("set temperature"))
		{
			System.out.println("Setting temperature...");
		}
		else
		{
			System.out.println("Command not recognized.");
		}
	}

}
