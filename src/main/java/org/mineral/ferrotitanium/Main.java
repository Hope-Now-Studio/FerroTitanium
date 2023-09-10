package org.mineral.ferrotitanium;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	// 怎么说呢，这块地方就和控制台里面报错或者信息啥的前缀一样（或者说本来就是前缀
    public static final Logger LOGGER = LoggerFactory.getLogger("FerroTitanium");

	// 接下来就是添加物品与添加方块的代码了
	// 添加物品：无线电
	public static final Item WIRELESS_RADIO = new Item(new FabricItemSettings());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// 顾名思义，加载的时候运行的文字，但是这一块的内容会在Mod加载完毕后运行而不是Minecraft加载完毕之后
		// 所以资源什么的可能还没初始化
		// "Proceed with mild caution" 译为 谨慎行事

		LOGGER.info("Hello Fabric world!");
		// 注册物品：无线电
		Registry.register(Registries.ITEM, new Identifier("ferrotitanium","wireless_radio"), WIRELESS_RADIO);
	}
}