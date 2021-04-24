package(
  default_visibility = ["//src/main/java/com/example/android/app:__subpackages__"],
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")

android_library(
  name = "server",
  exports = [":server_kotlin"]
)

kt_android_library(
  name = "server_kotlin",
  srcs = glob(["*.kt"]),
  deps = [
    "//src/main/java/com/example/android/app/model",
    "@maven//:com_squareup_retrofit2_retrofit",
    "@maven//:com_squareup_retrofit2_converter_gson",
  ]
)