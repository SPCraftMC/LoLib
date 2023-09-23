package moe.xmcn.spcraft.lolib.modules.logger;

import moe.xmcn.spcraft.lolib.objects.PluginCore;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * 日志模块
 */
public class Logger {

    private @NotNull PluginCore pluginCore;
    private final Plugin plugin = pluginCore.getInstance();

    public Logger(@NotNull PluginCore pluginCore) {
        this.pluginCore = pluginCore;
    }

    // 获取原始插件日志模块对象
    java.util.logging.Logger logger = plugin.getLogger();

    /**
     * INFO 等级
     * @param value 日志文本
     */
    public void info(String value) {
        logger.info(value);
    }
    /**
     * INFO 等级
     * @param value 日志文本列表
     */
    public void info(@NotNull ArrayList<String> value) {
        for (String s : value) {
            info(s);
        }
    }
    /**
     * INFO 等级
     * @param value 日志文本列表
     */
    public void info(@NotNull List<String> value) {
        for (String s : value) {
            info(s);
        }
    }
    /**
     * INFO 等级
     * @param value 日志文本列表
     */
    public void info(String @NotNull [] value) {
        for (String s : value) {
            info(s);
        }
    }

    /**
     * WARN 等级
     * @param value 日志文本
     */
    public void warn(String value) {
        logger.warning(value);
    }
    /**
     * WARN 等级
     * @param value 日志文本列表
     */
    public void warn(@NotNull ArrayList<String> value) {
        for (String s : value) {
            warn(s);
        }
    }
    /**
     * WARN 等级
     * @param value 日志文本列表
     */
    public void warn(@NotNull List<String> value) {
        for (String s : value) {
            warn(s);
        }
    }
    /**
     * WARN 等级
     * @param value 日志文本列表
     */
    public void warn(String @NotNull [] value) {
        for (String s : value) {
            warn(s);
        }
    }

    /**
     * 用 WARN 等级输出异常
     * @param exception 异常
     */
    public void warnException(@NotNull Exception exception) {
        warn(exception.getMessage());
        for (StackTraceElement s : exception.getStackTrace()) {
            warn("- " + s);
        }
    }

    /**
     * ERROR 等级
     * @param value 日志文本
     */
    public void error(String value) {
        logger.severe(value);
    }
    /**
     * ERROR 等级
     * @param value 日志文本列表
     */
    public void error(@NotNull ArrayList<String> value) {
        for (String s : value) {
            error(s);
        }
    }
    /**
     * ERROR 等级
     * @param value 日志文本列表
     */
    public void error(@NotNull List<String> value) {
        for (String s : value) {
            error(s);
        }
    }
    /**
     * ERROR 等级
     * @param value 日志文本列表
     */
    public void error(String @NotNull [] value) {
        for (String s : value) {
            error(s);
        }
    }

    /**
     * 用 ERROR 等级输出异常
     * @param exception 异常
     */
    public void errorException(@NotNull Exception exception) {
        error(exception.getMessage());
        for (StackTraceElement s : exception.getStackTrace()) {
            error("- " + s);
        }
    }

    /**
     * FATAL 等级
     * 致命级别会卸载插件
     * @param value 日志信息
     */
    public void fatal(String value) {
        if (value != null)
            logger.severe("[FATAL] " + value);
        plugin.getServer().getPluginManager().disablePlugin(plugin);
    }
    /**
     * 用 FATAL 等级输出异常
     * 致命级别会卸载插件
     * @param exception 异常
     */
    public void fatalException(@NotNull Exception exception) {
        fatal(exception.getMessage());
        for (StackTraceElement s : exception.getStackTrace()) {
            fatal("- " + s);
        }
    }
}
