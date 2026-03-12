# BedrockOnly

***BedrockOnly** is a specialized connection filter for **PaperMC 1.21+** servers. It is designed for server administrators who wish to create a Bedrock-exclusive environment—similar to the architecture used by networks like CubeCraft—without the manual overhead of managing a whitelist.

---

# Dependency
This plugin requires GeyserMC and floodgate to function. [Click to Download](https://geysermc.org/download)

---

## Key Features & Why You Should Download It

* **Automated Connection Filtering:** Automatically restricts access to Bedrock Edition players by identifying
connection types via the Floodgate API. This removes the need for manual whitelisting.
* **Java Admin Exemptions:** Allows specific Java Edition accounts (such as staff or developers) to bypass the restriction via the `exempt-java-players` list in the configuration.
* **Minimal Overhead:** Built to be lightweight, ensuring minimal impact on your server's performance. Perfect for small to medium-sized survival, semi-vanilla, or even large public servers that just need bedrock only functionality.
* **Customize Plugin Messages:** Customize all BedrockOnly messages completely on `messages.yml`! Uses MiniMessage so you can have gradients, hex, clickable text and more! No more ugly § color codes! MiniMessage formatter: [https://webui.advntr.dev/](https://webui.advntr.dev/)
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
