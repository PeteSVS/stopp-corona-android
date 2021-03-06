package at.roteskreuz.stopcorona.constants

import android.os.Build
import at.roteskreuz.stopcorona.BuildConfig

/**
 * This file contains extensions depending on the build.
 */

/**
 * Global property indicating if application is debuggable.
 */
val isDebug = BuildConfig.DEBUG

/**
 * Global property indicating if application is running in emulator device.
 */
val isEmulator = Build.FINGERPRINT?.contains("generic") ?: false

/**
 * Global property indicating if is a beta application.
 */
val isBeta = BuildConfig.BUILD_TYPE == "beta"