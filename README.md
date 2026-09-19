# AimNoxZ

Legit Aim Trainer + Touch Performance Optimizer.

## Build variants

- p25Debug / p25Release
- p56Debug / p56Release
- p73Debug / p73Release
- p98Debug / p98Release

The percentage is a product/profile label only. It does not provide auto-aim, head-lock,
game injection, or modification of another game's files.

## Build

Requires JDK 17+, Android SDK with platform 35 and Android build-tools compatible with
Android Gradle Plugin 8.7.3.

Example:

    ./gradlew assembleP25Debug

Release:

    ./gradlew assembleP25Release

For publishing to Google Play, use a signed release bundle (AAB). For direct installation,
a signed APK can be produced.

## Important

The included activation screen is a UI/demo local key store. For a commercial product,
replace it with a real server-side license service before selling keys. Do not put a
master secret in the APK.


## Cloud build (recommended if AndroidIDE/Termux fails)

Upload this project to a GitHub repository. The included workflow
`.github/workflows/build.yml` can build all four debug variants on GitHub Actions.
After the workflow completes, download the `AimNoxZ-debug-apks` artifact.

For public/commercial release, create a proper release keystore and build signed
release APK/AAB files. Never commit a private keystore or signing password to the
repository.
