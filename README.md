# Yuji DEX

Yuji DEX is an independent fork of the upstream YoukiDEX Android desktop project.

- **Application ID:** `com.yuji.dex.x`
- **Android namespace:** `com.yuji.dex.x`
- **Primary UI direction:** Windows-inspired desktop experience
- **Compatibility intent:** standalone replacement build (separate Android package identity)
- **Upstream baseline:** YoukiDEX, source snapshot supplied for this fork

## Build

Open this directory in Android Studio, or run `./gradlew assembleDebug` with a compatible Android SDK and JDK 17 installed.

## Fork development status

Phase 0 established the independent application identity. Phase 1 adds a Windows-inspired taskbar and searchable Start menu to the existing desktop launcher. The Start menu lists installed apps and launches them through the project’s existing launch path. Build and runtime verification remain pending because the Gradle distribution could not be downloaded in the current environment. See `PHASE_ONE_WINDOWS_SHELL.md` for scope and validation details.

## Upstream attribution and license

This project is derived from YoukiDEX. The upstream `LICENSE` file is retained unchanged. Preserve its terms and all applicable upstream copyright and attribution notices in source distributions and derivative releases.

## Planned direction

1. Windows-inspired desktop shell and advanced Start menu.
2. Arabic/RTL completion and localization audit.
3. Window manager improvements, 4/6-way tiling, transparency, and virtual desktops.
4. File manager, previews, task/performance monitor, and terminal improvements.
5. Shizuku integration hardening and a documented plugin SDK/repository.
