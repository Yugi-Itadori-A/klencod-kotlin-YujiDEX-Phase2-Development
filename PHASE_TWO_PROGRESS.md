# Yuji DEX 2.0 — Phase 2 implementation progress

This is one release milestone with independently testable work units. The source changes in this snapshot are a first implementation slice, not a claim that the full 2.0 scope is complete.

## Implemented in this slice

- Added `WindowLayoutEngine`, a centralized geometry calculator for 2x2 and 6-cell task layouts.
- Added four quarter positions (2x2).
- Added six grid positions. Landscape uses 3 columns x 2 rows; portrait uses 2 columns x 3 rows.
- Connected the new snap positions to the existing app-task context menu and existing `AppUtils.resizeTask` privileged execution/fallback path.
- Added English and Arabic labels.
- Kept the existing left/right/top/bottom snap actions intact.

## Important behavior and limitations

- A snap action resizes the selected task only. It does not automatically discover and arrange five other apps. Users can place each running task into a selected grid cell one at a time.
- Cross-app task resizing depends on the existing shell, Shizuku, or root permission path and may be restricted by the device firmware.
- The six-cell geometry is computed for the display area supplied by the existing launch-bounds calculation. Runtime behavior still needs device testing.
- No virtual desktop switching, independent window opacity, DeX-specific profile, new file manager, task manager, terminal expansion, or Plugin SDK is claimed complete in this slice.

## Remaining 2.0 scope

1. Virtual desktop data model, workspace switching UI, and task/workspace association where Android APIs permit it.
2. Window session tracking, multi-window arrangement workflow, and independent opacity only where Android window ownership permits it.
3. DeX/large-screen mode profile and external-display testing.
4. File manager and preview workflow (audit existing layouts and storage access first).
5. System center: task/resource information, thermal sensors when exposed, and terminal integration.
6. Plugin repository protocol, trust/signature model, permission boundaries, and developer SDK.
7. Full regression, Android 8–16 compatibility checks, and a successful APK build.

## Validation status

- Source-level inspection completed against the Phase 1 archive.
- XML parse and Kotlin compile/build are still required.
- No APK is declared ready until Gradle build and device tests pass.
