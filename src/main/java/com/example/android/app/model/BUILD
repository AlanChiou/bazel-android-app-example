package(
  default_visibility = ["//src/main/java/com/example/android/app:__subpackages__"],
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")

android_library(
    name = "model",
    exports = [":model_kotlin"],
)

kt_android_library(
  name = "model_kotlin",
  srcs = glob(["*.kt"]),
  deps = [
    "@maven//:com_google_code_gson_gson",
  ],
  visibility = ["//visibility:private"],
)