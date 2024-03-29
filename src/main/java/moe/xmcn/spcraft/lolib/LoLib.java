package moe.xmcn.spcraft.lolib;

import moe.xmcn.spcraft.lolib.modules.logger.Logger;
import moe.xmcn.spcraft.lolib.objects.PluginCore;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class LoLib extends JavaPlugin {

    private static Plugin LoLibInstance;

    // 定义对象
    public static PluginCore INSTANCE;
    private static Logger logger;

    @Override
    public void onEnable() {
        LoLibInstance = this;
        // 定义插件入口
        INSTANCE = new PluginCore(LoLibInstance);
        logger = INSTANCE.getLogger();

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
