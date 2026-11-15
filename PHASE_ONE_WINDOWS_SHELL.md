# Yuji DEX — Phase 1: Windows-inspired shell foundation

## Implemented in this source snapshot

- Added a Windows-inspired bottom-left taskbar surface to the desktop launcher.
- Added a Start button that opens and closes a Start menu panel.
- Added an installed-app list populated through the existing `AppUtils.getInstalledApps()` path.
- Added live filtering by app label and package name.
- App rows launch through the launch broadcast path already used by desktop icons.
- Added hardware keyboard shortcuts: Meta/Windows key and Ctrl+Esc toggle Start; Back closes Start before leaving the launcher.
- Added Arabic strings for the Start menu, search, all-apps label, and empty states.
- Added dark translucent shell backgrounds and locale-based layout direction.

## Deliberately not implemented yet

- This is not a full Windows 11 clone and does not replace Android's window manager.
- The taskbar is a shell foundation, not yet a complete running-app/task-switcher bar.
- Pinned/recommended app sections, profile/power controls, taskbar customization, and animation are deferred.
- Samsung DeX mode, virtual desktops, 4/6-window tiling, and independent window transparency are not part of this phase.

## Validation

- All Android XML resources were parsed successfully after the changes (342 XML files).
- A Gradle `assembleDebug` build was attempted, but Gradle 8.11.1 could not be downloaded because `services.gradle.org` could not be resolved in the environment. Kotlin compilation, APK packaging, and device runtime behavior therefore remain unverified.

## Next phase

Build the taskbar's app/task-switcher integration and refine the Start menu layout for touch, mouse, keyboard, portrait, landscape, and RTL. Then move to window management and virtual desktops.
