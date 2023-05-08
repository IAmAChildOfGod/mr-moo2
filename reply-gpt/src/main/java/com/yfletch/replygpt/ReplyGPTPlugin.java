package com.yfletch.replygpt;

import com.google.inject.Inject;
import com.google.inject.Provides;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.input.Keyboard;
import org.pf4j.Extension;

@Extension
@Slf4j
@PluginDescriptor(
	name = "Giant Mole",
	enabledByDefault = false,
	description = "Giant Mole Plugin"
)
public class ReplyGPTPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;


	@Override
	protected void startUp()
	{

	}

	@Override
	protected void shutDown() throws Exception
	{

	}



	@Provides
	ReplyGPTConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ReplyGPTConfig.class);
	}
}
