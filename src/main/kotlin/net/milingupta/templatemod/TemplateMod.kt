package net.milingupta.templatemod

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object TemplateMod : ModInitializer {
	private const val MOD_ID = "templatemod"
    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}