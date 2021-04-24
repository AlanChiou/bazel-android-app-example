package(
    default_visibility = ["//src/main:__subpackages__"],
)

android_library(
     name = "res",
     manifest = "//src/main:AndroidManifest.xml",
     resource_files = glob(["res/**"])
)

android_library(
     name = "app",
     manifest = "//src/main:AndroidManifest.xml",
     deps = [
        ":res",
        ":app_java",
        ":app_kotlin"
    ]
)

android_library(
     name = "app_java",
     manifest = "//src/main:AndroidManifest.xml",
     srcs = glob(["*.java"]),
     deps = [":res"]
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")

kt_android_library(
    name = "app_kotlin",
    manifest = "//src/main:AndroidManifest.xml",
    srcs = glob(["*.kt"]),
    deps = [":res"]
)