package moe.xmcn.spcraft.lolib.modules.toml;

import moe.xmcn.spcraft.lolib.LoLib;
import moe.xmcn.spcraft.lolib.objects.PluginCore;
import org.jetbrains.annotations.NotNull;
import org.tomlj.Toml;
import org.tomlj.TomlParseResult;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class TomlConfiguration {

    private File file;
    private final PluginCore core = LoLib.INSTANCE;

    public TomlConfiguration(@NotNull File file) {
        this.file = file;
    }

    private TomlParseResult toml = loadTomlConfiguration();

    /**
     * 加载新配置文件
     *
     * @param file 文件
     * @return
     */
    public void loadNewConfiguration(File file) {
        this.file = file;
        toml = loadTomlConfiguration();
    }

    // 轮子
    /// String
    public boolean isString(String dottedKey) {
        return toml.isString(dottedKey);
    }
    public boolean isString(List<String> path) {
        return toml.isString(path);
    }
    public String getString(List<String> path) {
        return toml.getString(path);
    }
    public String getString(String dottedKey, Supplier<String> defaultValue) {
        return toml.getString(dottedKey, defaultValue);
    }
    private String getString(List<String> path, Supplier<String> defaultValue) {
        return toml.getString(path, defaultValue);
    }
    public String getString(String dottedKey) {
        return toml.getString(dottedKey);
    }
    /// Object
    public Object get(String dottedKey) {
        return toml.get(dottedKey);
    }
    public Object get(List<String> path) {
        return toml.get(path);
    }
    /// Long
    public boolean isLong(String dottedKey) {
        return toml.isLong(dottedKey);
    }
    public boolean isLong(List<String> path) {
        return toml.isLong(path);
    }
    public Long getLong(String dottedKey) {
        return toml.getLong(dottedKey);
    }
    public Long getLong(List<String> path) {
        return toml.getLong(path);
    }
    public long getLong(String dottedKey, LongSupplier defaultValue) {
        return toml.getLong(dottedKey, defaultValue);
    }
    public long getLong(List<String> path, LongSupplier defaultValue) {
        return toml.getLong(path, defaultValue);
    }

    private TomlParseResult loadTomlConfiguration() {
        try {
            return Toml.parse(new FileReader(file));
        } catch (Exception e) {
            core.getLogger().errorException(e);
            return null;
        }
    }

}
