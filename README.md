> 正在开发，敬请期待

# LoLib

[![Jitpack](https://jitpack.io/v/SPCraftMC/LoLib.svg)](https://jitpack.io/v/SPCraftMC/LoLib)

SPCraftMC通用API库，用于提供一套统一的操作API。

## 功能设计

- [ ] NBT模块
- [ ] 玩家扩展模块
- [ ] GUI交互模块
- [x] Toml模块
- [x] 通用日志模块

Add it in your root build.gradle at the end of repositories:
```gradle
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
  }
}
```
Step 2. Add the dependency

```gradle
dependencies {
  implementation 'com.github.SPCraftMC:LoLib:1.0-beta.0'
}
```
