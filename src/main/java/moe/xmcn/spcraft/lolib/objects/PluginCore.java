package moe.xmcn.spcraft.lolib.objects;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import moe.xmcn.spcraft.lolib.modules.logger.Logger;

/**
 * 插件接口核心
 */
public class PluginCore {

    private final @NotNull Plugin plugin;

    public PluginCore(@NotNull Plugin plugin) {
        this.plugin = plugin;
    }

    /**
     * 获取插件对象
     * @return Plugin
     */
    public Plugin getInstance() {
        return plugin;
    }

    /**
     * 获取日志模块对象
     * @return Logger
     */
    public Logger getLogger() {
        return new Logger(this);
    }
}
