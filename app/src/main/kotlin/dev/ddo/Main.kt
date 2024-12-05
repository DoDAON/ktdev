package dev.ddo

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("${name} 플러그인이 활성화되었습니다!")  // description.name 대신 name 사용
    }

    override fun onDisable() {
        logger.info("${name} 플러그인이 비활성화되었습니다!")  // description.name 대신 name 사용
    }
}