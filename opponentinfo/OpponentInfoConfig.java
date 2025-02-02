/*
 * Copyright (c) 2018, Jordan Atwood <jordan.atwood423@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.opponentinfo;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("opponentinfo")
public interface OpponentInfoConfig extends Config
{
	@ConfigItem(
		keyName = "lookupOnInteraction",
		name = "Lookup players on interaction",
		description = "Display a combat stat comparison panel on player interaction. (follow, trade, challenge, attack, etc.)",
		position = 0
	)
	default boolean lookupOnInteraction()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hitpointsDisplayStyle",
		name = "Hitpoints display style",
		description = "Show opponent's hitpoints as a value (if known), percentage, or both",
		position = 1
	)
	default HitpointsDisplayStyle hitpointsDisplayStyle()
	{
		return HitpointsDisplayStyle.HITPOINTS;
	}

	@ConfigItem(
		keyName = "showOpponentsOpponent",
		name = "Show opponent's opponent",
		description = "Toggle showing opponent's opponent if within a multi-combat area",
		position = 2
	)
	default boolean showOpponentsOpponent()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showAttackersMenu",
		name = "Show attackers in menu",
		description = "Marks attackers' names in menus with a *<br>",
		position = 3,
		warning = "NOTE: This'll also mark people who are following you/interacting with you in any other way. Don't blindly trust this in pvp!"
	)
	default boolean showAttackersMenu()
	{
		return false;
	}

	@ConfigItem(
		keyName = "showAttackingMenu",
		name = "Green main target",
		description = "Display main target's name colored in menus (Players and NPCs)",
		position = 4,
		warning = "NOTE: This'll also show green when following/interacting in any other way. Don't blindly trust this in pvp!"
	)
	default boolean showAttackingMenu()
	{
		return false;
	}

	@ConfigItem(
		keyName = "attackingColor",
		name = "Target color",
		description = "The color your target will be highlighted with",
		position = 5
	)
	default Color attackingColor()
	{
		return Color.GREEN;
	}

	@ConfigItem(
		keyName = "showHitpointsMenu",
		name = "Show NPC hp in menu",
		description = "Show NPC hp in menu. Useful when barraging",
		position = 6
	)
	default boolean showHitpointsMenu()
	{
		return false;
	}

	@ConfigItem(
			keyName = "waitTime",
			name = "Wait Time",
			description = "How long should the Player Comparison Overlay linger for",
			position = 3
	)
	default int waitTime()
	{
		return 5;
	}
}
