# BedrockOnly

**BedrockOnly** is a lightweight plugin that only allows bedrock players designed for **PaperMC 1.21+** servers. It gives ability for server admins who wanted to allow bedrock players or excepmted java players to join their servers.

---

# Dependency
This plugin requires GeyserMC and floodgate to work. [Click to Download](https://geysermc.org/download)

---

## Key Features & Why You Should Download It

* **Bedrock-Only Functionality:** Allow bedrock players only or exempted java players in your server, like in bedrock servers like CubeCraft (not sponsored).
* **Minimal Overhead:** Built to be lightweight, ensuring minimal impact on your server's performance. Perfect for small to medium-sized survival, semi-vanilla, or even large public servers that just need bedrock only functionality.
* **Customize Plugin Messages:** Customize all WaterHomes messages completely on `messages.yml`! Uses MiniMessage so you can have gradients, hex, clickable text and more! No more ugly § color codes! MiniMessage formatter: [https://webui.advntr.dev/](https://webui.advntr.dev/)
* **Blocked Java player logger:** Shows in your console who is not excempted or not bedrock player that is trying to join your server.
* **Modern Server Support:** Built specifically for the latest **PaperMC 1.21+** versions and its forks, guaranteeing up-to-date performance and stability.
* **Open Source:** Developed under the **GNU General Public License v3.0**, allowing for transparency and community contributions.

---

## Commands & Usage
**(<> is optional, [] is required):**

| Command                      | Description                               | Permission          |
|:-----------------------------|:------------------------------------------|:--------------------|
| `/bedrockonly [info/reload]` | Reload or see the info of the plugin.     | `bedrockonly.admin` |

---

## Default Configs
Default configs used on the plugin.

<details>
<summary>config.yml</summary>

```yaml
# BedrockOnly - Only allows bedrock players on your server!
# Support: https://discord.gg/Scgqfm5EU4
# GitHub Source Code: https://github.com/WatermanMC/BedrockOnly

# Exempt java players on the kick
exempt-java-players:
  - Notch
  - membercatcousin
```
</details>

<details>
<summary>messages.yml</summary>

```yaml
# Only allows MiniMessage!
# MiniMessage formatter: https://webui.advntr.dev/

nopermission-command: "<red>You don't have permission to execute this command."
reloaded: "<green>Plugin reloaded!"
kick-message: "<red>Can't connect to this server."
```
</details>

---

## Links & Additional Information

**Author:** WatermanMC

* **GitHub Repository:** [https://github.com/WatermanMC/BedrockOnly](https://github.com/WatermanMC/BedrockOnly)
* **Discord Support:** [https://discord.gg/Scgqfm5EU4](https://discord.gg/Scgqfm5EU4)

---

This plugin is also owned by **VOXELWARE STUDIOS**.

---