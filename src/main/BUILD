package(
  default_visibility = ["//:__subpackages__"],
)

# https://docs.bazel.build/versions/master/be/android.html#android_binary
android_binary(
  name = "debug_app",
  manifest = "AndroidManifest.xml",
  deps = ["//src/main/java/com/example/android/app"],
)

android_library(
  name = "common_deps",
  exports = [
    "@maven//:androidx_annotation_annotation",
  ]
)

android_library(
  name = "app_deps",
  exports = [
    ":common_deps",
    "@maven//:androidx_appcompat_appcompat",
    "@maven//:androidx_lifecycle_lifecycle_viewmodel",
    "@maven//:androidx_lifecycle_lifecycle_viewmodel_ktx",
    "@maven//:androidx_lifecycle_lifecycle_livedata_core",
    "@maven//:androidx_lifecycle_lifecycle_livedata",
    "@maven//:androidx_lifecycle_lifecycle_livedata_ktx",
    "@maven//:androidx_lifecycle_lifecycle_common_java8",
  ]
)