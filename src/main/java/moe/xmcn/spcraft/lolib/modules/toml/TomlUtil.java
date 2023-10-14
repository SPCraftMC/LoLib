package moe.xmcn.spcraft.lolib.modules.toml;

import com.alibaba.fastjson2.JSON;
import moe.xmcn.spcraft.lolib.LoLib;
import moe.xmcn.spcraft.lolib.objects.PluginCore;
import org.tomlj.Toml;
import org.tomlj.TomlArray;
import org.tomlj.TomlTable;

import java.io.InvalidObjectException;
import java.util.HashMap;
import java.util.Map;

public class TomlUtil {

    private final PluginCore core = LoLib.INSTANCE;

    private TomlArray array = null;
    private TomlTable table = null;


    public TomlUtil(TomlArray tomlArray) {
        this.array = tomlArray;
    }
    public TomlUtil(TomlTable tomlTable) {
        this.table = tomlTable;
    }

    public Map<String, Object> toMap() {
        if (check()) {
            return new HashMap<String, Object>(JSON.parseObject(array.toJson()));
        } else {
            core.getLogger().error("Can't build a Map<>() with a invalid input.");
            return null;
        }
    }

    private boolean check() {
        if (array == null && table == null) return false;
        else return array == null || table == null;
    }

}
