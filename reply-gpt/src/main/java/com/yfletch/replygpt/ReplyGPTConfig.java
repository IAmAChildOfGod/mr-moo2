package com.yfletch.replygpt;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("reply-gpt")
public interface ReplyGPTConfig extends Config
{
	@ConfigItem(
		keyName = "apiKey",
		name = "OpenAI API Key",
		description = "",
		position = 0
	)
	default String apiKey()
	{
		return "";
	}

	@ConfigItem(
		keyName = "enabled",
		name = "Enabled",
		description = "Enables auto-reply for all chat",
		position = 1
	)
	default boolean enabled()
	{
		return false;
	}

	@ConfigSection(
		name = "Generator settings",
		description = "",
		position = 2
	)
	String generatorSettings = "generatorSettings";

	@ConfigItem(
		keyName = "prompt",
		name = "Prompt",
		description = "nom nom 23",
		position = 2,
		section = generatorSettings
	)
	default String prompt()
	{
		return "nom nom";
	}
}
