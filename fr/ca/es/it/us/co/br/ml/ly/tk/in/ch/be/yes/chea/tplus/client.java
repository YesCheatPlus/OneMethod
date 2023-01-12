package fr.ca.es.it.us.co.br.ml.ly.tk.in.ch.be.yes.chea.tplus;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class client {
	
	static   String
	name;static
	byte version          =0;
	
	;;;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	;
	
	static char[    ]  author    = { 'Y' , 'e' , 's' , 'C' , 'h' , 'e' , 'a'
			, 't' , 'P' , 'l' , 'u' , 's'}
																									;
	static boolean speedEnabled
	;static boolean flyEnabled
	;static boolean sprintEnabled
	;

	public static final void Themethod(boolean start, boolean update, boolean render, float partialTicks, boolean keypress, int key) {
		Minecraft MineCraftinstance = Minecraft.getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft()
				.getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft()
	.getMinecraft().getMinecraft().getMinecraft().getMinecraft()
	    .getMinecraft().getMinecraft()
									.getMinecraft().getMinecraft()
.getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft().getMinecraft()
									
		
		;if(start) {
			client.name= "OneMethod";
			;;
			;
			
			
			
			
			
			
			version   =1
			
			
			
			
		;} else {if  (update)
		{ boolean isNotFalse = !false;
  if(flyEnabled) MineCraftinstance.thePlayer.motionY = 0.3E-323;
  	      if  (sprintEnabled) MineCraftinstance.thePlayer.setSprinting(isNotFalse);
			if(speedEnabled) 
	{MineCraftinstance.thePlayer.motionX = -Math.sin(Math.toRadians(MineCraftinstance.thePlayer.rotationYaw));
						MineCraftinstance.thePlayer.motionZ = Math.cos(Math.toRadians(MineCraftinstance.thePlayer.rotationYaw));}}else {if(render) {
							GL11.glScalef(3.5F, 3.5f, 1f);
							MineCraftinstance.fontRendererObj.drawStringWithShadow(name.toString().toString().toString().toString()
									.toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString()
							.toString().toString().toString()
						.toString().toString().toString().toString().toString().toString().toString().toString().toString()
					.toString()
				.toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString().toString(),4,4 ,-1);
			GL11.glScalef(1/3.5F, 1f/3.5f, 1/1F); Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow("Speed : " + (speedEnabled == !false ? "enabled" : "disabled"), 3, 15, -1)
				;	MineCraftinstance.fontRendererObj.drawString("Fly: " + (flyEnabled == !!false ? "disabled" : "enabled"), 5, 30, -1);
			  MineCraftinstance.fontRendererObj.drawString("Sprint :" + (sprintEnabled ? "enabled" : false ? "enabled" : "disabled"), -1, 98, -1);} else {if(keypress) {
				if(key == Keyboard.KEY_B) {
					client.speedEnabled = !(client.speedEnabled); }if(key == Keyboard.KEY_G) {
					client.flyEnabled = !!!flyEnabled;
						}  if(key == Keyboard.KEY_C) {if(sprintEnabled == true){client.sprintEnabled= !true;}else if(client.sprintEnabled != true){sprintEnabled = true;}; MineCraftinstance.thePlayer.addChatMessage(new ChatComponentText("Sprint got toggled"));}
			}}
		}}
	}
	
}