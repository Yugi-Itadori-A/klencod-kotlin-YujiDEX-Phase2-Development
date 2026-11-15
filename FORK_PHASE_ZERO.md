# Yuji DEX — Phase 0 baseline

## Accepted identity

- Display name: **Yuji DEX**
- Package / application ID: `com.yuji.dex.x`
- Namespace: `com.yuji.dex.x`
- Design direction: Windows-inspired
- Distribution intent: standalone replacement for the original launcher, not an in-place update

## Changes applied in this phase

- Updated Gradle `namespace` and `applicationId`.
- Migrated Kotlin package declarations and source directory from `com.youki.dex` to `com.yuji.dex.x`.
- Updated package-qualified component/provider references and secure-settings grant command references.
- Changed app display labels in localized string resources to Yuji DEX.
- Renamed the Gradle root project to YujiDEX.
- Replaced the project README with fork-specific build/status information while retaining the upstream LICENSE file.

## Important installation compatibility note

Because the selected application ID differs from the upstream `com.youki.dex`, Android treats Yuji DEX as a separate application package. It cannot perform an in-place update of the original installation. This is the correct choice for an independent fork identity; uninstalling the original is not required for package-level replacement, but app data and launcher defaults are not automatically migrated.

## Not claimed as complete

No new Windows shell, Start menu, virtual desktop engine, 4/6-window tiling, plugin SDK, or file manager has been implemented in Phase 0. Existing upstream functionality remains the baseline and requires build/runtime verification before feature work.

## Validation checklist

- [ ] No stale `com.youki.dex` package references remain in executable source/configuration.
- [ ] Android Gradle build succeeds.
- [ ] Manifest component names resolve under the new namespace.
- [ ] Debug APK installs and launches on a test device.
- [ ] Existing Shizuku, overlay, launcher, and plugin flows pass regression tests.

## Validation performed in the supplied build environment

- Parsed all 340 XML files successfully (no XML syntax errors).
- Confirmed all 136 Kotlin source files use the migrated `com.yuji.dex.x` package namespace.
- Confirmed localized `app_name` values are Yuji DEX.
- Attempted `./gradlew assembleDebug`; the wrapper could not download Gradle 8.11.1 because this environment could not resolve `services.gradle.org` (`UnknownHostException`). Therefore compilation and APK generation remain unverified; this is an environment/network limitation, not a confirmed source compilation failure.
