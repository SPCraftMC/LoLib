package moe.xmcn.spcraft.lolib.modules.toml;

import moe.xmcn.spcraft.lolib.LoLib;
import moe.xmcn.spcraft.lolib.objects.PluginCore;
import org.jetbrains.annotations.NotNull;
import org.tomlj.Toml;
import org.tomlj.TomlArray;
import org.tomlj.TomlParseResult;
import org.tomlj.TomlTable;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public abstract class TomlConfiguration {

    private File file;
    private final PluginCore core = LoLib.INSTANCE;

    public TomlConfiguration(@NotNull File file) {
        this.file = file;
    }

    private TomlParseResult toml = loadTomlConfiguration();

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

    /// Double
    public boolean isDouble(String dottedKey) {
        return toml.isDouble(dottedKey);
    }
    public boolean isDouble(List<String> path) {
        return toml.isDouble(path);
    }
    public Double getDouble(String dottedKey) {
        return toml.getDouble(dottedKey);
    }
    public Double getDouble(List<String> path) {
        return toml.getDouble(path);
    }
    public Double getDouble(String dottedKey, DoubleSupplier defaultValue) {
        return toml.getDouble(dottedKey, defaultValue);
    }
    public Double getDouble(List<String> path, DoubleSupplier defaultValue) {
        return toml.getDouble(path, defaultValue);
    }

    /// Array
    public boolean isArray(String dottedKey) {
        return toml.isArray(dottedKey);
    }
    public boolean isArray(List<String> path) {
        return toml.isArray(path);
    }
    public TomlArray getArray(String dottedKey) {
        return toml.getArray(dottedKey);
    }
    public TomlArray getArray(List<String> path) {
        return toml.getArray(path);
    }
    public TomlArray getArrayOrEmpty(String dottedKey) {
        return toml.getArrayOrEmpty(dottedKey);
    }

    public TomlArray getArrayOrEmpty(List<String> path) {
        return toml.getArrayOrEmpty(path);
    }

    /// OffsetDateTime
    public boolean isOffsetDateTime(String dottedKey) {
        return toml.isOffsetDateTime(dottedKey);
    }
    public boolean isOffsetDateTime(List<String> path) {
        return toml.isOffsetDateTime(path);
    }
    public OffsetDateTime getOffsetDateTime(String dottedKey) {
        return toml.getOffsetDateTime(dottedKey);
    }
    public OffsetDateTime getOffsetDateTime(List<String> path) {
        return toml.getOffsetDateTime(path);
    }
    public OffsetDateTime getOffsetDateTime(String dottedKey, Supplier<OffsetDateTime> defaultValue) {
        return toml.getOffsetDateTime(dottedKey, defaultValue);
    }
    public OffsetDateTime getOffsetDateTime(List<String> path, Supplier<OffsetDateTime> defaultValue) {
        return toml.getOffsetDateTime(path, defaultValue);
    }

    /// LocalDateTime
    public boolean isLocalDateTime(String dottedKey) {
        return toml.isLocalDateTime(dottedKey);
    }
    public boolean isLocalDateTime(List<String> path) {
        return toml.isLocalDateTime(path);
    }
    public LocalDateTime getLocalDateTime(String dottedKey) {
        return toml.getLocalDateTime(dottedKey);
    }
    public LocalDateTime getLocalDateTime(List<String> path) {
        return toml.getLocalDateTime(path);
    }
    public LocalDateTime getLocalDateTime(String dottedKey, Supplier<LocalDateTime> defaultValue) {
        return toml.getLocalDateTime(dottedKey, defaultValue);
    }
    public LocalDateTime getLocalDateTime(List<String> path, Supplier<LocalDateTime> defaultValue) {
        return toml.getLocalDateTime(path, defaultValue);
    }

    /// LocalDate
    public boolean isLocalDate(String dottedKey) {
        return toml.isLocalDate(dottedKey);
    }
    public boolean isLocalDate(List<String> path) {
        return toml.isLocalDate(path);
    }
    public LocalDate getLocalDate(String dottedKey) {
        return toml.getLocalDate(dottedKey);
    }
    public LocalDate getLocalDate(List<String> path) {
        return toml.getLocalDate(path);
    }
    public LocalDate getLocalDate(String dottedKey, Supplier<LocalDate> defaultValue) {
        return toml.getLocalDate(dottedKey, defaultValue);
    }
    public LocalDate getLocalDate(List<String> path, Supplier<LocalDate> defaultValue) {
        return toml.getLocalDate(path, defaultValue);
    }

    /// LocalTime
    public boolean isLocalTime(String dottedKey) {
        return toml.isLocalTime(dottedKey);
    }
    public boolean isLocalTime(List<String> path) {
        return toml.isLocalTime(path);
    }
    public LocalTime getLocalTime(String dottedKey) {
        return toml.getLocalTime(dottedKey);
    }
    public LocalTime getLocalTime(List<String> path) {
        return toml.getLocalTime(path);
    }
    public LocalTime getLocalTime(String dottedKey, Supplier<LocalTime> defaultValue) {
        return toml.getLocalTime(dottedKey, defaultValue);
    }
    public LocalTime getLocalTime(List<String> path, Supplier<LocalTime> defaultValue) {
        return toml.getLocalTime(path, defaultValue);
    }

    /// Table
    public boolean isTable(String dottedKey) {
        return toml.isTable(dottedKey);
    }
    public boolean isTable(List<String> path) {
        return toml.isTable(path);
    }
    public TomlTable getTable(String dottedKey) {
        return toml.getTable(dottedKey);
    }
    public TomlTable getTable(List<String> path) {
        return toml.getTable(path);
    }
    public TomlTable getTableOrEmpty(String dottedKey) {
        return toml.getTableOrEmpty(dottedKey);
    }

    public TomlTable getTableOrEmpty(List<String> path) {
        return toml.getTableOrEmpty(path);
    }

    /**
     * 加载新配置文件
     *
     * @param file 文件
     */
    public void loadNewConfiguration(File file) {
        this.file = file;
        toml = loadTomlConfiguration();
    }

    private TomlParseResult loadTomlConfiguration() {
        try {
            if (file != null) {
                return Toml.parse(new FileReader(file));
            } else {
                core.getLogger().error(List.of(
                        "Can't to load TomlConfiguration without a file path!",
                        "Please contact the plugin author if you aren't the author."
                ));
            }
        } catch (Exception e) {
            core.getLogger().errorException(e);
        }
        return null;
    }

}
