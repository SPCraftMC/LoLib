package moe.xmcn.spcraft.lolib;

import moe.xmcn.spcraft.lolib.modules.logger.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class LoLib extends JavaPlugin {

    Logger logger = new Logger(this);

    @Override
    public void onEnable() {
        logger.info("LoLib 正在初始化......");
        // TODO: 留着到时候用的位置

        logger.info("LoLib 初始化完毕");
    }

    @Override
    public void onDisable() {
        logger.info("LoLib 正在关闭");
        // TODO: 可能会用到一些手动卸载，留个位置做钩子
    }
}
