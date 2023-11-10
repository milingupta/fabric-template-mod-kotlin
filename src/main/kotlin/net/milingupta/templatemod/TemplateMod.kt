package net.milingupta.templatemod

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object TemplateMod : ModInitializer {
	const val MOD_ID = "templatemod"
    val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}